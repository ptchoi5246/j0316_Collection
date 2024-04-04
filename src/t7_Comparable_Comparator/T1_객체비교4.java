package t7_Comparable_Comparator;

import java.util.Comparator;

// implement 안 하고 익명 이너클래스 사용하여 객체 비교
class Student4VO {
	int age;						//나이
	int classNumber;		//학급
	
	public Student4VO(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}

}

	/* 객체 비교
				Comparable() -- 인터페이스 : 자기자신과 객체변수를 비교한다.
				CompareTo() : 메소드를 반드시 구현해야한다.
	 */
public class T1_객체비교4 {
	public static void main(String[] args) {
//		// 익명 객체 구현방법 1. comparator
//		Comparator<Student4VO> comp1 = new Comparator<Student4VO>() {
//			
//			@Override
//			public int compare(Student4VO o1, Student4VO o2) {
//				return o1.classNumber - o2.classNumber;
//			}
//		};
		
		Student4VO a = new Student4VO(17, 2);
		Student4VO b = new Student4VO(18, 1);
		
		int res = comp2.compare(a, b);
		
		if(res > 0) {
			System.out.println("a객체가 b객체보다 큽니다.");
		}
		else if (res == 0) {
			System.out.println("a객체와 b객체는 같습니다..");
		}
		else {
			System.out.println("a객체가 b객체보다 작습니다.");
		}
	}
	
	//익명 객체 구현방법 2. 바깥 -- 메인과 같은 급 static 생성
	public static Comparator<Student4VO> comp2 = new Comparator<Student4VO>() {
		
		@Override
		public int compare(Student4VO o1, Student4VO o2) {
			return o1.classNumber - o2.classNumber;
		}
	};
	
}
