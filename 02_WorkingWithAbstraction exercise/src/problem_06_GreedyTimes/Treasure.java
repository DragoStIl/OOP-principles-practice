package problem_06_GreedyTimes;

public class Treasure {

    private String type;
    private long amount;


    private void Treasure(String[] treasure){
        splitter(treasure);
        setType(type);
        setAmount(amount);

    }

    private void splitter(String[] treasure) {

    }

    private void setType(String type) {
        this.type = type;
    }

    private void setAmount(long amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public long getAmount() {
        return amount;
    }

}
