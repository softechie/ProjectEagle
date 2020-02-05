This is the Level 1 - Repo for entering into Project Eagle.

Refer the "pe_l1_java_learningapp" for Core and Advanced Java and "RestAPI-SpringBoot-BoilerPlate" for basic Spring boot API connecting to the RDBMS DB.

## For Running `RestAPI-SpringBoot-BoilerPlate` project, certain things needs to be available

### Setting up Couchbase
- Make sure couchbase is running in your system. it can be a docker couchbase or couchbase software, any one should be running.
- If you are using couchbase software then
  - Go to url http://localhost:8091, and create new cluster and name it as `Eagle`. Provide username as `Administrator`and password as `password`.
  - If cluster already created then continue to next step.
  - Login to the cluster using credentials username: `Administrator`, password: `password`
  - Create a new user with username same as bucket name mentioned `application.properties` file(`spring.couchbase.bucket.name`) and password as `jigsaw` and provide Full admin access.
  - Logout from Admin account and login to `skills` user account.
  - Create a new bucket and name it as `skills`.
- If you are using docker couchbase then refer [here](https://github.com/rohantarai/docker-compose-yaml-files/tree/master/couchbase)
- For first time setup, download the `couchbase.yml` file then Open Powershell and type command -> `docker-compose -f couchbase.yml up`
- From next time onwards, run `docker-compose -f couchbase.yml start`
- Go to url http://localhost:8091, and create new cluster and name it as `Eagle`. Provide username as `Administrator`and password as `password`.
- If cluster already created then continue to next step.
- Login to the cluster using credentials username: `Administrator`, password: `password`
- Create a new user with username same as bucket name mentioned `application.properties` file(`spring.couchbase.bucket.name`) and password as `jigsaw` and provide Full admin access.
- Logout from Admin account and login to `skills` user account.
- Create a new bucket and name it as `skills`.
- Thats it for setting up Couchbase.

### Setting up Postgresql
- Make sure postgresql is running in your system. it can be a docker postgresql or postgresql software, any one should be running.
- If you are using postgresql software then create a user with username: `postgres` and password: `password` in it.
- If you are using docker postgresql then refer [here](https://github.com/rohantarai/docker-compose-yaml-files/tree/master/postgres)
- For first time setup, download the `postgres.yml` file then Open Powershell and type command -> `docker-compose -f postgres.yml up`
- From next time onwards, run `docker-compose -f postgres.yml start`
- Make sure the port `5432` is exposed like this `0.0.0.0:5432->5432` so that the application can access it. run command `docker container ls -a` to check the exposed port of postgresql container.
- Thats it for setting up Postgresql.

### Setting up Mysql
- Make sure mysql is running in your system. it can be a docker mysql or mysql software, any one should be running.
- If you are using mysql software then make sure you are able to login to mysql with mysql-client with default username: `root` and password: `syntel123$`. Also Create a database and name it as `project_eagle`
- If you are using docker postgresql then refer [here](https://github.com/rohantarai/docker-compose-yaml-files/tree/master/mysql)
- For first time setup, download the `mysql.yml` file then Open Powershell and type command -> `docker-compose -f mysql.yml up`
- From next time onwards, run `docker-compose -f mysql.yml start`
- Login to the mysql container and Create a database and name it as `project_eagle`
- Make sure the port `3306` should be exposed like this `0.0.0.0:3306->3306` so that the application can access it. run command `docker container ls -a` to check the exposed port of mysql container.
- Thats it for setting up Mysql.
- Finally update the maven and Run the application.