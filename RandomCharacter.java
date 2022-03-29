import java.util.Random;
public class RandomCharacter {
    static Random r = new Random();
    public static char getRandomLowerCaseLetter() { //function to get lower case letter
        return (char) (r.nextInt(26) + 'a'); //ascii of a + number of alphabets
    }
    public static char getRandomUpperCaseLetter() { //function to get upper case letter
        return (char) (r.nextInt(26) + 'A'); //ascii of A + number of alphabets
    }
    public static char getRandomDigitCharacter() { //function to get digit character
        return (char)(r.nextInt(10)+48); //ascii of 0 + 10 total numbers from 0-9
    }

    public static String characterList = "0123456789abcdefghuijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static char getRandomCharacter() { //function to get random lower or uppercase character
        int listIndex = r.nextInt(characterList.length()); //random index of array

        return characterList.charAt(listIndex); //return element at random index
    }

    public static boolean checkPrimeNumber(int val) { //check for prime function
        boolean isPrime = true;

        if (val == 0 || val == 1) { //1 and 0 are not prime
            isPrime = false;
            return isPrime;
        }

        else {
            for (int i = 2; i <= val / 2; i++) { //if able to divide by 2, is not prime
                if (val % i == 0) {
                    isPrime = false;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        int n = 15;

        System.out.println("Lowercase letters: ");


        for (int i = 0; i < n; i++) {
            System.out.print(getRandomLowerCaseLetter() + " "); //print 15 random lower case characters
        }

        System.out.println();

        System.out.println("Uppercase: ");


        for (int i = 0; i < n; i++) {
            System.out.print(getRandomUpperCaseLetter() + " "); //print 15 random upper case characters
        }


        System.out.println();


        System.out.println("Digit: ");


        for (int i = 0; i < n; i++) {


            char digit = getRandomDigitCharacter(); //print 15 random digit characters


            boolean isPrime = checkPrimeNumber(digit - '0');


            System.out.println("Is " + digit + " a Prime Number?");

            if (isPrime == true) {
                System.out.println(digit + " : " + isPrime); //check if number is prime
            } else {

                System.out.println(digit + " : " + isPrime);            }

            System.out.println();

        }

        System.out.println("Random Character: ");
        for (int i = 0; i < n; i++) {
            System.out.print(getRandomCharacter() + " "); //print 15 random characters
        }

    }
}