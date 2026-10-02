import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner_oleg = new Scanner(System.in);
        while (true){
            System.out.println("Выберите задание\n 1|2");
            choice = scanner_oleg.nextInt();
            scanner_oleg.nextLine();
            switch (choice){
                case 1: zadanie1(); break;
                case 2: zadanie2(); break;
            }
        }
    }

    public static void zadanie1(){
        int vector_max;
        int num;
        String text;
        Scanner scanner_dima = new Scanner(System.in);
        System.out.println("Введите колличество чисел в вашем массиве");
        vector_max = scanner_dima.nextInt();
        scanner_dima.nextLine();
        Vector<Integer> victor = new Vector<>(vector_max);
        for (int i = 0; i < vector_max; i++){
            int n = i + 1;
            text = "Введите число " + n;
            System.out.println(text);
            num = scanner_dima.nextInt();
            victor.add(num);
        }
        int choice = 0;
        while (choice != 4){
            System.out.println("Выберите действие: 1. Посмотреть массив. 2. Добавить в массив. 3. Удалить из массива. 4. Выход");
            choice = scanner_dima.nextInt();
            scanner_dima.nextLine();
            if (choice == 1){
                text = "";
                for (int i = 0; i < victor.size(); i++) {
                    text += victor.get(i) + " ";
                }
                System.out.println(text);

            } else if (choice == 2) {
                int index;
                String value;
                String[] splitted;
                num = -1;
                text = "";
                System.out.println("Введите индекс, элемента которого вы хотите добавить, начиная с 1");
                System.out.println("Если не указать индекс, элемент добавится в конец");
                value = scanner_dima.nextLine();
                if(value.contains(",")) {
                    splitted = value.split(",");
                    index = Integer.parseInt(splitted[0]);
                    index --;
                    num = Integer.parseInt(splitted[1]);
                    victor.add(index, num);
                    System.out.println("Успешно!");
                }
                else{
                    num = Integer.parseInt(value);
                    victor.add(num);
                    System.out.println("Успешно!");
                }


            } else if (choice == 3) {
                int index;
                String value;
                num = -1;
                text = "";
                System.out.println("Введите индекс, элемента которого вы хотите удалить, начиная с 1");
                value = scanner_dima.nextLine();
                index = Integer.parseInt(value);
                index --;
                if (index > 0 && index <= victor.size()){
                    victor.remove(index);
                    System.out.println("Успешно!");
                }
                else{
                    System.out.println("Ошибка: индекс выходит за границы массива");
                }           
            }
            else{
                System.out.println("Неверный выбор!");
            }
        }
        System.out.println();
    }
    public static void zadanie2(){
        int pc_num;
        int user_num;
        int user_trys = 0;
        String text;
        Scanner scanner_roma = new Scanner(System.in);
        pc_num = (int) (Math.random()*100) + 1;
        text = "число компьютера " + pc_num;
        System.out.println(text);
        while (true) {
            user_trys ++;
            if (user_trys == 10 + 1) {
                text = "Вы исчерпали все попытки. Загаданное число было " + pc_num;
                System.out.println(text);
                System.out.println();
                break;
            }
            text = "Попытка " + user_trys + ". Введите ваш ответ:";
            System.out.println(text);
            user_num = scanner_roma.nextInt();
            if (user_num < pc_num) {
                System.out.println("Моё число больше");
                System.out.println();
            } else if (user_num > pc_num) {
                System.out.println("Моё число меньше");
                System.out.println();
            } else if (user_num == pc_num){
                text = "Поздравляю! Вы угадали за " + user_trys + " попыток";
                System.out.println(text);
                System.out.println();
                break;
            }
        }
    }   
}