package com.company;

public class Pigeon extends Bird{

    String species_Awad_57036;

    public Pigeon(){
        species_Awad_57036 = "NN";
    }

    public Pigeon(String name_Awad_57036, int age_Awad_57036, int weight_Awad_57036, String featherColor_Awad_57036, String species_Awad_57036) {
        super(name_Awad_57036, age_Awad_57036, weight_Awad_57036, featherColor_Awad_57036);
        this.species_Awad_57036 = species_Awad_57036;
    }

    public Pigeon(int age_Awad_57036, String featherColor_Awad_57036, String species_Awad_57036) {
        super(age_Awad_57036, featherColor_Awad_57036);
        this.species_Awad_57036 = species_Awad_57036;
    }

    @Override
    public void eat(String foodName_Awad_57036) {
        System.out.println("Pigeons eat " + foodName_Awad_57036);
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
        return "Pigeon{" +
                "name_Awad_57036='" + name_Awad_57036 + '\'' +
                ", age_Awad_57036=" + age_Awad_57036 +
                ", weight_Awad_57036=" + weight_Awad_57036 +
                ", featherColor_Awad_57036='" + featherColor_Awad_57036 + '\'' +
                ", species_Awad_57036='" + species_Awad_57036 + '\'' +
                '}';
    }
}
