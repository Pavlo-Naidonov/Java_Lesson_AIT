package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> listNumber = getNumbers();
        System.out.println(listNumber);
        System.out.println("Сумма чисел: " + sum(listNumber));

    }

    public static List<Integer> getNumbers(){
        List<Integer> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите целые числа (0 - выход): ");
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }else {
                result.add(num);
            }
        }

        return result;
    }

    public static long sum(List<Integer>list){
        long sum = 0;
        for (Integer num : list){
            sum = sum + num;
        }

        return sum;
    }
}