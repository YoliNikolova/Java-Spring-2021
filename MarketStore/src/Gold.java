public class Gold extends BaseCard{
    public Gold(double turnover, double purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public void calculateDiscountRate() {
        int currentDiscountRate=2;
        double turnOverValue = this.getTurnOver();
        while(turnOverValue>=100 && currentDiscountRate<10){
            currentDiscountRate++;
            turnOverValue=turnOverValue-100;
        }
        setDiscountRate(currentDiscountRate);
    }
}
