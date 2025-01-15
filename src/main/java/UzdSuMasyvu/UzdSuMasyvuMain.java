package UzdSuMasyvu;

import com.google.common.primitives.Ints;

import java.util.List;

public class UzdSuMasyvuMain {
    public static void main(String[] args) {
        int[] ints ={5, 7, 15, 19, 29, 50};

        int max = Ints.max(ints);
        int min = Ints.min(ints);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        int checkInt = 29;

        System.out.println("Does the array contain " + checkInt + " / answer:  " + Ints.contains(ints, checkInt));

        List<Integer> intList = Ints.asList(ints);
        System.out.println("Integer list: " + intList);

        int[] intArray = Ints.toArray(intList);
        System.out.println("To Integer Array: " + Ints.join(", ", intArray));
    }
}
