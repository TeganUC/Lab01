import java.sql.SQLOutput;
import java.util.Scanner;

public class SafeInputTest {
    public static void main(String[] args){

        //Scanner is in
        Scanner in = new Scanner(System.in);
        SafeInputObj sio = new SafeInputObj(in);

        //Test getNonZeroLenString
        String test1 = sio.getNonZeroLenString("Enter a string here");
        System.out.println(test1);

        //Test getRangedInt
        int test2 = sio.getRangedInt("Enter an int between 1 and 10",1,10);
        System.out.println(test2);

        //Test getInt
        int test3 = sio.getInt("Enter an int");
        System.out.println(test3);

        //Test getRangedDouble
        double test4 = sio.getRangedDouble("Enter a double from 1 to 10", 1, 10);
        System.out.println(test4);

        //Test getDouble
        double test5 = sio.getDouble("Enter a double");
        System.out.println(test5);

        //Test getYNConfirm
        boolean test6 = sio.getYNConfirm("Enter Y or N");
        System.out.println(test6);

        String test7 = sio.getRegExString("Enter a String starting with Hello","^Hello.*$");
        System.out.println(test7);
    }
}
