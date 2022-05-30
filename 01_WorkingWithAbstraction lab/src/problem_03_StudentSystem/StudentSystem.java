package problem_03_StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> registry;

    public StudentSystem() {
        this.registry = new HashMap<>();
    }

    public Map<String, Student> getRegistry() {

        return this.registry;
    }
}
