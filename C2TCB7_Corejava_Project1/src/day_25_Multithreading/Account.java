package day_25_Multithreading;

public class Account {

	static int Balance=10000;
	public static void main(String[] args) {
		AClass oa=new AClass();
		
		DepositThread dt1=new DepositThread(oa, 5000,"First");
		DepositThread dt2=new DepositThread(oa, 4000,"Second");
		
		dt1.start();
		dt2.start();
		try
        {
        dt1.join();
        dt2.join();
        }
        catch(Exception e)
        {
        }
		
		WithdrawThread wt1= new WithdrawThread(oa,9000,"1st withdraw");
		
		wt1.start();
		try {
			wt1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Total balance is: "+Balance);
	}

}
