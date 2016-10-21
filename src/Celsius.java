/**
 * Created by Tauno on 21.10.2016.
 */
import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        double cel;
        double  faren;
        Scanner in = new Scanner(System.in);

        System.out.print("enter tempersture in celsius ");
        cel = in.nextDouble();
        //double x = cel;


        faren =  (( cel * (9.0/5.0) + 32.0));
        System.out.print( cel + " C " + "= " + faren +" F");
    }
}