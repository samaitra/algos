package com.practice;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 30/09/13
 * Time: 5:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class HashSetTest {

    public static void main(String[] args){

        HashSet<Employee> empSet = new HashSet<>();
        empSet.add(new Employee(1,"abc"));
        System.out.println(empSet.contains(new Employee(1,"abc")));

    }

}
