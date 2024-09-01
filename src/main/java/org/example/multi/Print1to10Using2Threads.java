/**
 * 
 */
package org.example.multi;

import java.util.Arrays;
import java.util.List;

/**
 *Write a java program to print 1 to 10 from arraylist using 2 threads 
 */
public class Print1to10Using2Threads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		final Object lock = new Object();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized(lock) {
					for(int i = 0; i < list.size() ; i += 2) {
						if( list.get(i) % 2  !=  0 )
						    System.out.println("Thread 1 : "+  list.get(i)); 
							lock.notify();
						try { 
							  if(i + 1 < list.size()) {
								  lock.wait();
							  }
							 
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
			
		
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized(lock) {
					for(int i = 1 ; i < list.size(); i +=2 ) {
						
					   System.out.println("Thread 2 : " + list.get(i));
					   lock.notify();
					   try {
							   if(i + 1 < list.size()) {
								   lock.wait();
							   }
							
						   
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				
						
			    }
			}
		
		});
		
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
