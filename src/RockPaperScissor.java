import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[]args){
        String[] options = new String[]{"R","P","S"};
        Random rand = new Random();
        int compChoice = rand.nextInt(options.length);
        String computer = options[compChoice];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice (R,P,S)");
        String user_choice = scanner.nextLine();

        options(computer, user_choice);
    }

    public static void options(String computer, String user_choice){
        if (user_choice.equalsIgnoreCase("R") && computer.equalsIgnoreCase("R")){
            System.out.println("Tie");
            System.out.println("Computer choice was:" + computer);
        }
        if (user_choice.equalsIgnoreCase("P") && computer.equalsIgnoreCase("P")){
            System.out.println("Tie");
            System.out.println("Computer choice was:" + computer);
        }

        if (user_choice.equalsIgnoreCase("S") && computer.equalsIgnoreCase("S")){
            System.out.println("Tie");
            System.out.println("Computer choice was:" + computer);
        }

        if (user_choice.equalsIgnoreCase("R") && computer.equalsIgnoreCase("P")){
            System.out.println("Computer Wins");
            System.out.println("Computer choice was:" + computer);
        }

        if (user_choice.equalsIgnoreCase("R") && computer.equalsIgnoreCase("S")){
            System.out.println("User Wins");
            System.out.println("Computer choice was:" + computer);
        }

        if (user_choice.equalsIgnoreCase("P") && computer.equalsIgnoreCase("R")){
            System.out.println("User Wins");
            System.out.println("Computer choice was:" + computer);
        }

        if (user_choice.equalsIgnoreCase("P") && computer.equalsIgnoreCase("S")){
            System.out.println("Computer Wins");
            System.out.println("Computer choice was:" + computer);
        }

        if (user_choice.equalsIgnoreCase("S") && computer.equalsIgnoreCase("P")){
            System.out.println("Computer Wins");
            System.out.println("Computer choice was:" + computer);
        }

        if (user_choice.equalsIgnoreCase("S") && computer.equalsIgnoreCase("R")){
            System.out.println("Computer Wins");
            System.out.println("Computer choice was:" + computer);
        }
    }
}
