package multiThreading;

public class PrintOddEven {
	
	int count = 1;
	int MAX = 0;
	public PrintOddEven(int a) {
		MAX =a;
	}
	
	
	public void odd () {
		synchronized(this) {
			while(count<MAX) {
				if(count%2==0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Odd Thread Prints : " +count);
				count++;
				notify();
			}
		}
	}
	
	
	
	public void even() {
		synchronized(this) {
			while(count<MAX) {
				if(count%2!=0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even Thread Prints : " +count);
				count++;
				notify();
			}
		}
	}
	
	
	
	public static void main(String[] args) {

		
		PrintOddEven por = new PrintOddEven(20);
		Thread t1 = new Thread (()->por.odd());
		Thread t2 = new Thread (()->por.even());
		t1.start();
		t2.start();

	}

}
