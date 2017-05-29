package com.draper.coffee;

import com.draper.pojo.coffee.Coffee;
import com.draper.pojo.coffee.CoffeeGenerator;
import org.junit.Test;

public class CoffeeGeneratorTest {

    @Test
    public void test1(){
        CoffeeGenerator coffees = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(coffees.next());
        }
    }

    @Test
    public void test2(){
        CoffeeGenerator coffees = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(coffees.iterator().next());
        }
    }

    @Test
    public void test3(){
        CoffeeGenerator coffees = new CoffeeGenerator(5);
        for (Coffee coffee : coffees) {
            System.out.println(coffee.toString());
        }
    }

    @Test
    public void test4(){
        CoffeeGenerator coffees = new CoffeeGenerator(5);
        for (int i = 0; i < 10; i++) {
            System.out.println(coffees.next());
        }
    }

    @Test
    public void tes5(){
        CoffeeGenerator coffees = new CoffeeGenerator(5);
        for (int i = 0; i < 10; i++) {
            System.out.println(coffees.iterator().next());
        }
    }

}
