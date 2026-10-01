import java.util.Scanner;

public class Main {
    void main() {
        zadanie1();
    }
    void zadanie1() {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст");
        age = scanner.nextInt();
        scanner.nextLine();
        if (age<18){
            System.out.println("Вы несовершеннолетний");
        } else if (age>18 && age<65) {
            System.out.println("Вы взрослый");
        } else if (age>65) {
            System.out.println("Вы пенсионер");
        }
        else{
            System.out.println("Это как вообще");
        }
    }

}
