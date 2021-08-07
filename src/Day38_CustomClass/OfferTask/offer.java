package Day38_CustomClass.OfferTask;

public class offer {

    public String state, city, jobTitle;
    public double salary;
    boolean hasBenefit, WFH, hasPTO, isFullTime;

    public void setInfo(String state, String city, String jobTitle, double salary, boolean hasBenefit, boolean WFH, boolean hasPTO, boolean isFullTime) {
        this.state = state;
        this.city = city;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.WFH = WFH;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "offer{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", WFH=" + WFH +
                ", hasPTO=" + hasPTO +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
