package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staff extends Person implements Salary{

    String education_Awad_57036;
    String position_Awad_57036;


    public void initialize1_Awad_57036() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        initialize_Awad_57036();
        System.out.println("Enter your education:");
        education_Awad_57036 = br.readLine();
        System.out.println("Enter your position");
        position_Awad_57036 = br.readLine();

    }

    public void print1_Awad_57036(){

        print_Awad_57036();
        System.out.println("education: " + education_Awad_57036);
        System.out.println("position: " + position_Awad_57036);
    }

    @Override
    public int salaryToPay_Awad_57036(int hours, int rate) {
        return hours*rate;
    }

    @Override
    public int salaryForOvertime_Awad_57036(int overHours, int overRate) {
        return Salary.super.salaryForOvertime_Awad_57036(overHours, overRate);
    }


}


