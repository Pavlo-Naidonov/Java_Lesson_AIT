package hw_21;

/*
Задача 1

Дано: Массив double из 12 значений - каждое значение доход от продаж за соответствующий месяц. Ваша задача:

1.посчитать доход за весь год
2.найти месяц (номер месяца) с самым большим доходом
*/

public class Main {

    public static void main(String[] args) {

        double[] sales = {1000.0, 1500.5, 1200.0, 1300.0, 1600.0, 2000.0, 1800.0, 1700.0, 1900.0, 2100.0, 2200.0, 2500.0};

        double totalIncome = 0;
        int maxMonth = 0;
        double maxIncome = sales[0];

        for (int i = 0; i < sales.length; i++){
            totalIncome += sales[i];

            if (sales[i] > maxIncome){
                maxIncome = sales[i];
                maxMonth = i;
            }
        }

        System.out.println("Общий доход за год:" + totalIncome);
        System.out.println("Месяц с наибольшим доходом: " + (maxMonth + 1));

    }
}