package ru.geekbrains.lesson_1_java;

//1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
public class Main {
    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    public static void main(String[] args) {
       int a = 5;
       float b = 2.5f;
       float c = a * b;
       boolean d = true;
       String e = "Hello!";

    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int third (int a, int b, int c, int d ){

        return a * (b + (c / d));

    }
    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean fourth (int a, int b){
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;}
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

    public static void fifth (int number){
            number = 50;

            if (number >= 0){
                System.out.println("Число положительное");

                } else {
                System.out.println("Число отрицательное");
            }
        }
//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean sixth(int input_number){
        if (input_number < 0){
            return true;
        }
        return false;
    }

//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void seventh (String name) {
        String name = "Валентина";
        System.out.println("Привет, " + name);
    }

}