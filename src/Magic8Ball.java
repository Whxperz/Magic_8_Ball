import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {

    public static void main(String[]args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        //Responses

        String[] responses = {"Most likely", "Outlook good", "Without a doubt",
                "Yes", "It is certain", "My reply is no", "Don't count on it", "Outlook not so good",
                "My sources say no", "Doubtful"};

        //Integers

        int random_pickup;
        Random rand_new = new Random();
        int arrayLength = responses.length;
        String cont;
        //Magic 8 Ball
        do {
            System.out.println("Ask a question");
            String question = keyboard.nextLine();
            random_pickup = rand_new.nextInt(arrayLength) +1;
          //  System.out.println("random_pickup" + random_pickup);
            System.out.println(responses[random_pickup]);
            System.out.println("Do you want to play again Yes/No?");
            cont = keyboard.nextLine();
            } while (cont.equalsIgnoreCase("Yes"));
        }
}
