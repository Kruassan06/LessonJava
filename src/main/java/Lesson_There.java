import java.util.Scanner;

public class Lesson_There {
    static Scanner scanner = new Scanner(System.in);
    public static int up;

    public static void main(String[] args) {
        ChoiceApp();

    }

    public static void ChoiceApp() {
        System.out.print("\t\tWelcome\n\nChoose one of two applications\n\nFirst app guess the number\n\nThere to choose instructions\n:");

        int choice = scanner.nextInt(4);

        switch (choice) {  // menu choice app
            case 1:
                app();
                break;
            case 2:

                break;
            case 3:
                System.out.print("App guess the number you are\ngiven a number in the range from\n1 to 9, you must guess the number\nyou will have three attempts");
                break;
            case 0:
                System.exit(0);
                break;
        }
    }

    public static void app() {
        int count = 1;
        int choiceFindNumber;

        System.out.println("Welcome my app FIND NUMBER\nEnter a number from 1 to 9 : ");

        for (int i = 0; i < 4; i++) {
            up = scanner.nextInt();
            if (count == 3) {    // Value counter

                System.out.print("\n\tYOU LOST\nWant to play again?\n 1-yes\t0-no");

                choiceFindNumber = scanner.nextInt(3);
                switch (choiceFindNumber) {
                    case 1:
                        app();
                        break;
                    case 0:
                        ChoiceApp();
                        break;
                }
            }

            if (up >= 1 && up <= 9) {

                System.out.println("Congrats you guessed the number\nWant to play again?\n 1-yes\t0-no");

                choiceFindNumber = scanner.nextInt(3);
                switch (choiceFindNumber) {
                    case 1:
                        app();
                        break;
                    case 0:
                        ChoiceApp();
                        break;
                }
            } else if (up <= 0) {
                if (count != 3) {
                    System.out.print("You guessed a smaller number, try a larger number\n:");
                    count++;
                }
            } else if (up <= 10) {
                if (count != 3) {
                    System.out.print("You guessed a larger number, try a smaller number\n:");
                    count++;
                }
            }
        }
    }
}


