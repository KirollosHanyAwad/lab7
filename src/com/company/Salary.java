package com.company;

public interface Salary {

    int salaryToPay_Awad_57036(int hours, int rate);

    default int salaryForOvertime_Awad_57036(int overHours, int overRate){
        return overHours*overRate;
    }

    static boolean bonus_Awad_57036(int yearsOfExperience){
        boolean bonus = false;
        if (yearsOfExperience >= 3) { bonus = true;
        }
        return bonus;
    }
}
