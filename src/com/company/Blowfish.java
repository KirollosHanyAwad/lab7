package com.company;

public class Blowfish extends Fish{

    String species_Awad_57036;

    public Blowfish(){
        species_Awad_57036 = "NN";
    }

    public Blowfish(String name_Awad_57036, int age_Awad_57036, int weight_Awad_57036, String scalesColor_Awad_57036, String species_Awad_57036) {
        super(name_Awad_57036, age_Awad_57036, weight_Awad_57036, scalesColor_Awad_57036);
        this.species_Awad_57036 = species_Awad_57036;
    }

    public Blowfish(int age_Awad_57036, String scalesColor_Awad_57036, String species_Awad_57036) {
        super(age_Awad_57036, scalesColor_Awad_57036);
        this.species_Awad_57036 = species_Awad_57036;
    }

    @Override
    public void eat(String foodName_Awad_57036) {
        System.out.println("Blowfish eat " + foodName_Awad_57036);
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
        return "Blowfish{" +
                "name_Awad_57036='" + name_Awad_57036 + '\'' +
                ", age_Awad_57036=" + age_Awad_57036 +
                ", weight_Awad_57036=" + weight_Awad_57036 +
                ", species_Awad_57036='" + species_Awad_57036 + '\'' +
                ", scalesColor_Awad_57036='" + scalesColor_Awad_57036 + '\'' +
                '}';
    }
}
