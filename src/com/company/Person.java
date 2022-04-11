package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {



    String surname_Awad_57036;
    String firstname_Awad_57036;
    String street_Awad_57036;
    String zip_code_Awad_57036;
    String city_Awad_57036;



    public void initialize_Awad_57036 () throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter surname:");
        surname_Awad_57036 = br.readLine();
        System.out.println("Enter your first name:");
        firstname_Awad_57036 = br.readLine();
        System.out.println("Enter your street:");
        street_Awad_57036 = br.readLine();
        System.out.println("Enter your zip code:");
        zip_code_Awad_57036 = br.readLine();
        System.out.println("Enter your city:");
        city_Awad_57036 = br.readLine();

    }


public void print_Awad_57036 (){

        System.out.println("Surname: "+ surname_Awad_57036);
        System.out.println("firstname: "+ firstname_Awad_57036);
        System.out.println("street: "+ street_Awad_57036);
        System.out.println("zip code: "+ zip_code_Awad_57036);
        System.out.println("city: "+ city_Awad_57036);

    }

}


