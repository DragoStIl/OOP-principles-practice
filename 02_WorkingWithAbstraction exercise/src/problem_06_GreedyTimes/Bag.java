package problem_06_GreedyTimes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Bag {

    private long capacity;
    Map<String, List<Treasure>> wealth;


    public Bag(long capacity) {
        setCapacity(capacity);
        setWealth(wealth);

    }

    private void setWealth(Map<String, List<Treasure>> wealth) {
        wealth = new LinkedHashMap<>();
        wealth.put("Gold", new ArrayList<>());
        wealth.put("Gem", new ArrayList<>());
        wealth.put("Cash", new ArrayList<>());

    }

    private void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public void addWealth(String type, Treasure treasure) {
        if (this.capacity >= treasure.getAmount()){

        }
    }
}
