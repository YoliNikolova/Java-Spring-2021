public abstract class BaseCard implements Card{
    private String owner;
    private double turnOver;
    private double purchaseValue;
    private double discountRate;

    protected BaseCard(double turnOver,double purchaseValue){
        this.setTurnOver(turnOver);
        this.setPurchaseValue(purchaseValue);
        this.calculateDiscountRate();
    }

    @Override
    public String getOwner() {
        return this.owner;
    }

    @Override
    public double getPurchaseValue() {
        return this.purchaseValue;
    }

    @Override
    public double getDiscountRate() {
        return this.discountRate;
    }

    @Override
    public double getTurnOver() {
        return this.turnOver;
    }

    private void setTurnOver(double turnOver) {
        this.turnOver = turnOver;
    }

    private void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    private void setOwner(String owner) {
        this.owner = owner;
    }

    protected void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    protected void calculateDiscountRate() { }

    @Override
    public double getDiscount() {
        double discountValue = this.getPurchaseValue()*(this.getDiscountRate()/100);
        return discountValue;
    }


    @Override
    public double getTotal() {
        double totalValue = this.getPurchaseValue()-this.getDiscount();
        return totalValue;
    }

    @Override
    public String toString() {
       return String.format("Purchase value: $%.2f%nDiscount rate: %.1f%%%nDiscount: $%.2f%nTotal: $%.2f",this.getPurchaseValue(),this.getDiscountRate(),this.getDiscount(),this.getTotal());
    }
}
