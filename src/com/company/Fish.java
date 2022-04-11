package com.company;

public class Fish extends Animal{

    String scalesColor_Awad_57036;

    public Fish(){
        scalesColor_Awad_57036 = "NN";
    }

    public Fish(String name_Awad_57036, int age_Awad_57036, int weight_Awad_57036, String scalesColor_Awad_57036) {
        super(name_Awad_57036, age_Awad_57036, weight_Awad_57036);
        this.scalesColor_Awad_57036 = scalesColor_Awad_57036;
    }

    public Fish(int age_Awad_57036, String scalesColor_Awad_57036) {
        super(age_Awad_57036);
        this.scalesColor_Awad_57036 = scalesColor_Awad_57036;
    }

    @Override
    public void eat(String foodName_Awad_57036) {
        System.out.println("Fish eat "+ foodName_Awad_57036);
    }

    @Override
    public String getVoice() {
        String fishVoice = "Not all Fish has sound";
        return fishVoice;
    }

    public String getScalesColor_Awad_57036() {
        return scalesColor_Awad_57036;
    }

    public void setScalesColor_Awad_57036(String scalesColor_Awad_57036) {
        this.scalesColor_Awad_57036 = scalesColor_Awad_57036;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name_Awad_57036='" + name_Awad_57036 + '\'' +
                ", age_Awad_57036=" + age_Awad_57036 +
                ", weight_Awad_57036=" + weight_Awad_57036 +
                ", scalesColor_Awad_57036='" + scalesColor_Awad_57036 + '\'' +
                '}';
    }
}
