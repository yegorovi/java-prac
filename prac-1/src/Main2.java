import java.util.Scanner;

public class Main2 {
    static void main() {
        Scanner choicescanner = new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("Выберите задание\n 1|2|3");
            choice = choicescanner.nextInt();
            choicescanner.nextLine();
            //switch (choice){
            //    case 1: zadanie1();
            //    case 2: zadanie2();
            //    case 3: zadanie3();
            //}
            if (choice == 1){
                zadanie1();
            } else if (choice == 2) {
                zadanie2();
            } else if (choice == 3) {
                zadanie3();
            }
        }

    }

    static void zadanie1() {
        int age;
        int year;
        int this_year = 2026;
        Scanner yearscanner = new Scanner(System.in);
        System.out.println("Введите ваш год рождения");
        year = yearscanner.nextInt();
        yearscanner.nextLine();
        age = this_year - year;
        if (age<18){
            System.out.println("Вы несовершеннолетний");
        } else if (age>=18 && age<65) {
            System.out.println("Вы взрослый");
        } else if (age>=65) {
            System.out.println("Вы пенсионер");
        }
        else{
            System.out.println("Это как вообще");
        }
    }

    static void zadanie2 (){
        int[] number_massive = new int[10];
        Scanner number_massivescanner = new Scanner (System.in);
        System.out.println("Введите число для массива");
        for (int i = 0; i<10; i++){
            number_massive[i] = number_massivescanner.nextInt();
        }
        int chet_num = 0;
        for (int i = 0; i<10; i++){
            if (number_massive[i]%2 == 0){
                chet_num += number_massive[i];
            }
        }
        int col_num = 0;
        for (int i = 0; i<10; i++){
            if (number_massive[i]%2 != 0){
                col_num++;
            }
        }
        String text_output = "Сумма четных чисел в массиве = " + chet_num + "\n Колличество нечетных чисел в массиве: " + col_num;
        System.out.println(text_output);
    }

    static void zadanie3(){
        int step = 1;
        int max_num = 5;
        int min_num = 1;
        for (int i = min_num; i<=max_num; i += step){
            String output_line = "";
            for(int c = min_num; c<=max_num; c += step){
                int num = c * i;
                output_line += i + "*" + c + "=" + num + "|";
            }
            System.out.println(output_line);
        }
    }
}
