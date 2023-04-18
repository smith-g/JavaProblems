package org.example;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class JavaProblemsTests {

    JavaProblems javaProblems = new JavaProblems();


    @Test
    public void marsEploration(){
        assertEquals("Input: marsExploration(\"SOSTOT\")", 2, javaProblems.marsExploration("SOSTOT") );
        assertEquals("Input: marsExploration(\"SOSSPSSQSSOR\")", 3, javaProblems.marsExploration("SOSSPSSQSSOR") );
        assertEquals("Input: marsExploration(\"SOSOOSOSOSOSOSSOSOSOSOSOSOS\")", 12, javaProblems.marsExploration("SOSOOSOSOSOSOSSOSOSOSOSOSOS") );
        assertEquals("Input: marsExploration(\"OOSDSSOSOSWEWSOSOSOSOSOSOSSSSOSOSOSS\")",
                20, javaProblems.marsExploration("OOSDSSOSOSWEWSOSOSOSOSOSOSSSSOSOSOSS") );
    }

    @Test
    public void lonelyInteger(){
        assertEquals("Input: lonelyInteger(new ArrayList<Integer>(Arrays.asList(1)",
                1, javaProblems.lonelyInteger(new ArrayList<Integer>(Arrays.asList(1))));
        assertEquals("Input: lonelyInteger(new ArrayList<Integer>(Arrays.asList(0,0,1,2,1)",
                2, javaProblems.lonelyInteger(new ArrayList<Integer>(Arrays.asList(0,0 ,1, 2, 1))));
        assertEquals("Input: lonelyInteger(new ArrayList<Integer>(Arrays.asList(4, 95, 34 ,64 ,45 ,95 ,16 ,80 ,80 ,75 ,3 ,25 ,75 ,25 ,31 ,3 ,64 ,16 ,31)",
                45, javaProblems.lonelyInteger(new ArrayList<Integer>(Arrays.asList(4, 95, 34 ,64 ,45 ,95 ,16 ,80 ,80 ,75 ,3 ,25 ,75 ,25 ,31 ,3 ,64 ,16 ,31))));
        assertEquals("Input: lonelyInteger(new ArrayList<Integer>(Arrays.asList(15 ,60 ,74 ,1 ,94 ,93 ,28 ,48 ,70 ,98 ,45 ,94 ,42 ,45 ,48 ,1 ,72 ,9 ,24 ,93 ,41 ,70 ,60 ,28 ,11 ,20 ,72 ,35 ,11 ,98 ,31 ,74 ,31 ,41 ,9 ,42 ,20 ,35 ,24)",
                15, javaProblems.lonelyInteger(new ArrayList<Integer>(Arrays.asList(15 ,60 ,74 ,1 ,94 ,93 ,28 ,48 ,70 ,98 ,45 ,94 ,42 ,45 ,48 ,1 ,72 ,9 ,24 ,93 ,41 ,70 ,60 ,28 ,11 ,20 ,72 ,35 ,11 ,98 ,31 ,74 ,31 ,41 ,9 ,42 ,20 ,35 ,24))));
    }

    @Test
    public void flippingTheMatrix(){

    }

    @Test
    public void twoArrays(){}

    @Test
    public void birthday(){
        assertEquals("Input: birthday(new ArrayList<>(Arrays.asList(1, 2, 1, 3, 2)), 3, 2))", 2, javaProblems.birthday(new ArrayList<>(Arrays.asList(1, 2,1,3,2)), 3, 2));
    }

    @Test
    public void stringsXOR(){
        assertEquals("Input: stringXOR(String \"10101\", String \"00101\")", "10000", javaProblems.stringsXOR("10101", "00101") );
    }

    @Test
    public void sockMerchant() {
        assertEquals("Input: sockMerchant(1, 1, 3, 1, 2, 1, 3 , 3, 3, 3)", 4, javaProblems.sockMerchant(new ArrayList<>(Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3))));
        assertEquals("Input: sockMerchant(10, 20, 20, 10, 10, 30, 50, 10, 20)", 3, javaProblems.sockMerchant(new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20))));
        assertEquals("Input: sockMerchant(42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 " +
                "42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42 42) ", 50, javaProblems.sockMerchant(new ArrayList<>(Arrays.asList(42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42))));
    }

    @Test
    public void migratoryBirds(){
        assertEquals("input: migratoryBirds(1 ,4 ,4 ,4 ,5 ,3)", 4, javaProblems.migratoryBirds(new ArrayList<>(Arrays.asList(1 ,4 ,4 ,4 ,5 ,3))));
        assertEquals("input: migratoryBirds(1 ,2 ,3 ,4 ,5 ,4 ,3 ,2 ,1 ,3 ,4)", 3, javaProblems.migratoryBirds(new ArrayList<>(Arrays.asList(1 ,2 ,3 ,4 ,5 ,4 ,3 ,2 ,1 ,3 ,4))));

    }

    @Test
    public void maximumPerimeterTriangle(){

        assertEquals("Input: maximumPerimeterTriangle(1, 1, 1, 3, 3)",new ArrayList<>(Arrays.asList(1 ,3, 3)),
                javaProblems.maximumPerimeterTriangle(new ArrayList<>(Arrays.asList(1 ,1 ,1 ,3 ,3))));

        assertEquals("Input: maximumPerimeterTriangle(1 , 2, 3)", new ArrayList<>(Arrays.asList(-1)),
                javaProblems.maximumPerimeterTriangle(new ArrayList<>(Arrays.asList(1 , 2, 3))));

        assertEquals("Input: maximumPerimeterTriangle(1 ,1 ,1 ,2 ,3 ,5)", new ArrayList<>(Arrays.asList(-1)),
                javaProblems.maximumPerimeterTriangle(new ArrayList<>(Arrays.asList(1 , 2, 3))));
    }
}
