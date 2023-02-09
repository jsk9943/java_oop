package ezen.ams;

public class NotSufficientBalanceException extends Exception{
	private int errorCode;
	
	public NotSufficientBalanceException() {
		this("예기치 않은 오류가 발생", 0);
	}
	
	public NotSufficientBalanceException(String message, int errorCode) {
		super(message);	
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}
	
	
	@Override
	public String toString() {
		return errorCode + " 오류 발생, " + getMessage() + "의 이유";
	}
	
	
	
}
