package com.array;

import java.util.ArrayList;

public class ArrayMethods {
    private ArrayList<Integer> numbersArray;

    ArrayMethods(ArrayList<Integer> numbersArray)
    {
        this.numbersArray = numbersArray;
    }

    public Integer getNumberOfElements(Integer p) {
        Integer number = 0;

        for (int i = 0; i < numbersArray.size(); i++) {
            if(numbersArray.get(i) < p) {
                number += 1;
            }
        }

        return number;
    }

    public Integer getIndexOfBiggestNumber() {
        Integer index = 0;
        Integer biggestElement = numbersArray.get(0);

        for (int i = 0; i < numbersArray.size(); i++) {
            if(numbersArray.get(i) > biggestElement) {
                biggestElement = numbersArray.get(i);
                index = i;
            }
        }

        return index;
    }

    public Integer getSumOfElementsGratesThan(Integer k) {
        Integer sum = 0;

        for (int i = 0; i < numbersArray.size(); i++) {
            if(numbersArray.get(i) > k) {
                sum += numbersArray.get(i);
            }
        }

        return sum;
    }

    public Integer getSumOfElementsWithUnpairedIndex() {
        Integer sum = 0;

        for (int i = 0; i < numbersArray.size(); i++) {
            if (i % 2 == 0) {
                //System.out.print(numbersArray.get(i));
                sum += numbersArray.get(i);
            }
        }

        return sum;
    }

    public Integer getSumOfNegativeElements() {
        Integer sum = 0;

        for (int i = 0; i < numbersArray.size(); i++) {
            if (numbersArray.get(i) < 0) {
                sum += numbersArray.get(i);
            }
        }

        return sum;
    }

    public Integer getSumOfElementsGratesThanAverage() {
        Integer sumOfAllElements = 0;
        Integer average = 0;
        Integer numberOfGratesElements = 0;
        for (int i = 0; i < numbersArray.size(); i++) {
            sumOfAllElements += numbersArray.get(i);
        }
        average = sumOfAllElements / numbersArray.size();

        for (int i = 0; i < numbersArray.size(); i++) {
            if(numbersArray.get(i) > average) {
                numberOfGratesElements += 1;
            }
        }


        return numberOfGratesElements;
    }

    public Integer getSumOfPositiveElements() {
        Integer sum = 1;

        for (int i = 0; i < numbersArray.size(); i++) {
            if (numbersArray.get(i) > 0) {
                sum *= numbersArray.get(i);
            }
        }

        return sum;
    }

    public ArrayList<Integer>  changeElementsOrder() {
        Integer firstElem = numbersArray.get(0);
        Integer lastIndex = numbersArray.size() - 1;
        Integer lastElem = numbersArray.get(lastIndex);
        numbersArray.set(0, lastElem);
        numbersArray.set(lastIndex, firstElem);

        return numbersArray;
    }

    public ArrayList<Integer>  getIndexOfElements(int p) {
        ArrayList<Integer> elementArray = new ArrayList<Integer>();

        for (int i = 0; i < numbersArray.size(); i++) {
            if (numbersArray.get(i) == p) {
                elementArray.add(i);
            }
        }

        return elementArray;
    }

    public Integer getElementWithAverageIndex() {
        int min = Integer.MAX_VALUE;
        Integer index = null;
        Integer sumOfAllElements = 0;
        Integer average = 0;

        for (int i = 0; i < numbersArray.size(); i++) {
            sumOfAllElements += numbersArray.get(i);
        }

        average = sumOfAllElements / numbersArray.size();

        for (int i = 0; i < numbersArray.size(); i++) {
            final int diff = Math.abs(numbersArray.get(i) - average);

            if (diff < min) {
                min = diff;
                index = i;
            }
        }

        return index;
    }

    public ArrayList<Integer> getCalculatedArrayFromTwoArrays(
            ArrayList<Integer> firstArray, ArrayList<Integer> secondArray
    ) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < firstArray.size(); i++) {
            result.add(firstArray.get(i) + secondArray.get(i));
        }

        return result;
    }

    public ArrayList<Integer> equation(int number) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < numbersArray.size(); i++) {
            result.add(numbersArray.get(i) + number);
        }

        return result;
    }

    public ArrayList<ArrayList<Integer>> createTwoArraysFromOne() {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> firstArray = new ArrayList<Integer>();
        ArrayList<Integer> secondArray = new ArrayList<Integer>();

        for (int i = 0; i < numbersArray.size(); i++) {
            if (i % 2 == 0) {
                //System.out.print(numbersArray.get(i));
                secondArray.add(numbersArray.get(i));
            } else {
                firstArray.add(numbersArray.get(i));
            }
        }

        result.add(firstArray);
        result.add(secondArray);

        return result;
    }
}
