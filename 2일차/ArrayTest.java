import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
//		배열: 같은 이름으로 여러개의 기억장소를 만든다.
//		자료형[] 배열명 = new 자료형[첨자]; // 첨자 크기 만큼 배열을 만든다.		
//		자료형 배열명[] = new 자료형[첨자];
		
//		배열을 선언만 하면 기본 초기화가 실행된다.
//		숫자는 0, 문자는 공백, boolean은 false, 클래스 객체는 null
//		int[] data = new int[5];
//		System.out.println(Arrays.toString(data));
		
//		자료형[] 배열명 = {초기치}; // 초기치의 개수 만큼 배열을 만들고 초기화 시킨다.
//		자료형 배열명[] = {초기치};
		int[] data = {100, 200, 300};
//		System.out.println(Arrays.toString(data));
		
//		배열명.length: 배열의 크기를 얻어온다.
		System.out.println("배열의 크기: " + data.length);
		for (int i=0; i<data.length; i++) {
			System.out.println("data[" + i + "] = " + data[i]);
		}
		
//		향상된 for: 배열 전체를 대상으로 작업할 경우 사용하면 편리하다.
//		for (배열의자료형 변수명 : 배열명) {
//			반복할 문장;
//			...;
//		}
		
//		num이라는 변수에 data 배열의 0번째 인덱스의 데이터를 넣고 반복을 시작하고
//		data 배열의 마지막 인덱스 값을 num이라는 변수에 넣고 처리한 후 종료된다.
		for (int num : data) {
			System.out.println(num);
		}
		
	}
	
}











