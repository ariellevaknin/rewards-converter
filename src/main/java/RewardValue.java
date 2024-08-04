public class RewardValue {
  
   private double cashValue;
   private int miles; 

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        this.cashValue = miles * 0.0035;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return (int) Math.round(this.cashValue / 0.0035);
    }
}