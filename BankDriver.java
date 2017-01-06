package day2;

public class BankDriver {
	public static void main(String[] args) {
		// 사람 선언
		Person p1 = new Person();
		p1.name = "김신의";
		p1.age = 28;
		p1.cashAmount = 30000;
		
		//은행계좌 생성
		BankAccount a1 = new BankAccount();
		a1.balance = 100000;
		
		// 두 객체의 관계 설정
		p1.account = a1;
		a1.owner = p1;
		
		//테스트
		System.out.println(p1.name + "의 계좌 잔액 : " + p1.account.balance);
		
	}
}
