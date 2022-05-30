package problem_05;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {

    //•	Private field: data: ArrayList<String>
    //•	Public method: push(String item): void
    //•	Public method: pop(): String
    //•	Public method: peek(): String

    private List<String> data;

    public StackOfStrings(){
        this.data = new ArrayList<>();
    }


    public void push (String item){
        this.data.add(item);
    }

    public String pop(){
        return data.remove(data.size() - 1);
    }

    public String peek(){
        return data.get(data.size() - 1);
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }
}
