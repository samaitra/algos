package com.gen;

import java.util.*;

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
        tasksList.add(new Task(4,2,11.0,11.5));
        Collections.sort(tasksList);
        System.out.println("tasksList");
        for(Task t : tasksList){
            System.out.print(t.id + " ");
        }
        System.out.println();
        System.out.println("========");
        List<Task> attendList = new ArrayList<>();
        attendList.add(tasksList.get(0));
        Task t0 = tasksList.get(0);

        for(int i=1;i<tasksList.size();i++){

            Task t = tasksList.get(i);
            if(t.startTime>=t0.endTime){
                attendList.add(t);
            }
            if(t.startTime<t0.endTime && t.priority>t0.priority){
                attendList.remove(t0);
                attendList.add(t);
            }
            t0 = t;

        }

        System.out.println("attendList");
        for(Task t : attendList){
            System.out.print(t.id+" ");
        }
    }

   public static class Task implements Comparable<Task>{

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


       @Override
       public int compareTo(Task o) {
           Double f1 = this.endTime;
           Double f2 = o.endTime;
           return f1.compareTo(f2);
          }
   }
}
