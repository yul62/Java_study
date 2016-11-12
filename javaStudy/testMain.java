package javaStudy;

public class testMain {
	public static BankAccount account = new BankAccount();

	public static void main(String[] args) {
		Thread depositMan = new Thread() {
			// 뭔가 들어가야 함
			public void run(){
				account.add(10);
			}
		};
		Thread withdrawMan = new Thread() {
			// 뭔가 들어가야 함
			public void run(){
				account.delete(10);
			}
		}; 
		depositMan.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		withdrawMan.start();
	}

}
