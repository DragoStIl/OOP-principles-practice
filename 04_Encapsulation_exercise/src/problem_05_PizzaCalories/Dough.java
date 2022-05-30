package problem_05_PizzaCalories;

import java.util.Set;

public class Dough {


    private String type;
    private String bakingTechnique;
    private double weight;

    public Dough(String type, String bakingTechnique, double weight) {

        setType(type);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);

    }

    private void setType(String type) {
        if (!type.equals("White") && !type.equals("Wholegrain")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.type = type;
    }

    private void setBakingTechnique(String bakingTechnique) {
        boolean weKnowThisTechnique = techniquesWeKnow(bakingTechnique);
        if (!weKnowThisTechnique){
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.bakingTechnique = bakingTechnique;
    }

    private boolean techniquesWeKnow(String bakingTechnique) {
        Set<String> techniques = Set.of("Crispy", "Chewy", "Homemade");
        return techniques.contains(bakingTechnique);
    }

    private void setWeight(double weight) {
        if (weight <= 0 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        double typeModifier = 0;
        double techniqueModifier =  0;
        // TO DO -> complete the method
        //	White – 1.5;
        //	Wholegrain – 1.0;

        //	Crispy – 0.9;
        //	Chewy – 1.1;
        //	Homemade – 1.0;

        switch (this.type){
            case "White":
                typeModifier = 1.5;
                break;
            case "Wholegrain":
                typeModifier = 1;
        }

        switch (this.bakingTechnique){
            case "Crispy":
                techniqueModifier = 0.9;
                break;
            case "Chewy":
                techniqueModifier = 1.1;
                break;
            case "Homemade":
                techniqueModifier = 1;
                break;
        }


        return (weight * 2) * typeModifier * techniqueModifier;
    }
}
