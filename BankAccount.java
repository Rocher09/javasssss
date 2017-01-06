package day2;

public class BankAccount {
	int balance;
	Person owner;
	
	// 파라미터 : 입금할 액수
	// 리턴 : 성공 여부 (불린)
	boolean deposit(int amount){
		return false;
	}
	
	// 파라미터 : 출금할 액수
	// 리턴: 성공여부(불린)
	boolean withdraw(int amount){
		return false;
	}
	
	// 첫번째 파라미터 : 받는사람(person)
	// 두번째 파라미터 : 이제할 금액(정수)
	// 리턴: 성공여부 (불린)
	boolean transfer(Person to, int amount){
		return false;
	}
}

