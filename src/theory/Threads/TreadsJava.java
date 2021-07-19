package theory.Threads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class TreadsJava {

	public static void main(String[] args) {
		Thread getTime = new GetTime20(); 
		
		Runnable getMail = new GetTheMail(5);
		Runnable getMailAgain = new GetTheMail(10);
		
		getTime.start();
		
		new Thread(getMail).start(); 
		new Thread(getMailAgain).start(); 
	
		//  execusion of scheduled tasks 
		addThreadsToPool();

		

	}

	private static void addThreadsToPool() {
		
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
		
		//thread to start executing after 5 seconds and then execute every 5 seconds
		eventPool.scheduleAtFixedRate(new SystemChecksConcurrent("Mail"), 5, 5, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new SystemChecksConcurrent("Calendar"), 10, 10, TimeUnit.SECONDS);
		
		//
		System.out.println("Number of Threads: " + Thread.activeCount());

		Thread[] listOfThreads = new Thread[Thread.activeCount()];

		//record all active threads
		Thread.enumerate(listOfThreads);
		for(Thread i : listOfThreads){
			System.out.println(i.getName());
		}

		// get thread priority 
		// 10 is highest and 1 is lowest
		for(Thread i : listOfThreads){
			System.out.println(i.getPriority());
		}
		
		// threadName.setPriority can be used to set the priority

		//to stop infinite thread execusion set sleep, here sleeps in 20s
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {}
		
		// to completely stop all threads in the pool
		//eventPool.shutdown(); 
	}

}
