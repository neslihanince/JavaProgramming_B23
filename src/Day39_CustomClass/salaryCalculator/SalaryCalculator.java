package Day39_CustomClass.salaryCalculator;

import java.text.DecimalFormat;

public class SalaryCalculator {

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public double weeklyHours;

    public void SetInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary() * stateTaxRate;
    }

    public double federalTax(){
        return salary() * federalTax();
    }

    public double salaryAfterTax(){
        return salary() - stateTax() - federalTax();
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.000");
        return "SalaryCalculator{" +
                "salary= $" + df.format(salary()) +
                ", stateTax= $" + df.format(stateTax()) +
                ", federalTax= $" + df.format(federalTax() )+
                ", weeklyHours=" + df.format(salaryAfterTax()) +
                '}';


    }
}
