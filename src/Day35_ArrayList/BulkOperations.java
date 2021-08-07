package Day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ArrayList<Integer> list = new ArrayList<>();
        //list.addAll(1,1,2,3,4,5,6,7,8,9);
        list.addAll(numbers);
        list.addAll( Arrays.asList(10,11,12,13,14,15));

        System.out.println(list);

        System.out.println("--------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Dilem", "Fhillipp", "Abbos", "Abbos", "Abbos", "Atilla", "Ekaterina", "Dilem" ));

        System.out.println(students);
        students.removeAll(Arrays.asList("Dilem", "Fhillipp", "Abbos"));
        System.out.println(students);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,3,3,1,1,1,1,1,1,1));

        System.out.println(nums);

        // nums.removeAll(Arrays.asList(1));
        nums.retainAll(Arrays.asList(1, 2)); //remove all the elements tht are not matching 1
        System.out.println(nums);

        System.out.println("--------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Dilem", "Fhilipp", "Abbos", "Ahmet", "Andrei", "Gabil", "Aliya", "Atila"));

        System.out.println(employees);

        //employees.removeAll(Arrays.asList("Ahmet", "Andrei"));

        employees.retainAll(Arrays.asList("Ahmet", "Andrei"));

        System.out.println(employees);

        System.out.println("--------------------------------------------");

        ArrayList<String> grocerylist = new ArrayList<>();

        grocerylist.addAll(Arrays.asList("Soda", "Milk", "Wine", "Beer", "Eggs", "Bread", "Water", "Apple", "Cherry"));

        //check if soda, wine, beer all of the are contained in grocerylist
        boolean r = grocerylist.containsAll(Arrays.asList("Soda", "Wine", "Beer"));

        System.out.println("r = " + r);













    }
}
