package loop;

public class Quiz3 {
	/*
	 	========== 문제 ==========
	 	은행에 돈을 입금한다
	 	첫날에는 10원, 둘째날에는 20원, 셋째날에는 40원
	 	이런 식으로 전날의 두배를 준비하여 30일동안 입금한다
	 	입금이 끝나면 은행에 예금된 총 금액은 얼마인지 계산하여 출력하세요
	 	출력할 때 printf()의 서식을 활요하여 천단위 구분 콤마를 찍어주세요
	 */

	public static void main(String[] args) {
		int day = 1;	// 날짜
		int bank = 0;	// 은행 계좌 금액
		long cash = 10;	// 입금 금액
		
		while(day <= 30) {
			bank += cash;
//			System.out.printf("%2d일 금액 : %,원%n", day, bank);			
			cash *= 2;
			day++;
		}
		
		System.out.printf("총 금액 : %,d원",bank);
	}
}
