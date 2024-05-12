package discount;

public class Liquidation implements Discountable{

    @Override
    public double getDiscount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }
}
