public class Main {

    // 128 64 32 16 8 4 2 1

    public static void main(String[] args) {
        System.out.println("Привет");
//        byte b1 = 12;
//        byte b2 = 0B1100;
//        System.out.println(b2);
        System.out.println("Hello World!");

        short s1 = -1300;  // decimal
        short s2 = -0x514;  // hexadecimal
        short s3 = -02424;  // octal
        short s4 = -0b10100010100;  // binary

        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
