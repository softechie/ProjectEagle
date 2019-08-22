package com.pe.l1.underConstruction1;

/**
 *
 */
public class Arith {
    public static void main(String[] args) {
        int x = 150;
        String y = "10";
        int z = Integer.parseInt(y);
        x = (x * 10) + z;

        byte mybytevalue = -128;
        byte mynewbytevalue = (byte) (mybytevalue/2);

        System.out.println("print mynewbytevalue:"+mynewbytevalue);

        System.out.println("x print1:" +x);

        while (x < 2000) {
            x = x * 10;
            System.out.println("x print2:" +x);
        }
        for (int i=0; i<3; i++) {
            System.out.println("x print3:" +x);
            long time = System.currentTimeMillis();
            System.gc();
            System.out.println("Took " + (System.currentTimeMillis()-time) + " ms");
            long time1 =System.nanoTime();
            System.out.println("Took " + (System.currentTimeMillis()-time1) + " ns");
        }

    }
}
