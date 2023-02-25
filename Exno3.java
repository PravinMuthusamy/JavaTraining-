package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exno3 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Inventory inv=new Inventory();
		es.execute(()->{
			Thread.currentThread().setName("Producer");
			for(int i=0;i<3;i++)
				inv.produce();
		});
		es.execute(()->{
			Thread.currentThread().setName("Consumer");
			for(int i=0;i<3;i++)
				inv.consume();
		});
		es.shutdown();

	}

}
class Inventory{
	boolean f=false;
	synchronized void produce() {
		if(f) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Produced Product");
		System.out.println("Inventory Product: 1");
		f=true;
		notify();
	}
	synchronized void consume() {
		if(!f) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumed Product");
		System.out.println("Inventory Product: 0");
		f=false;
		notify();
		
	}
}