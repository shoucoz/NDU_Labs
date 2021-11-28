package com.array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ////Инициализация программы
        System.out.print("Type a list of 10 numbers throw comma" + "\n");
        String arguments = s.nextLine();
        System.out.print("You typed " + arguments + "\n");

        ArrayList<Integer> initNumbers = new ArrayList<Integer>();

        String[] argumentList = arguments.split(",");
        for(int i = 0; i < argumentList.length; i ++) {
            initNumbers.add(Integer.parseInt(argumentList[i].replaceAll("\\s+","")));
        }
        System.out.print(initNumbers + "\n");
        ArrayMethods arrayMethods = new ArrayMethods(initNumbers);

        ////1 Подсчет елементов массива не больших чем число p
        System.out.print("1)Type p number" + "\n");
        Integer p = s.nextInt();
        System.out.print("You typed " + p + ". Result : ");
        System.out.print(arrayMethods.getNumberOfElements(p));
        System.out.print("\n");

        ////2 индекс максимального элемента
        System.out.print("2)Index of the biggest element : ");
        System.out.print(arrayMethods.getIndexOfBiggestNumber());
        System.out.print("\n");

        ////3 сумма элементов больше чем введенное число
        System.out.print("3)Type k number" + "\n");
        Integer k = s.nextInt();
        System.out.print("You typed " + k + ". Result : ");
        System.out.print(arrayMethods.getSumOfElementsGratesThan(k));
        System.out.print("\n");

        ////4 сумма элементов c непарнымы индексами
        System.out.print("4)Sum of an elements with unpaired index : ");
        System.out.print(arrayMethods.getSumOfElementsWithUnpairedIndex());
        System.out.print("\n");

        ////5 сумма отрицательных элементов
        System.out.print("5)Sum of a negative elements : ");
        System.out.print(arrayMethods.getSumOfNegativeElements());
        System.out.print("\n");

        ////6 количество элеменов значение которых выше среднего
        System.out.print("6)Number of elements that value grate than average in an array : ");
        System.out.print(arrayMethods.getSumOfElementsGratesThanAverage());
        System.out.print("\n");


        ////7 сумма положительных элементов
        System.out.print("7)Sum of a positive elements : ");
        System.out.print(arrayMethods.getSumOfPositiveElements());
        System.out.print("\n");

        ////8 поменять местами элементы
        arrayMethods.changeElementsOrder();


        ////9 Номера элементов с значением элемента массива
        System.out.print("9)Type element number" + "\n");
        Integer elem = s.nextInt();
        System.out.print("You typed " + elem + ". Result : ");
        System.out.print(arrayMethods.getIndexOfElements(elem));
        System.out.print("\n");

        ////10 Номер элемента приближенного к среднему значению массива
        System.out.print("10)Index of an element with value nearest the average : ");
        System.out.print(arrayMethods.getElementWithAverageIndex());
        System.out.print("\n");

        ////11 Массив с суммой елементов двух массивов
        System.out.print("11)Calculated array from few : ");
        ArrayList<Integer> firstArray = new ArrayList<Integer>();
        firstArray.add(8);
        firstArray.add(2);
        firstArray.add(4);
        ArrayList<Integer> secondArray = new ArrayList<Integer>();
        secondArray.add(8);
        secondArray.add(2);
        secondArray.add(4);
        System.out.print(arrayMethods.getCalculatedArrayFromTwoArrays(firstArray, secondArray));
        System.out.print("\n");

        ////12 уровнение y = bx
        System.out.print("12)Type constant value number" + "\n");
        Integer constant = s.nextInt();
        System.out.print("You typed " + constant + ". Result : ");
        System.out.print(arrayMethods.equation(constant));
        System.out.print("\n");

        ////13 Два массива с одного
        System.out.print("13)Two arrays from one : ");
        System.out.print(arrayMethods.createTwoArraysFromOne());
        System.out.print("\n");
    }
}
