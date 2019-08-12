package Bin.scheduling;

import java.util.ArrayList;

import Bin.Worker;
import Bin.object.Job;
public class SampleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Add any extra data you want
		ArrayList<Worker> workerList = new ArrayList<Worker>();
		workerList.add(new Worker("Abu", 8));

		ArrayList<Job> jobList = new ArrayList<Job>();
		
		Worker w1 = new Worker("Ali", 40);
		
		boolean added = w1.addJob(new Job(10, 2, 40));
		System.out.println(added);
		
	}

}
