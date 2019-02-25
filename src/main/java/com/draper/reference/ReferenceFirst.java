package com.draper.reference;

import java.util.ArrayList;
import java.util.List;

public class ReferenceFirst {

     private static List<String> run(List<String> stringList){
          stringList.add("a");
          stringList.add("b");
          return stringList;
     }


     public static void main(String[] args) {
          List<String> stringList = new ArrayList<>();
          System.out.println(stringList == run(stringList));

     }

}
