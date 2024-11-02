package org.Census;

import java.util.ArrayList;
import java.util.List;

public class ResidentsOfHouse {


    public static int findOldestMan(List<Resident> residents) {

        int maxAge = -1;
        int index = -1;
//        List <Resident> maleResidents = residents.stream().filter(resident -> resident.getGender()==1).collect(Collectors.toList())

        for (int i = 0; i < residents.size(); i++) {
            Resident resident = residents.get(i);
            if (resident.getGender() == 1) {
                if (resident.getAge() > maxAge) {
                    maxAge = resident.getAge();
                    index = i + 1;
                }

            }
        }
        return index;
    }
    public static List<Resident> load(String nameFile){
        List<Resident> residentList = new ArrayList<>();
        return residentList;

    }
}

