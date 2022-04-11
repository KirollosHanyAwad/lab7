package com.company;

    import java.io.IOException;
    import java.util.Arrays;

public class Main {

        public static void main(String[] args) throws IOException {

            Staff person1 = new Staff();
            person1.initialize1_Awad_57036();
            person1.print1_Awad_57036();

           Animal animal[] = new Animal[6];

           animal[0] = new Mammal("bobo", 2, 2, "brown");
           animal[1] = new Dog("lulifa", 2, 15,"golden", "golden retriever");
           animal[2] = new Bird("lala", 15, 1, "blue");
           animal[3] = new Pigeon("max", 30000000, 2, "red and black", "Dodo");
           animal[4] = new Fish("dom", 20, 150, "blue");
           animal[5] = new Blowfish("hanafy", 6000, 100000, "Lilac","great whale");

           System.out.println(animal[1].getVoice());
           animal[5].eat("fish");
           System.out.println(animal[4].toString());

        }

    }
