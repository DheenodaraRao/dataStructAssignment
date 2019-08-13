package Bin.scheduling;

import java.util.ArrayList;

import Bin.Worker;
import Bin.object.Job;
public class SampleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Worker w1 = new Worker("Ali", 40);
		
		System.out.println(w1.addJob(new Job(10, 2, 40)));
		System.out.println(w1.addJob(new Job(10, 3, 40)));
		System.out.println(w1.addJob(new Job(10, 5, 40)));
		
		
		for (Job job : w1.getJobList()) {
			System.out.println("Job:  "   + job.getStartDate() + "    " + job.getEndDate());
		}
		
	}

}
