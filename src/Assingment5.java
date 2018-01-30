import java.util.Scanner;

public class Assingment5 {

    public static void main(String [] args){
        Scanner a = new Scanner(System.in);
        Scanner f = new Scanner(System.in);
        Scanner L = new Scanner(System.in);
        Scanner c = new Scanner(System.in);



        System.out.println("Enter any number to change to square root ");
        double number = a.nextDouble();
        System.out.println(Math.round(Math.sqrt(number)));

        System.out.println("Enter your first name ");
        String Fname = f.next();
        System.out.println("Enter your last name ");
        String Lname = L.next();
        System.out.println("Hello Mr./Mrs "+ Lname);
        System.out.println("Enter any number character then get a binary ");

        int n = c.nextInt();

        System.out.println( Integer.parseInt(Integer.toBinaryString(n)));



    }


}
