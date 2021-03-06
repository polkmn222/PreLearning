
public class ForTest {

	public static void main(String[] args) {
		
//		증감 연산자: ++(1증가), --(1감소) => 단항 연산자
//		a++: 사용후 1증가, a에 저장된 값을 사용하고 ";"를 만나 문장이 종료될 때 1증가
//		시킨다.
//		++a: 1증가 후 사용, a에 저장된 값을 1증가 시키고 사용한다.
//		a--: 사용후 1감소, a에 저장된 값을 사용하고 ";"를 만나 문장이 종료될 때 1감소
//		시킨다.
//		--a: 1감소 후 사용, a에 저장된 값을 1감소 시키고 사용한다.
		
		int a = 1, b, c;
		b = a++;
		c = ++a;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		int d = 1, e;
		e = ++d + ++d + ++d + ++d;
		System.out.println("d = " + d + ", e = " + e);
		
//		for: {} 블록을 조건이 만족하는 동안 반복해서 실행한다.
//		반복 횟수가 알려져 있는 경우 주로 사용한다.
//		초기치를 가지고 {} 블록을 1번 반복한 후 증감치 만큼 변수값을 변경하고 조건을
//		비교해서 참이면 반복하고 거짓이면 반복을 중지한다.
		
//		for(변수=초기치; 조건식; 증감치) {
//			조건이 참일 동안 실행할 문장;
//			...;
//		}
		
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println("1 ~ 100의 합계: " + sum);
		
	}
	
}









