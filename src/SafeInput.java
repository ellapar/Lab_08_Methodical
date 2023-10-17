public class SafeInput {
    import java.util.Scanner;

    public class Main {

        public static Scanner testScan = new Scanner (System.in);
        public static void main(String[] args)
        {
            String firstName = "";

            firstName = getNonZeroLenString(testScan, "Enter your first name");
            System.out.println("Firstname is " + firstName);
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
    }
}
