package com.company;

    import java.io.IOException;
    import java.util.Arrays;

public class Main {

        public static void main(String[] args) throws IOException {

            //lab7 task 1
            Staff person1 = new Staff();
            //person1.initialize1_Awad_57036();
            //person1.print1_Awad_57036();

            //lab7 task 2
           Animal animal[] = new Animal[6];

           animal[0] = new Mammal("bobo", 2, 2, "brown");
           animal[1] = new Dog("lulifa", 2, 15,"golden", "golden retriever");
           animal[2] = new Bird("lala", 15, 1, "blue");
           animal[3] = new Pigeon("max", 30000000, 2, "red and black", "Dodo");
           animal[4] = new Fish("dom", 20, 150, "blue");
           animal[5] = new Blowfish("hanafy", 6000, 100000, "Lilac","great whale");


           //System.out.println(animal[1].getVoice());
           //animal[5].eat("fish");
           //System.out.println(animal[4].toString());

           //lab 8 task 1
            System.out.println(person1.salaryToPay_Awad_57036(40, 20));
            System.out.println(person1.salaryForOvertime_Awad_57036(10, 25));
            System.out.println(Salary.bonus_Awad_57036(6));

            //lab8 task 2
            AnimalBehavior animalBehavior_Awad_57036[] = new AnimalBehavior[3];
            animalBehavior_Awad_57036[0] = new Dog("ketos", 4, 10, "black", "german shepard");
            animalBehavior_Awad_57036[1] = new Pigeon("koko", 65, 1, "lilac", "swan");
            animalBehavior_Awad_57036[2] = new Blowfish("tarazan", 30, 2, "golden", "golden fish" );

            for(Animal a : animal){
                a.move_Awad_57036();
            }

            for(Animal x : animal){
                AnimalName.name_Awad_57036(x.getName_Awad_57036());
            }
        }
    }
