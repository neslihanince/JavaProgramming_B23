package Day38_CustomClass.PizzaTask;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public void customOrder(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double startingPrice = (size == 'S')? 10 : (size == 'M') ? 12 : 14;
        double totalPriceOfTopping = 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        return  (startingPrice + totalPriceOfTopping) * 1.08; // including the tax
    }

    @Override
    public String toString() {
        return "pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }
}


