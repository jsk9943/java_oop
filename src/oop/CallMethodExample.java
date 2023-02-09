package oop;
/**
 * 
 * @author 김정석
 * Call by Value vs Call by reference
 *
 */
public class CallMethodExample {
	
	
	
	public void doTask(int x) {
		x += 10;
		System.out.println(x);
	}
	
	public static void doTask2(int x) {
		x += 10;
		System.out.println(x);
	}
	
	public static void doTask3(Account account2) {
		account2.setDeposit(50000);
		System.out.println(account2.getRestMoney());
	}
	
	public static void main(String[] args) {
		int y = 100;
		CallMethodExample do12 = new CallMethodExample();
		do12.doTask(y);
		
		
		System.out.println("--------------");
		
		
		
		doTask2(y);
		System.out.println(y);
				
		
		
		System.out.println("--------------");
		
		
		
		Account account = new Account("1234-5678", "김정석", 5555, 100000);
		doTask3(account);
		System.out.println(account.getRestMoney());
		System.out.println(account.getRestMoney());
		System.out.println(account.getRestMoney());
		System.out.println(account.getRestMoney());
		System.out.println(account.getRestMoney());
		doTask3(account);
		System.out.println(account.getRestMoney());
	}


}
