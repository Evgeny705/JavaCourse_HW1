import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, my name is Evgeny Rotar!");
        System.out.println();

        int[] myArray = new int[] {1,4,7,2,5,8,3,6,9,11};

        int sumArray = Arrays.stream(myArray).sum();
        int quantityArray = myArray.length;

        for (int j : myArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Summary: " + sumArray);
        System.out.println("Average: " + sumArray/quantityArray);
        System.out.println();

        List<Integer> myList = List.of(61,24,7,12,53,-88,36,-6,-9,-11);
        int sumList = 0;
        int quantityList = 0;

        for (Integer element: myList){
            System.out.print(element + " ");
            sumList += element;
            quantityList++;
        }
        System.out.println();
        System.out.println("Summary: " + sumList);
        System.out.println("Average: " + sumList/quantityList);

        }
    }

