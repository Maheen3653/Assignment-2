import java.util.Scanner;
import java.util.Random;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Main Menu (Assignment-2) -------");
            System.out.println("1 - Question 1 (SSN Validation)");
            System.out.println("2 - Question 2 (Major and Status)");
            System.out.println("3 - Question 3 (Plate Number Generator)");
            System.out.println("4 - Question 4 (Decimal to Binary)");
            System.out.println("5 - Question 5 (Global Warming Quiz)");
            System.out.println("0 - Exit");
            System.out.print("Enter your option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: question1(input); break;
                case 2: question2(input); break;
                case 3: question3(); break;
                case 4: question4(input); break;
                case 5: question5(input); break;
                case 0: System.out.println("Exiting... Goodbye!"); break;
                default: System.out.println("Invalid option! Please enter 0–5.");
            }

        } while (choice != 0);
    }

    public static void question1(Scanner input) {
        input.nextLine();
        System.out.println("\n--- Executing Question 1 ---");
        System.out.print("Enter a SSN (DDD-DD-DDDD): ");
        String ssn = input.nextLine();
	
	if (ssn.length() == 11 && ssn.charAt(3) == '-' && ssn.charAt(6) == '-') {
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }
    }

    public static void question2(Scanner input) {
        input.nextLine();
        System.out.println("\n--- Executing Question 2 ---");
        System.out.print("Enter two characters (Major + Year): ");
        String s = input.nextLine().toUpperCase();

        if (s.length() != 2) {
            System.out.println("Invalid input");
            return;
        }

        char major = s.charAt(0);
        char year = s.charAt(1);
        String majorName = "";
        String yearName = "";

        if (major == 'M') majorName = "Mathematics";
        else if (major == 'C') majorName = "Computer Science";
        else if (major == 'I') majorName = "Information Technology";
        else majorName = "Invalid";

        if (year == '1') yearName = "Freshman";
        else if (year == '2') yearName = "Sophomore";
        else if (year == '3') yearName = "Junior";
        else if (year == '4') yearName = "Senior";
        else yearName = "Invalid";

        if (majorName.equals("Invalid") || yearName.equals("Invalid"))
            System.out.println("Invalid input");
        else
            System.out.println(majorName + " " + yearName);
    }
	    public static void question3() {
        System.out.println("\n--- Executing Question 3 ---");
        Random rand = new Random();
        String plate = "";
        for (int i = 0; i < 3; i++) {
            char letter = (char) ('A' + rand.nextInt(26));
            plate += letter;
        }
        for (int i = 0; i < 4; i++) {
            int num = rand.nextInt(10);
            plate += num;
        }
        System.out.println("Generated Plate Number: " + plate);
    }

    public static void question4(Scanner input) {
        System.out.println("\n--- Executing Question 4 ---");
        System.out.print("Enter a decimal number: ");
        int num = input.nextInt();
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }
        System.out.println("Binary value: " + (binary.equals("") ? "0" : binary));
    }

    public static void question5(Scanner input) {
        input.nextLine();
        System.out.println("\n--- Executing Question 5 ---");
        int score = 0;

        System.out.println("1. Main greenhouse gas?\n1) Oxygen\n2) Carbon Dioxide\n3) Nitrogen\n4) Hydrogen");
        if (input.nextInt() == 2) score++;

        System.out.println("2. Main human cause?\n1) Planting trees\n2) Burning fossil fuels\n3) Fishing\n4) Recycling");
        if (input.nextInt() == 2) score++;
	        System.out.println("3. Skeptic argument?\n1) Climate change is natural\n2) Earth is flat\n3) No pollution\n4) None");
        if (input.nextInt() == 1) score++;

        System.out.println("4. Which organization studies it?\n1) NASA\n2) WHO\n3) FIFA\n4) UNO");
        if (input.nextInt() == 1) score++;

        System.out.println("5. Renewable energy?\n1) Solar\n2) Coal\n3) Oil\n4) Gas");
        if (input.nextInt() == 1) score++;

        System.out.println("\nYou got " + score + " out of 5 correct.");
        if (score == 5)
            System.out.println("Excellent!");
        else if (score == 4)
            System.out.println("Very good!");
        else
            System.out.println("Time to brush up on your knowledge of global warming!");
    }
}

