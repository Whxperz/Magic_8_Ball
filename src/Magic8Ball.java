import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        //Responses

        String firstResponse = "Most likely";
        String secondResponse = "Outlook good";
        String thirdResponse = "Without a doubt";
        String fourthResponse = "Yes";
        String fifthResponse = "It is certain";
        String sixthResponse = "My reply is no";
        String seventhResponse = "Don't count on it";
        String eighthResponse = "Outlook not so good";
        String ninthResponse = "My sources say no";
        String tenthResponse = "Doubtful";

        //Integers

        int number;

        //Magic 8 Ball

        System.out.println("Pick a number between 1 and 100");
        number = keyboard.nextInt();
        if(number > 0 && number <=10 ) {
            System.out.println(fourthResponse);
        }
        else if(number > 10 && number <=20 )  {
            System.out.println(secondResponse);
        }
        else if(number > 20 && number <= 30 )  {
            System.out.println(thirdResponse);
        }
        else if(number > 30 && number <= 40 ) {
            System.out.println(firstResponse);
        }
        else if(number > 40 && number <= 50  ) {
            System.out.println(eighthResponse);
        }
        else if(number > 50 && number <= 60 ) {
            System.out.println(fifthResponse);
        }
        else if(number > 60 && number <= 70 )  {
            System.out.println(sixthResponse);
        }
        else if(number > 70 && number <= 80 )  {
            System.out.println(ninthResponse);
        }
        else if(number > 80 && number <= 90 )  {
            System.out.println(tenthResponse);
        }
        else if(number > 90 && number <=100  ) {
            System.out.println(seventhResponse);
        }
    }
}
