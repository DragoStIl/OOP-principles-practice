package problem_01_sortByName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    	private String name;
        private List<Person> firstTeam = new ArrayList<>();
    	private List<Person> reserveTeam =  new ArrayList<>();

        public Team(String name) {
            setName(name);
        }

    private void setName(String name) {
        this.name = name;
    }

    public void addPlayer(Person player) {
            if (player.getAge() < 40){
                this.firstTeam.add(player);
            } else {
                this.reserveTeam.add(player);
            }
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }
}
