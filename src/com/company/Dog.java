package com.company;

public class Dog extends Mammal implements AnimalBehavior, AnimalMove{

    String species_Awad_57036;

    public Dog(){
        species_Awad_57036 = "NN";
    }

    public Dog(String name_Awad_57036, int age_Awad_57036, int weight_Awad_57036, String skinColor_Awad_57036, String species_Awad_57036) {
        super(name_Awad_57036, age_Awad_57036, weight_Awad_57036, skinColor_Awad_57036);
        this.species_Awad_57036 = species_Awad_57036;
    }

    public Dog(int age_Awad_57036, String skinColor_Awad_57036, String species_Awad_57036) {
        super(age_Awad_57036, skinColor_Awad_57036);
        this.species_Awad_57036 = species_Awad_57036;
    }

    @Override
    public void eat(String foodName_Awad_57036) {
       System.out.println("Dogs eat "+ foodName_Awad_57036);
    }

    @Override
    public String getVoice() {
        return super.getVoice();
    }

    public String getSpecies_Awad_57036() {
        return species_Awad_57036;
    }

    public void setSpecies_Awad_57036(String species_Awad_57036) {
        this.species_Awad_57036 = species_Awad_57036;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name_Awad_57036='" + name_Awad_57036 + '\'' +
                ", age_Awad_57036=" + age_Awad_57036 +
                ", weight_Awad_57036=" + weight_Awad_57036 +
                ", species_Awad_57036='" + species_Awad_57036 + '\'' +
                ", skinColor_Awad_57036='" + skinColor_Awad_57036 + '\'' +
                '}';
    }

    @Override
    public void sleep_Awad_57036() {
        System.out.println("Dogs sleep");
    }

    @Override
    public void move_Awad_57036() {
        System.out.println("Dogs run on 4 legs");
        }

}
