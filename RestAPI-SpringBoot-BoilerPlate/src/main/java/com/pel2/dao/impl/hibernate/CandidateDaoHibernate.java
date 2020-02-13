package com.pel2.dao.impl.hibernate;

import com.pel2.encryption.AES;
import enums.EnumIsRelocate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

@Component
//@Service
public class CandidateDaoHibernate {

//    @Autowired
//    private CandidateRepository candidateRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${spring.datasource.platform}")
    private String platform;

    private static final String secretKey = "pR0!3c7-3@g13";

    public Candidate getCandidate(String id){
        String sql = "Select EMPID, NAME,STATUS,TENURE,PHONE,EMAIL,JOINING_DATE,"
                + "WORKLOC,CURRENTLOC,HOMELOC,ISRELOCATE,ROLEID,VERTICALID,ACCOUNTID"
                + " from employee where EMPID = ?";

        return jdbcTemplate.queryForObject(sql, CandidateMapper, new Integer(id));
    }

    public Iterable<Candidate> getCandidates(){
        String sql = "Select EMPID, NAME,STATUS,TENURE,PHONE,EMAIL,JOINING_DATE,WORKLOC,"
                + "CURRENTLOC,HOMELOC,ISRELOCATE,ROLEID,VERTICALID,ACCOUNTID from employee";
//        return employeeRepository.findAll();
        return jdbcTemplate.query(sql, CandidateMapper);
    }


    private static final RowMapper<Candidate> CandidateMapper = new RowMapper<Candidate>() {
        public Candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
            Candidate candidate = new Candidate();
//            employee.setEmpId(rs.getInt("EMPID"));
//            employee.setName(AES.decrypt(rs.getString("NAME"), secretKey));
//            employee.setStatus(rs.getString("STATUS"));
//            employee.setTenure(rs.getString("TENURE"));
//            employee.setPhone(decrypt(rs.getString("PHONE")));
//            employee.setEmail(decrypt(rs.getString("EMAIL")));
////            employee.setDoj(rs.getString("JOINING_DATE"));
//            employee.setWl(decrypt(rs.getString("WORKLOC")));
//            employee.setCl(decrypt(rs.getString("CURRENTLOC")));
//            employee.setHl(decrypt(rs.getString("HOMELOC")));
//            employee.setRmid(rs.getString("ISRELOCATE"));
//            employee.setRoleid(rs.getString("ROLEID"));
//            employee.setVertid(rs.getString("VERTICALID"));
//            employee.setAcctid(rs.getString("ACCOUNTID"));
            return candidate;
        }
    };

    private static final String decrypt(String value) {
        return Optional.ofNullable(value).map(x-> AES.decrypt(x, secretKey)).orElse(null);
    }
    private static final String encrypt(String value) {
        return Optional.ofNullable(value).map(x->AES.encrypt(x, secretKey)).orElse(null);
    }


    public int saveCandidate(final Candidate candidate) throws SQLException, ParseException {
        System.out.println("Query employees: platform->" + platform);
        Integer generatedId = null;
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String sql = "INSERT into employee(NAME,STATUS,TENURE,PHONE,"
                + "EMAIL,JOINING_DATE,WORKLOC,CURRENTLOC,HOMELOC,ISRELOCATE,"
                + "ROLEID,VERTICALID,ACCOUNTID) VALUES (?, CAST(? as STATUS),"
                + " ?, ?, ?, ?, ?, ?, ?, CAST(? as ISRELOCATE), ?, ?, ?)";

        Connection connection = jdbcTemplate.getDataSource().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, encrypt(candidate.getName()));
        preparedStatement.setString(2, Enum.valueOf(EnumIsRelocate.class, candidate.getStatus()).toString());
        preparedStatement.setInt(3, new Integer(candidate.getTenure()));
        preparedStatement.setString(4, encrypt(candidate.getPhone()));
        preparedStatement.setString(5, encrypt(candidate.getEmail()));
//        if(candidate.getDoj() != null)
//            preparedStatement.setDate(6, new java.sql.Date(formatter.parse(candidate.getDoj()).getTime()));
//        else
        preparedStatement.setNull(6, java.sql.Types.DATE);
        preparedStatement.setString(7, encrypt(candidate.getWl()));
        preparedStatement.setString(8, encrypt(candidate.getCl()));
        preparedStatement.setString(9, encrypt(candidate.getHl()));
        preparedStatement.setString(10,  Enum.valueOf(EnumIsRelocate.class, candidate.getRmid()).toString());
        if(candidate.getRoleid() != null)
            preparedStatement.setInt(11, new Integer(candidate.getRoleid()));
        else
            preparedStatement.setNull(11, java.sql.Types.INTEGER);
        if(candidate.getVertid() != null)
            preparedStatement.setInt(12, new Integer(candidate.getVertid()));
        else
            preparedStatement.setNull(12, java.sql.Types.INTEGER);

        if(candidate.getAcctid() != null)
            preparedStatement.setInt(13, new Integer(candidate.getAcctid()));
        else
            preparedStatement.setNull(13, java.sql.Types.INTEGER);

        preparedStatement.executeUpdate();
        ResultSet keys = preparedStatement.getGeneratedKeys();

        if(keys.next())
            generatedId = keys.getInt(1); //id returned after insert execution

        return generatedId;
    }

    public boolean updateCandidate(final Candidate candidate) throws SQLException, ParseException {
        String sql = "UPDATE employee SET NAME = ?, STATUS = CAST(? as STATUS), "
                + " TENURE = ?, PHONE = ?, EMAIL = ?, JOINING_DATE = ?, WORKLOC = ?, "
                + " CURRENTLOC = ?, HOMELOC = ?, ISRELOCATE = CAST(? AS ISRELOCATE),"
                + " ROLEID = ?, VERTICALID = ?, ACCOUNTID = ? WHERE EMPID = ?";

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        int rows = jdbcTemplate.update(sql, new Object[] {
                encrypt(candidate.getName()),
                Enum.valueOf(EnumIsRelocate.class,candidate.getStatus()).toString(),
                new Integer(candidate.getTenure()),
                encrypt(candidate.getPhone()),
                AES.encrypt(candidate.getEmail(), secretKey),
//                encrypt(candidate.getDoj()),
                encrypt(candidate.getWl()),
                encrypt(candidate.getCl()),
                encrypt(candidate.getHl()),
                Enum.valueOf(EnumIsRelocate.class, candidate.getRmid()).toString(),
                candidate.getRoleid() != null ? new Integer(candidate.getRoleid()) : null,
                Optional.ofNullable(candidate.getRoleid()).map(Integer::new).orElse(null),
                Optional.ofNullable(candidate.getVertid()).map(Integer::new).orElse(null),
                Optional.ofNullable(candidate.getAcctid()).map(Integer::new).orElse(null),
                new Integer(candidate.getEmpId())});
        return rows == 1;
    }

    public boolean deleteCandidate(String empid) throws SQLException {
        String query = "DELETE from employee where EMPID = ?";
        int rows = jdbcTemplate.update(query, new Object[] { new Integer(empid) });
        return rows == 1;
    }

}
