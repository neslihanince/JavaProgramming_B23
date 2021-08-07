package Day25_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"java", "java", "pyhton", "c#"};

        for (String each : words) {


            int count = 0;
            for (String word : words) {
                if (word.equals("java")) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each);
            }
        }

    }
}
