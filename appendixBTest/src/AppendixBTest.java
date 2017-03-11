/**
 * Created by glk on 08.03.2017.
 */
public class AppendixBTest {
    public static void main (String[] args) {


        //<editor-fold desc="compilation test">
        float value1 = 102;
        float value2 = (int)102;
//        float value3 = 1f * 0.0; // NOT COMPILE: Error:(10, 27) java: incompatible types: possible lossy conversion from double to float
        float value4 = 1f * (short)0.0;
//        float value5 = 1f * (boolean)0; // NOT COMPILE: Error:(12, 38) java: incompatible types: int cannot be converted to boolean
        //</editor-fold>

        //<editor-fold desc="string immutable">
        String s1 = "hello";
        String s2 = s1;

        s1 = "help";

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        //</editor-fold>

    }
}
