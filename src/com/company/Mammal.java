package com.company;

public class Mammal extends Animal implements AnimalMove{

    String skinColor_Awad_57036;

    public Mammal(){
        skinColor_Awad_57036 = "NN";
    }

    public Mammal(String name_Awad_57036, int age_Awad_57036, int weight_Awad_57036, String skinColor_Awad_57036) {
        super(name_Awad_57036, age_Awad_57036, weight_Awad_57036);
        this.skinColor_Awad_57036 = skinColor_Awad_57036;
    }

    public Mammal(int age_Awad_57036, String skinColor_Awad_57036) {
        super(age_Awad_57036);
        this.skinColor_Awad_57036 = skinColor_Awad_57036;
    }

    @Override
    public void eat(String foodName_Awad_57036) {
        System.out.println("Mammals eat " + foodName_Awad_57036);
    }

    @Override
    public String getVoice() {
        String mammalsVoice_Awad_57036 = "Mammals has sound";
        return mammalsVoice_Awad_57036;
    }

    public String getSkinColor_Awad_57036() {
        return skinColor_Awad_57036;
    }

    public void setSkinColor_Awad_57036(String skinColor_Awad_57036) {
        this.skinColor_Awad_57036 = skinColor_Awad_57036;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name_Awad_57036='" + name_Awad_57036 + '\'' +
                ", age_Awad_57036=" + age_Awad_57036 +
                ", weight_Awad_57036=" + weight_Awad_57036 +
                ", skinColor_Awad_57036='" + skinColor_Awad_57036 + '\'' +
                '}';
    }

    @Override
    public void move_Awad_57036() {
        System.out.println("Mammals move");
    }
}
