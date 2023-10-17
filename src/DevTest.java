import java.util.Scanner;

public class Main {

    public static Scanner testScan = new Scanner (System.in);
    public static void main(String[] args)
    {
        String firstName = "";
        int age = 0;
    /*
        firstName = getNonZeroLenString(testScan, "Enter your first name");
        System.out.println("Firstname is " + firstName);

     */
        age = getInt(testScan, "Enter your age");
        System.out.println("You said your age is: "+ age);


    }
    // Methods go here!

    /**
     * returns a String input by the user that must be at least one character
     * @param pipe the scanner to use or the input
     * @param prompt the msg for the user telling them what to input
     * @return a String of at least one character
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = "";
        do
        {
            System.out.println(prompt + " : ");
            response = pipe.nextLine();

            if(response.length() > 0)
                done = true;
            else
                System.out.println("\nYou must enter at least one character!\n");

        }while(!done);

        return response;
    }

    /**
     * gets an int val from the user with no constraints
     * @param pipe Scanner to use for the input
     * @param prompt msg to user for what to enter
     * @return any valid int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        int value = 0;

        do
        {
            System.out.println(prompt + " : ");
            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine(); // Clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number" + trash);
            }
    }while(!done);

     return
}