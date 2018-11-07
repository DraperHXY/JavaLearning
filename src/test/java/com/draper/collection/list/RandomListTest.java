package com.draper.collection.list;

import com.draper.pojo.coffee.Cappuccino;
import com.draper.pojo.coffee.Coffee;
import com.draper.pojo.coffee.Mocha;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomListTest {

    @Test
    public void get() {
        RandomList<Coffee> coffeeRandomList = new RandomList<>();
        Coffee coffee1 = new Cappuccino();
        Coffee coffee2 = new Mocha();
        coffeeRandomList.add(coffee1);
        coffeeRandomList.add(coffee2);

        Coffee randomCoffee = coffeeRandomList.get();

        System.out.println(randomCoffee);
    }
}