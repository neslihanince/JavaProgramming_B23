package Day10_ifStatement;

public class CampusTime {
    public static void main(String[] args) {

        int campusTime = 11;
        String Time = "";

        if (campusTime >= 1 && campusTime <= 24){
            if(campusTime >= 8 && campusTime <=23 ){
                Time = "open";
            }else{
                Time = "clos";
            }
        }else{
            Time = "Invalid Time";
        }
        System.out.println("Time = " + Time);
    }
}
