package t9_exam_hw;

import java.util.ArrayList;

public class Test1Run {
	public static void main(String[] args) {
		
		ArrayList<Test1VO> vos = new ArrayList<>(); //<>안에 한개만 처리할 때는 해당 객체를 넣고, 여러개를 처리할 때는 VO의 한덩어리 객체를 넣는다
		
		//Test1 VO vo = new Test1VO()
		//vo 각각의 새로운 객체를 안 만들면 얕은 복사가 되어서 마지막에 입력한 값만 출력하게 된다. --> 깊은 복사를 해야한다.
		
		//Test1VO vo = null;
		//vo = new Test1VO(); --> 값을 입력하기 전에 각각의 새로운 객체를 만들어서 깊은 복사를 하게 된다. --> 각각의 값이 출력된다.
		
		Test1VO vo = null;
		
		vo = new Test1VO();
		vo.setName("홍길동");
		vo.setAge(20);
		vo.setGender("남자");
		vo.setAddress("서울");
		vos.add(vo); //vos.add :: vos에 vo 자료 넣기
		
		vo = new Test1VO();
		vo.setName("김말숙");
		vo.setAge(29);
		vo.setGender("여자");
		vo.setAddress("청주");
		vos.add(vo);
		
		vo = new Test1VO();
		vo.setName("이기자");
		vo.setAge(33);
		vo.setGender("남자");
		vo.setAddress("제주");
		vos.add(vo);
		
		for( Test1VO v : vos ) {
			System.out.println(v);
		}
		
		
		
		
	}
}
