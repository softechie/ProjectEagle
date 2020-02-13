package com.pe.l1.underConstruction1;
/**
 *
 */
public class operator {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("print result = " + result);

        int prevresult = result;
        result = result - 1;
        System.out.println( "prevresult is " + result);

        prevresult = result;

        result = result * 10;
        System.out.println( "result * is " + result);

        prevresult = result;

        result = result % 3;
        System.out.println( "result % is " + result);
        prevresult = result;

        result++;

        System.out.println( "result ++ is " + result);

        result--;

        System.out.println( "result -- is " + result);

        result +=2;
        System.out.println( "result += is " + result);

        result *=2;
        System.out.println( "result *= is " + result);
        System.out.println( "prevresult *= is " + prevresult);


        boolean ispras = false;
        if (ispras == false)
            System.out.println("this is not pras");

        int topscore = 99;
        int secondbest = 80;

        if ((topscore > secondbest) && (topscore < 100) )
            System.out.println(" greater than secondbest but < 100");

        if ((topscore >90) || (secondbest<90))
            System.out.println("one of the condition is true");


        boolean iscar = true;

        //**********ternary operator*********

        boolean wascar = iscar ? true : false;
        if (wascar)
            System.out.println("wascar is true");

        double xd=20d;
        double yd=80d;

        int x = (int)((xd+yd)*25);
        System.out.println("value of x is: " + x);

        int r = x % 40;
        System.out.println("value of r is: " + r);


        if (r <= 20)
            System.out.println("total was over limit");

        double km = (100*1.609345);
        System.out.println("value of km is: " + km);
    }
}
