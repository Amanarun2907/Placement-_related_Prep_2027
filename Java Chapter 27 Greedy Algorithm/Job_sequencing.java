import java.util.ArrayList;
import java.util.Collections;

public class Job_sequencing{
    // Class 
    static class Job {
        int deadline ; 
        int profit;
        int job_id;
    public Job (int i , int p , int d){
        job_id = i;
        profit = p;
        deadline = d; 
    }
    
}

public void jobSequencing(int[] deadline, int[] profit) {
        // code here
        // You are given two arrays: deadline[], and profit[], which represent a set of jobs, where each job is associated with a deadline, and a profit. 
        // Each job takes 1 unit of time to complete, and only one job can be scheduled at a time. 
        // You will earn the profit associated with a job only if it is completed by its deadline.
        // Your task is to find the total maximum profit earned by completing those jobs
    int jobinfo [][] = new int [profit.length][2];
    
    for (int i = 0 ; i<deadline.length;i++){
        jobinfo[i][0] = deadline[i];
        jobinfo[i][1] = profit[i];
    }
    
    ArrayList <Job> jobs = new ArrayList <>();
    
    for (int i = 0 ; i<jobinfo.length;i++){
        jobs.add (new Job (i , jobinfo[i][1], jobinfo[i][0]));
    }
    
    
    Collections.sort(jobs,(a,b)-> b.profit-a.profit);
    
    
    ArrayList <Integer> seq = new ArrayList<>();
    
    
    int time = 0;
    for (int i = 0 ; i <jobs.size() ; i++){
        Job curr = jobs.get(i);
        if(curr.deadline>time ){
            seq.add(curr.job_id);
            time++;
        }
        
  
        
    }
     
    System.out.println (seq.size());
    for(int i = 0 ; i <seq.size();i++){
    System.out.print (seq.get(i)+" ");
    }
    System.out.println();
    }

    public static void main (String[]args){
        
        Job_sequencing obj = new Job_sequencing();
        int deadline [] = {4,1,1,1};
        int profit [] = {20,10,40,30};
        obj.jobSequencing(deadline,profit);

    }

}