package problem_04;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E>{

    public E getRandomElement(){
        int end = super.size();
        Random rnd = new Random();
        int random = rnd.nextInt(end);
        return remove(random);
    }
}
