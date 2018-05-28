public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        char c = 'c';
        short s = 23561;
        int i = 3333;
        long l = 400000L;
        float f = 3.1415926F;
        double d = 54.523;

        System.out.println("Comulate byte b = " + b);
        System.out.println("Comulate char c = " + (b + c));
        System.out.println("Comulate short s = " + (b + c + s));
        System.out.println("Comulate int i = " + (b + c + s + i));
        System.out.println("Comulate long l = " + (b + c + s + i + l));
        System.out.println("Comulate float f = " + (b + c + s + i + l + f));
        System.out.println("Comulate double d = " + (b + c + s + i + l + f + d));

        System.out.println("Force long into int: " + (int) l);
        System.out.println("Force long into short: " + (short) l);
        System.out.println("Force double into int: " + (int) d);
        System.out.println("Force short into char: " + (char) s);
    }
}
