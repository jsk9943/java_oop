package ezen.ams;

/**
 * 
 * @author 김정석
 * @date   2023. 1. 9.
 * AccountRepository 인터페이스를 구현하는 클래스
 *
 */
public class ArrayAccountRepository implements AccountRepository {
	
	
	private Account[] accounts;
	private int count;
	
	public ArrayAccountRepository() {  // 디폴트
		this(10);
	}
	
	public ArrayAccountRepository(int capacity) {
		this.accounts = new Account[capacity];
	}
	
	@Override
	public int getCount() {
		return count;
	}
	
	
	
	
	@Override
	public void addAccount(Account account) {
		accounts[count++] = account;
	}
	
	
	@Override
	public Account[] getAccounts() {
		return accounts;
	}

	@Override
	public Account findByNumber(String number) {
		Account result = null;
		for (int i = 0; i < count; i++) {
			if(accounts[i].getAccountNum().equals(number)) {
				result = accounts[i];
			} 
		}
		return result;
	}
	
	@Override
	public void allFindAccount() {
		for (int i = 0; i < count; i++) {
			System.out.println(accounts[i]);
		}
	}
	
	@Override
	public boolean removeAccount(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNum();
			if(an.equals(number)) {
				for(int j=i; j < count - 1; j++) {
					accounts[j] = accounts[j+1];
				}
				count--;
				return true;
			}
		}
		return false;
	}
	
}
