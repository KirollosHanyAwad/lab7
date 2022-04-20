package com.company;

abstract class Animal implements AnimalMove {

    String name_Awad_57036;
    int age_Awad_57036;
    int weight_Awad_57036;

    public Animal(){
        age_Awad_57036 = weight_Awad_57036 = 0;
        name_Awad_57036 = "NN";
    }

    public Animal(String name_Awad_57036, int age_Awad_57036, int weight_Awad_57036) {
        this.name_Awad_57036 = name_Awad_57036;
        this.age_Awad_57036 = age_Awad_57036;
        this.weight_Awad_57036 = weight_Awad_57036;
    }

    public Animal (int age_Awad_57036){this.age_Awad_57036 = age_Awad_57036;}

    public abstract void eat(String foodName_Awad_57036);

    public abstract String getVoice();

    public String getName_Awad_57036() {
        return name_Awad_57036;
    }

    public void setName_Awad_57036(String name_Awad_57036) {
        this.name_Awad_57036 = name_Awad_57036;
    }

    public int getAge_Awad_57036() {
        return age_Awad_57036;
    }

    public void setAge_Awad_57036(int age_Awad_57036) {
        this.age_Awad_57036 = age_Awad_57036;
    }

    public int getWeight_Awad_57036() {
        return weight_Awad_57036;
    }

    public void setWeight_Awad_57036(int weight_Awad_57036) {
        this.weight_Awad_57036 = weight_Awad_57036;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name_Awad_57036='" + name_Awad_57036 + '\'' +
                ", age_Awad_57036=" + age_Awad_57036 +
                ", weight_Awad_57036=" + weight_Awad_57036 +
                '}';
    }
}

