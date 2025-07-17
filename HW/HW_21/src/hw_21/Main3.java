package hw_21;

/*
Задача 3

Дан массив int. Написать программу, которыя ищет самый маленький элемент массива
и меняет его с первым элементам (т.е. с элементом с индексом 0)
Потом меняет местами второй самый маленький элемент с элементом с индексом 1.
Например: Например: {10,5,-1,4,14} -> {-1,4,10,5,14}
 */

public class Main3 {

    public static void main(String[] args){

        int[] arr = {10,5,-1,4,14};

        int minIndex1 = 0;

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[minIndex1]){
                minIndex1 = i;
            }
        }

        int temp = arr[0];
        arr[0] = arr[minIndex1];
        arr[minIndex1] = temp;

        int minIndex2 = 1;

        for (int i = 2; i < arr.length; i++){
            if (arr[i] < arr[minIndex2]){
                minIndex2 = i;
            }
        }

        temp = arr[1];
        arr[1] = arr[minIndex2];
        arr[minIndex2] = temp;

        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
