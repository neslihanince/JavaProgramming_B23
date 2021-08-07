package Day37_CustomClass;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import  java.util.Collections;

public class WarmupTask {

    public static void main(String[] args) {

        String[] names = {"Esra", "Sabir", "Raphael", "Mousa"};

        ArrayList<String> students = new ArrayList<>();

        students.addAll(Arrays.asList(names));

        System.out.println(students);

        Collections.swap(students, 0, students.size() - 1);

        System.out.println(students);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10));

        ArrayList<Integer> uniques = new ArrayList<>(list);
        uniques.removeIf(p ->Collections.frequency(uniques, p) != 1 );
        int firstUnique = uniques.get(0);

        System.out.println(uniques);
        System.out.println(firstUnique);

        System.out.println("---------------------------------------------------");

        String str = "AABBCCDDEE";
        String result = "";
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str.split("")));

        for (String each : StringUtility.removeDup(str).split("")) {
            int frequency = Collections.frequency(list2, each);
            result += each + frequency;
        }

        System.out.println(list2);
        System.out.println(result);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,10));

        ArrayList<Integer> original = new ArrayList<>(numbers);


        //Collections.sort(numbers);
        //Collections.reverse(numbers);

        //5th maximum number:
        int n = 5;
        for (int i = 1; i < n; i++) {
            numbers.removeIf(p -> p == Collections.max(numbers));
        }

        int fifthMaxNumber = Collections.max(numbers);

        System.out.println("fifthMaxNumber = " + fifthMaxNumber);



    }
}
