package t1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class T4_Iterator { //반복 지시자
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> vos = new ArrayList<>();
		for(int i=0; i<10; i++) {
			vos.add((int)(Math.random()*100)+1);
		}
		System.out.println("1.vos : " + vos);
		System.out.println();
		
		//향상된 for문 = for ~ each문
		for(int vo : vos) {
			System.out.print(vo + " ");
		}
		System.out.println();
		
		
		//수를 입력받아 vos에 들어있으면 '당첨' 그렇지 않으면 '다음 기회에'출력하시오.
		int cnt = 0;
		System.out.println("숫자를 입력하세요~!  ");
		int ans = sc.nextInt();
		
		for(int i=0; i<vos.size(); i++) {
			//if(vos.get(i) == ans) { //get 값을 꺼내기 //<Integer> 라서 == 사용 가능
			if(vos.get(i).equals(ans)) { //.equls 원래 정답 //ArrayList Integer(객체)로 선언했기에
				System.out.println("축하합니다~!~!~! 당첨!!!!!");
				break;
			}
			cnt++;
		}
		if(vos.size() == cnt) System.out.println("아쉽지만 다음 기회에 이용해 주세요.");
		System.out.println("작업 끝이라는데 무슨 말인지 모루겠네;;;");
		System.out.println();
		
		//Iterator (반복지시자)로 vos 객체 꺼내기  - 향상된 for문 사용 불가
		Iterator<Integer> it = vos.iterator(); // Iterator은 vos.으로 꺼내기
		System.out.println("2. iteratot : " + it); //주소출력
		//값이 있냐없냐 들여다 봐야한다. 주머니에 들어있다고 생각하기 it.hasNext(), hasMoreElement()
		while(it.hasNext()) {//hasMoreElement()
			int item = it.next(); //hasNext() //item 받는 그릇
			System.out.print(item + " ");
		}
		System.out.println("\n");
				
		//스트림 (Stream)객체로 출력하기 - 향상된 for문, while문 사용 불가 //향상된 for문 대신에 for ~ each 사용
		Stream<Integer> stream = vos.stream();
		stream.forEach(no -> System.out.print(no + " ")); //람다식
		
		sc.close();
	}
}
