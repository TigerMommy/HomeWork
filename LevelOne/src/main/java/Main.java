public class Main {

    // 128 64 32 16 8 4 2 1

    public static void main(String[] args) {
        System.out.println("Привет");
//        byte b1 = 12;
//        byte b2 = 0B1100;
//        System.out.println(b2);
        System.out.println("Hello World!");

//        short s1 = -1300;  // decimal
//        short s2 = -0x514;  // hexadecimal
//        short s3 = -02424;  // octal
//        short s4 = -0b10100010100;  // binary
//
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
//        int i1 = 0;
//        int i2 = 0x0;
//        int i3 = 00;
//        int i4 = 0b0;
//System.out.println(i4);
//        long l1 = 123456789;
//        long l2 = 0x75BCD15;
//        long l3 = 0726746425;
//        long l4 = 0b111010110111100110100010101;
//        System.out.println(l4);
//        float f1 = 2.5f;
//        float f2 = 5.6f;
//        System.out.println(f1);
//        System.out.println(f2);
        double d1 = 33.22;
        double d2 = 22.33;
        System.out.println(d1);
        System.out.println(d2);


        // %s - String, %d - digit, %f - float, double
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hello %d!!!\n", i);
        }

        //    /n   - перенос курсора на другую строку.
        System.out.printf("My name is %s!!!\n", "Pasha");
       }
}
