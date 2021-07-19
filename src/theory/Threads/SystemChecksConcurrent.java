package theory.Threads;

import java.util.concurrent.locks.ReentrantLock;


/**
 * 
 * @author greta
 * protecting code from being called at the same time
 *
 */
public class SystemChecksConcurrent implements Runnable {

	 private String checkWhat;

	 //creates the lock and protects from the other threads similar to synchronised.
	 ReentrantLock lock = new ReentrantLock(); 
	 
	 public SystemChecksConcurrent (String checkWhat){
		 this.checkWhat = checkWhat; 
	 }
	 
	 //Synchronised ensures that only one thread at time can execute the method
	 // however it seriously slows down the program
	 /* synchronized */ public void run(){
		 //alternative is to use ReentrantLock
		 
		 lock.lock(); 
		 
		 System.out.println("Checking " + this.checkWhat);
		 
		 lock.unlock();
	 }

	 
}
