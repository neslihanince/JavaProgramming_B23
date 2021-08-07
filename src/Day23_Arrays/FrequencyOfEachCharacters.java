package Day23_Arrays;

public class FrequencyOfEachCharacters {

    public static void main(String[] args) {

        String str = "aabccc";

        String removeDup = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(0);

            if (removeDup.contains("" + ch)) {
                continue;
            }

            removeDup += ch;
        }

        System.out.println(removeDup);

        String result = "";

        for (int j = 0; j <= removeDup.length() - 1; j++) {

            char ch = removeDup.charAt(j);
            int frequency = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                char each = str.charAt(i);
                if (each == ch) {
                    frequency++;
                }
            }

            result += "" + ch + frequency;

        }
        System.out.println(result);
    }
}