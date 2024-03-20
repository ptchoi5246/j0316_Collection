package t1_ArrayList;

import java.util.ArrayList;
import java.util.List;

//List 객체를 배열로 변환 : toArray()
public class T2_toArray {
	public static void main(String[] args) {
		
		List<Integer> vos = new ArrayList<>();
		vos.add(10);
		vos.add(20);
		vos.add(30);
		vos.add(40);
		vos.add(50); //for 문으로 입력 가능
		System.out.println("1. vos : " + vos);
		System.out.println();
		
		Object[] objects = vos.toArray();
		System.out.println("2. objects : " + objects);
		System.out.println();
		
		int cnt = 0;
		for(Object obj : objects) {
			System.out.println("obj["+cnt+"] : " + obj + " , " + ((Integer)obj + 10)); //다운캐스팅(Integer)
			cnt++;
		}
		System.out.println();
		
		Integer[] integers = vos.toArray(new Integer[vos.size()]); //배열의 정석
		//toArray : 배열로 바꿀 수 있다. //배열로 바꾼 이유 : 연산하기 위해서
		//Object 배열 - 너무 성가시다.
		//Object 대신에 해당 객체로 변경
		cnt = 0;
		for(Integer ii : integers) {
			System.out.println("Integer["+cnt+"] : " + ii + " , " + (ii + 10));
			cnt++;
		}
		System.out.println();

		Integer[] integers2 = vos.toArray(new Integer[0]); //객체의 사이즈를 주지 않아도 오류 안남 ArrayList 동적
		cnt = 0;
		for(Integer ii : integers2) {
			System.out.println("Integer2["+cnt+"] : " + ii + " , " + (ii + 10));
			cnt++;
		}
		System.out.println();
		
		
		
		
		
	}
}
