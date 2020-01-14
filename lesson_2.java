import java.util.Arrays;

public class Lesson_2 {

    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arrOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1, массив на входе: " + Arrays.toString(arrOne));
        for(int i=0; i < arrOne.length; i++) {
            
            if(arrOne[i] == 0) {
                arrOne[i] = 1;
            } else arrOne[i] = 0;
        }
        System.out.println("Массив на выходе: " + Arrays.toString(arrOne));

        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arrTwo = new int[8];
        
        for(int i = 0, j = 0; i < arrTwo.length; i++, j += 3) {
            arrTwo[i] = j;
        }
        System.out.println("\nЗадание 2, массив: " + Arrays.toString(arrTwo));

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("\nЗадание 3, массив на входе: " + Arrays.toString(arrThree));

        for(int i = 0; i < arrThree.length; i++) {
            if(arrThree[i] < 6) arrThree[i] = arrThree[i] * 2;
        }
        System.out.println("Массив на выходе: " + Arrays.toString(arrThree));

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] arrFour = new int[5][5];
        
        for(int i = 0; i < arrFour.length; i++) arrFour[i][i] = 1;

        
        System.out.println("\nЗадание 4, массив:");
       
        for (int[] ints : arrFour) {
            for (int j = 0; j < arrFour.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        
       
    }
}