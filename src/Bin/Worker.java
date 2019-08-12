package Bin;

import java.util.LinkedList;

import Bin.object.Job;

public class Worker extends AbstractWorker {
	
	private LinkedList<Job> jobList;
	private int hoursRemaining;

	public Worker(String name, int hours) {
		super(name, hours);
		jobList = new LinkedList<Job>();
		hoursRemaining = hours;
	}
	
	public int getHoursRemaining() {
		return hoursRemaining;
	}
	
	public LinkedList<Job> getJobList(){
		return jobList;
	}
	
	public int getTaskCount() {
		return jobList.size();
	}
	
	public boolean addJob(Job job) {
		
		//joblist is empty
		if(jobList.isEmpty()) {
			jobList.add(job);
			job.setStartDate(0);
			job.setEndDate(job.getStartDate() + job.getJobDuration());
			return true;
		}
		
		//add infront of the list
		
		//add at the end of the list
		
		
		return false;
		
	}
	
	public double getWorkerUtilization() {
		double hoursRemaining = getHoursRemaining();
		double totalWorkingHours = getWorkingHours();
		
		return hoursRemaining/totalWorkingHours;
	}
	
	@Override
	public int compareTo(Worker worker) {
		return Integer.compare(this.getHoursRemaining(), worker.getHoursRemaining());
	}

}
