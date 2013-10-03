package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 30/09/13
 * Time: 5:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee extends Object {



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int id;
    String name;

    public Employee(int id, String name){
       this.id = id;
       this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (!name.equals(employee.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}
