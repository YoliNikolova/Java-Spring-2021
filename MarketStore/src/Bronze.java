public class Bronze extends BaseCard{
    public Bronze(double turnover, double purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public void calculateDiscountRate() {
        if(this.getTurnOver()<100){
            setDiscountRate(0.0);
        }else if(this.getTurnOver()>=100 && this.getTurnOver()<300){
            setDiscountRate(1.0);
        }else{
            setDiscountRate(2.5);
        }
    }
}
