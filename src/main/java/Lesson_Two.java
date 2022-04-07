import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson_Two {


    public static void main(String[] args) {
        int there = 3;
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] arrayThere = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] arrayFree = {{0, 0}, {0, 0}};
        int[] arrayFind = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //region Task1
        for (int x = 0; x < array.length; x++) {
            if (array[x] >= 1) {
                array[x]--;
            } else if (array[x] == 0) {
                array[x]++;
            }
            System.out.print(" " + array[x]);
        }
        //endregion
        System.out.print("\nArr :");
        //region Task2
        for (int y = 0; y < arr.length; y++) {
            arr[y] = y * 3;

            System.out.print(" " + arr[y]);
        }
//endregion
        System.out.print("\nArrayThere :");
        //region Task3
        for (int i = 0; i < arrayThere.length; i++) {
            if (arrayThere[i] < 6) {
                arrayThere[i] = arrayThere[i] * 2;
            }
            System.out.print(" " + arrayThere[i]);
        }
//endregion
        System.out.println("");
        //region Task4
        for (int i = 0; i < arrayFree.length; i++) {
            for (int y = 0; y < arrayFree[i].length; y++) {
                arrayFree[i][i] = 1;
                System.out.print(arrayFree[i][y] + "\t");
            }
            System.out.println();     // необходим для перевода значени "y"  на новую строку
        }
//endregion
        //region Task5
        for (int i = 0; i < arrayFind.length; i++) {
            Arrays.sort(arrayFind);

        }
        System.out.println("min number :" + arrayFind[0] + "\nmax number :" + arrayFind[arrayFind.length - 1]);
//endregion
    }
}