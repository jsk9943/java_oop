package ezen.ams;

/**
 * 
 * @author 김정석
 * @date   2023. 1. 9.
 * 은행 계좌 관리(등록, 수정, 삭제, 검색)를 위한 명세(규약)
 *
 */
public interface AccountRepository {
	
//	계좌등록
	public void addAccount(Account account);
	
	
	
//	계좌조회
	public Account[] getAccounts();
	public int getCount();
	
	
	
//	계좌검색
	public Account findByNumber(String number);
	public void allFindAccount();
	
	
	
	
//	계좌삭제
	public boolean removeAccount(String number);
	
	
	
	
}
