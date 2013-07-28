package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
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
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("taskscheduling/in"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        List<Tasks> tasksList = new ArrayList<>();
        for(int i=0;i<n;i++){
            String line = bufferedReader.readLine();
            String[] pairs = line.split("\\s");
            int deadline = Integer.parseInt(pairs[0]);
            int executionTime = Integer.parseInt(pairs[1]);
            int order = deadline;
            Tasks t = new Tasks(deadline,executionTime,order);

            tasksList.add(t);

        }

        //Collections.sort(tasksList,new DeadlineComparator());

        List<Tasks> tempTaskList = new ArrayList<>();

        for(int i=0;i<n;i++){

            Tasks t = tasksList.get(i);
            tempTaskList.add(t);

            int missedDeadline = 0;


            for(int j=0;j<=i;j++){

               Collections.sort(tempTaskList,new DeadlineComparator());
                //System.out.println("tempTaskList size "+tempTaskList.size());
                //System.out.println("j "+j);
                Tasks t1 = tempTaskList.get(j);
                int deadline = t1.deadline;
                int executionTime = t1.executionTime;

                System.out.println(deadline+" "+executionTime);



                if(j==i){
                    System.out.println(Math.abs(deadline-executionTime-missedDeadline));
                    System.out.println("-------------------");

                }
                missedDeadline = missedDeadline+executionTime;



            }


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

class DeadlineComparator implements Comparator<Tasks>{
    public int compare(Tasks t1, Tasks t2){
      Integer id1 = t1.deadline;
      Integer id2 = t2.deadline;
        if(id1 == null){
            return id2 == null ? 0 : 1;
        }
        if(id2 == null){
           return -1;
        }
        return id1.compareTo(id2);

    }
}