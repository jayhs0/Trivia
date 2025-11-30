import  java.util.Scanner;
import java.util.ArrayList;

public class TriviaGame {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);


        String q1 = " ";
        do{
            System.out.println("What Sport would I have played if I did not play basketball ");
            System.out.print("Answer: ");
            q1 = sc.nextLine();
            if (q1.equalsIgnoreCase("baseball")){
                System.out.println("Correct!");

            }
            else {
                System.out.println("Incorrect, Try again!");
            }
        } while(!q1.equalsIgnoreCase("baseball"));


        String q2 = " ";

        do{
            System.out.println("What was my first job ");
            System.out.print("Answer: ");
            q2 = sc.nextLine();
            if (q2.equalsIgnoreCase("dollar tree")){
                System.out.println("Correct!");

            }
            else {
                System.out.println("Incorrect, Try again!");
            }
        } while(!q2.equalsIgnoreCase("dollar tree"));

        String q3 =" ";
        do{
            System.out.println("What is my dog's name ");
            System.out.print("Answer: ");
            q3 = sc.nextLine();
            if (q3.equalsIgnoreCase("duke")){
                System.out.println("Correct!");

            }
            else {
                System.out.println("Incorrect, Try again!");
            }
        } while(!q3.equalsIgnoreCase("duke"));

        String q4 = " ";
        do{
            System.out.println("What is my full birthday (In this format, MM/DD/YYYY)");
            System.out.print("Answer: ");
            q4 = sc.nextLine();
            if (q4.equalsIgnoreCase("01/10/2005")){
                System.out.println("Correct!");

            }
            else {
                System.out.println("Incorrect, Try again!");
            }
        } while(!q4.equalsIgnoreCase("01/10/2005"));

        String q5 = " ";
        do{
            System.out.println("Have I been to Mexico (Yes or No)");
            System.out.print("Answer: ");
            q5 = sc.nextLine();
            if (q5.equalsIgnoreCase("Yes")){
                System.out.println("Correct!");

            }
            else {
                System.out.println("Incorrect, Try again!");
            }
        } while(!q5.equalsIgnoreCase("Yes"));

        String q6 = " ";
        do{
            System.out.println("What is my favorite food");
            System.out.print("Answer: ");
            q6 = sc.nextLine();
            if (q6.equalsIgnoreCase("Burger")|| q6.equalsIgnoreCase("Burgers")){
                System.out.println("Correct!");

            }
            else {
                System.out.println("Incorrect, Try again!");
            }
        } while(!q6.equalsIgnoreCase("Burger") && !q6.equalsIgnoreCase("Burgers"));

        String q7 = " ";
        do{
            System.out.println(" ");
            System.out.print("Answer: ");
            q7 = sc.nextLine();
            if (q7.equalsIgnoreCase("Yes")){
                System.out.println("Correct!");

            }
            else {
                System.out.println("Incorrect, Try again!");
            }
        } while(!q7.equalsIgnoreCase("Yes"));





    }
}
