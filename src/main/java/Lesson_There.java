import java.util.Random;
import java.util.Scanner;

public class Lesson_There {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ChoiceApp();

    }

    //todo Need add random
    public static void ChoiceApp() {
        System.out.print("\n\n\t\tWelcome\n\nChoose one of two applications\n\nFirst app guess the number\n\nThere to choose instructions\n:");

        int choice = scanner.nextInt(4);

        switch (choice) {  // menu choice app
            case 1:
                app();
                break;
            case 2:
                AppFindWord();
                break;
            case 3:
                System.out.print("""
                        App guess the number you are
                        given a number in the range from
                        1 to 9, you must guess the number
                        you will have three attempts

                        When you start the application,\s
                        it makes up a word, you need to guess it,\s
                        i play until you guess the word.\s
                        After each wrong word, the program will prompt you""");
                ChoiceApp();
                break;
            case 0:
                scanner.close();
                System.exit(0);
                break;
        }
    }

    public static void app() {
        int count = 0;
        int choiceFindNumber;
        System.out.println("Welcome my app FIND NUMBER\nEnter a number from 1 to 9 : ");
        for (int i = 0; i < 4; i++) {
            if (count == 3) {    // Value counter

                System.out.print("\n\tYOU LOST\nWant to play again?\n 1-yes\t0-no");

                choiceFindNumber = scanner.nextInt(3);
                scanner.nextLine();
                switch (choiceFindNumber) {
                    case 1 -> app();
                    case 0 -> ChoiceApp();
                }
            }

            int up = scanner.nextInt();
            int rand = random.nextInt(1, 9);
            if (up == rand) {

                System.out.println("Congrats you guessed the number\nWant to play again?\n 1-yes\t0-no");

                choiceFindNumber = scanner.nextInt(3);
                switch (choiceFindNumber) {
                    case 1 -> app();
                    case 0 -> ChoiceApp();
                }
            } else if (up < rand) {
                count++;
                if (count != 3) {
                    System.out.print("You guessed a smaller number, try a larger number\n:");
                }
            } else if (up > rand) {
                count++;
                if (count != 3) {
                    System.out.print("You guessed a larger number, try a smaller number\n:");
                }
            }
        }
    }

    public static void AppFindWord() {
        System.out.print("Welcome my app Find word\n\nEnter the word: ");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int rand = random.nextInt(words.length);
        String storage = words[rand];
        char prompt = storage.charAt(0);
        char prompt1 = storage.charAt(1);
        char prompt2;
        prompt2 = '#';

        String choiceWord = scanner.next();
        for (; ; ) {
            if (choiceWord.equals(words[rand])) {
                System.out.print("Congratulations, you've won. \nTou guessed the word! \nWand to play again?\nyes - game replay\n:");
                choiceWord = scanner.next();
                if (choiceWord.equals("yes")) {
                    AppFindWord();
                } else {
                    break;
                }
            } else if (!choiceWord.equals(words[rand])) {
                System.out.print("You didn't guess, here's a hint. \nTry again!\n" + prompt +
                        prompt1 + prompt2 + prompt2 + prompt2 + prompt2 +
                        prompt2 + prompt2 + prompt2 + prompt2 + prompt2 +
                        prompt2 + prompt2 + prompt2 + prompt2 + prompt2 +
                        prompt2 + prompt2 + "\n");
                choiceWord = scanner.next();
            }
        }
        ChoiceApp();
    }
}


