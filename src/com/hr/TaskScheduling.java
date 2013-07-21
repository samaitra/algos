package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 7/15/13
 * Time: 10:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class TaskScheduling {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("taskscheduling/in"));
        int n = Integer.parseInt(bufferedReader.readLine());
        for(int i=0;i<n;i++){
            String line = bufferedReader.readLine();
            String[] pairs = line.split("\\s");
            int deadline = Integer.parseInt(pairs[0]);

        }


    }
}

class Tasks{
    int deadline;
    int executionTime;
    int order;

    Tasks(int deadline, int executionTime) {
        this.deadline = deadline;
        this.executionTime = executionTime;
    }

    Tasks(int deadline, int executionTime, int order) {
        this.deadline = deadline;
        this.executionTime = executionTime;
        this.order = order;
    }
    int getDeadline() {
        return deadline;
    }

    void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    int getExecutionTime() {
        return executionTime;
    }

    void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    int getOrder() {
        return order;
    }

    void setOrder(int order) {
        this.order = order;
    }

}