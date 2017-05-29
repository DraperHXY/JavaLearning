package com.draper.util;

import com.draper.collection.Generators;
import com.draper.pojo.coffee.Coffee;
import com.draper.pojo.coffee.CoffeeGenerator;
import org.junit.Test;

import java.util.*;

public class GeneratorsTest {

    @Test
    public void test1() throws IllegalAccessException, InstantiationException {
        Collection<Coffee> coffees = Generators.fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 5);

        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }

    }

    @Test
    public void test2() throws IllegalAccessException, InstantiationException {
        Collection<Coffee> coffees = Generators.fill(new HashSet<Coffee>(), new CoffeeGenerator(), 5);

        for (Coffee coffee : coffees) {
            System.out.println(coffee);
        }

    }

    @Test
    public void test3() throws IllegalAccessException, InstantiationException {
        Map<Integer,Coffee> coffees = Generators.fill(new HashMap<Integer,Coffee>(), new CoffeeGenerator(), 5);

        for (int i = 0; i < coffees.size(); i++) {
            System.out.println(coffees.get(i));
        }
    }
}
