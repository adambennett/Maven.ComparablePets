package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {

    @Test
    public void TestSorting() {
        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Pet> petsTest = new ArrayList<>();
        pets.add(new Fish("Nemo"));
        pets.add(new Dog("Nemo"));
        pets.add(new Fish("Nemo"));
        pets.add(new Cat("Nemo"));
        petsTest.add(new Cat("Nemo"));
        petsTest.add(new Dog("Nemo"));
        petsTest.add(new Fish("Nemo"));
        petsTest.add(new Fish("Nemo"));
        Collections.sort(pets);
        boolean actual = true;
        for (int i = 0; i < pets.size(); i++) {
            if (!petsTest.get(i).toString().equals(pets.get(i).toString())) {
                actual = false;
            }
        }
        Assert.assertTrue(actual);


    }

}
