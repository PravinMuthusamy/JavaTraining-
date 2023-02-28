package day5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class EvenOdd {

	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		IterateNumbers iterator = new IterateNumbers();
		es.execute(() -> {
			iterator.toPrintEven();
			
		});
		es.execute(() -> {
			iterator.toPrintOdd();
		});
		es.shutdown();
	}

}

class IterateNumbers {
	synchronized void toPrintOdd() {
		for (int itr = 0; itr <= 100; itr++) {
			if (itr % 2 != 0) {
				System.out.print(itr + " ");
				try {
					wait();
				}catch(Exception e) {
					
				}
			}notify();
		}
		
	}

	synchronized void toPrintEven() {
		for (int itr = 0; itr <= 100; itr++) {
			if (itr % 2 == 0) {
				System.out.print(itr + " ");
				try {
					wait();
				}catch(Exception e) {
					
				}
			}notify();
		}
		

	}
}