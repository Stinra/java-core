import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите число");
        int x = s.nextInt();
        System.out.println("вы ввели: " + x);
        System.out.println("введите второе число");
        int y = s.nextInt();
        System.out.println("вы ввели: " + y);
        int result = x * y;
        System.out.println("ваш результат: " + result);

    }




}
