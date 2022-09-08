public class Apple extends Phone {


    public Apple(String model, int year, int price) {
        super(model, price, year);
    }


    @Override
    public void print() {
        System.out.println("Model: " + getModel() + ", year: " + getYear() +
                ", price: " + getPrice() + "$");
    }
}
