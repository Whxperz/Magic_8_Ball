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
        int firstNumber = 1;
        int secondNumber = 11;
        int thirdNumber = 21;
        int fourthNumber = 31;
        int fifthNumber = 41;
        int sixthNumber = 51;
        int seventhNumber = 61;
        int eighthNumber = 71;
        int ninthNumber = 81;
        int tenthNumber = 91;
        int eleventhNumber = 100;


   //Magic 8 Ball

        System.out.println("Pick a number between 1 and 100");
        number = keyboard.nextInt();
        if(firstNumber<=number){
            System.out.println(fourthResponse);
        }
        else if(secondNumber<=number) {
            System.out.println(secondResponse);
        }
        else if(thirdNumber<=number) {
            System.out.println(thirdResponse);
        }
        else if(fourthNumber<=number) {
            System.out.println(firstResponse);
        }
        else if(fifthNumber<=number) {
            System.out.println(eighthResponse);
        }
        else if(sixthNumber<=number) {
            System.out.println(fifthResponse);
        }
        else if(seventhNumber<=number) {
            System.out.println(sixthResponse);
        }
        else if(eighthNumber<=number) {
            System.out.println(ninthResponse);
        }
        else if(ninthNumber<=number) {
            System.out.println(tenthResponse);
        }
        else if(tenthNumber<=number) {
            System.out.println(secondResponse);
        }
        else if(eleventhNumber<=number) {
            System.out.println(seventhResponse);
        }
    }
}
