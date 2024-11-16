public class Main {
    public static void main(String[] args) {
        // --- PRINTING AND COMMENTING

        System.out.println("Print with a new line statement.");
        System.out.print("Print with an new line escape sequence.\n");
        System.out.println("Print with \"other\" escape\tsequences.");

        // Single line comment.

        /*
        Multi
        Line
        Comment.
         */

        // --- VARIABLES

        /*
        Data Types in Java
          >>boolean primitive   t or f
            byte    primitive   -128 to 127
            short   primitive   -32k to 32k
          >>int     primitive   -2 bill to 2 bill
            long    primitive   -9 quantill to 9 quantill

            float   primitive   fractional up to 6-7 digits, uses f
          >>double  primitive   fractional up to 15 digits

          >>char    primitive   single char/letter/ASCII, uses ''
          >>String  reference   char sequence, uses ""

         Primitive vs Reference
            limited    vs  user defined
            data       vs  address
            1 value    vs  can hold multiple values
            - memory   vs  + memory
            fast       vs  slower
         */

        /*
            int int_var;        // declaration
            int_var = 123;      // assignment
        */

        int int_var = 123;  // initialization
        long lg_var = 1234566532457632575L;
        byte bt_var = 127;
        float flt_var = 3.041f;
        double dbl_var = 123.01;
        boolean bl_var = false;
        char chr_var = '@';
        String str_var = "Aloha";

        System.out.println(str_var + " " + chr_var + "Guille");

        // --- SWAPPING VARIABLES

        String x = "water";     // declare
        String y  = "wine";
        String temp;            // initialize

        System.out.println(x + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println(x + y);
    }
}