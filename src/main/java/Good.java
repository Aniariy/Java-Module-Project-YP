public class Good {
    private String name;
    private double price;

    public void print() {
        String rubles = Format.rublFormat(price);
        System.out.println(String.format("%s %.2f %s", name, price, rubles));
    }

    public Good(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
