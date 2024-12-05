import java.util.Scanner;
public class SpellingBee {
    public static void main(String[] args) {
        int Letters_Entered = 6;
        char x;
        Boolean Guess_Valid = false;
        Scanner SB = new Scanner(System.in);
        System.out.println("Enter Middle Letter");
        do {
            String Middle_letter = SB.nextLine();
            System.out.println("Enter The Other Letters");
            String letters = SB.nextLine();
            System.out.println("Enter a Letter With at Least 4 Letters or Type x To Exit");
            String Guess = SB.nextLine();
            if (Guess.length() < 4) {
                System.out.println("Not Valid");
            }{ if (Guess.contains(letters))
                if (Guess.contains(Middle_letter))
                    System.out.println("Valid Guess");
                if (Middle_letter != letters)
                    System.out.println("Not Valid");}
            if (Guess_Valid.equals("x")) ;
            break;
        }  while(Guess_Valid = false); {

        }


    }}
