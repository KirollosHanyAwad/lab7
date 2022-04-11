package com.company;

public class Bird extends Animal{
    String featherColor_Awad_57036;

    public Bird(){
        featherColor_Awad_57036 = "NN";
    }

    public Bird(String name_Awad_57036, int age_Awad_57036, int weight_Awad_57036, String featherColor_Awad_57036) {
        super(name_Awad_57036, age_Awad_57036, weight_Awad_57036);
        this.featherColor_Awad_57036 = featherColor_Awad_57036;
    }

    public Bird(int age_Awad_57036, String featherColor_Awad_57036) {
        super(age_Awad_57036);
        this.featherColor_Awad_57036 = featherColor_Awad_57036;
    }

    @Override
    public void eat(String foodName_Awad_57036) {
        System.out.println("Birds eat " + foodName_Awad_57036);
    }

    @Override
    public String getVoice() {
        String birdVoice_Awad_57036 = "Birds has sound";
        return birdVoice_Awad_57036;
    }

    public String getFeatherColor_Awad_57036() {
        return featherColor_Awad_57036;
    }

    public void setFeatherColor_Awad_57036(String featherColor_Awad_57036) {
        this.featherColor_Awad_57036 = featherColor_Awad_57036;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name_Awad_57036='" + name_Awad_57036 + '\'' +
                ", age_Awad_57036=" + age_Awad_57036 +
                ", weight_Awad_57036=" + weight_Awad_57036 +
                ", featherColor_Awad_57036='" + featherColor_Awad_57036 + '\'' +
                '}';
    }
}
