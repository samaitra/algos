package com.gen;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/22/13
 * Time: 10:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class TaskSchedule {

    public static void main(String[] args){
        List<Task> tasksList = new ArrayList<Task>();
        tasksList.add(new Task(1,1,9.0,10.0));
        tasksList.add(new Task(2,1,10.5,11.0));
        tasksList.add(new Task(3,1,11.0,11.5));
        tasksList.add(new Task(4,1,10.0,11.0));


        HashSet<Task> attendList = new HashSet<>();
        for(Task t : tasksList){

            for(Task t2 : tasksList){
                if(t.id!=t2.id & !attendList.contains(t2)){
                    if(t2.startTime>=t.endTime){
                       attendList.add(t);
                       attendList.add(t2);
                    }if(t2.startTime<t.endTime){
                        if(t.priority>=t2.priority){
                            attendList.add(t);
                        }
                        else{
                            attendList.add(t2);
                        }
                    }




                }
            }


        }


        for(Task at : attendList){
            System.out.println(at.id);
        }



    }

   static class Task{

        int id;
        int priority;
        double startTime;
        double endTime;

        private Task(int id,int priority, double startTime, double endTime){
            this.id = id;
            this.priority = priority;
            this.startTime = startTime;
            this.endTime = endTime;
        }

    }
}
