package discount;

public class Discount implements Discountable{

    @Override
    public double getDiscount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}
