public class Silver extends BaseCard{
    public Silver(double turnover, double purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public void calculateDiscountRate() {
        if(this.getTurnOver()>300){
            setDiscountRate(3.5);
        }else{
            setDiscountRate(2.0);
        }
    }
}
