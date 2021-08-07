package Day11_switch;

public class NestedIfPractice {

    public static void main(String[] args) {

        String batchType = "US morning";
        boolean isValid = batchType == "US morning" || batchType == "US evening" || batchType == "EU";
        String result = "";

        if(isValid){
            if(batchType == "US morning"){
                result = "10am-5pm EST. M, T, Th, F";
            }else if(batchType == "US evening"){
                result = "7pm-10pm EST. M, T, W, Th, F";
            }else{
                result = "10am-5pm EST. M, T, W, Th, F";
            }

        }else{
            result = "Invalid Batch";
        }
        System.out.println("result = " + result);

    }
}
