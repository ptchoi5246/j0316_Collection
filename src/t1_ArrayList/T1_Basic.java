package t1_ArrayList;

import java.util.ArrayList;
import java.util.List;
//!!!!!!!!!!!다외우기!!!!!!!!!!!!!!!!!!!!!!!
public class T1_Basic {
	public static void main(String[] args) {
		//ArrayList<String> arrayList = new ArrayList<String>();
		//ArrayList<String> arrayList = new ArrayList<>(); //뒤에 <String> 생략 가능
		//List<String> arrayList = new ArrayList<>(20); //Collection Framework의 List - ArrayList //import List (용량) 기본용량 capacity:10
		List<String> arrayList = new ArrayList<>(); //제너릭//용량 capacity() - 기본은 10 //용량은 상관없고 크기(길이)가 중요
		
		System.out.println("1.arrayList 크기 : " + arrayList.size());
		System.out.println("1.toString 크기 : " + arrayList.toString());
		System.out.println("1.toString 크기 : " + arrayList); //.toString()너무 많이 사용해서 생략 가능, Alt s*3 enter*2
		System.out.println();
		
		//자료 추가 (add) !!무조건 외우기
		arrayList.add("100");
		arrayList.add("홍길동");
		arrayList.add("Hong Gil Dong");
		arrayList.add("김말숙");
		arrayList.add("이기자");
		
		arrayList.add("홍길동");
		System.out.println("2.arrayList 크기 : " + arrayList.size()); //add 5개 //add 6개 
		System.out.println("2.toString 크기 : " + arrayList.toString()); //5개가 순차적으로 입력 //중복 허용(index로 관리) 순서가 중요!!!
		System.out.println();
		
		//특정 위치(index)에 자료 추가 .add(index, 자료)
		arrayList.add(2, "소나무");
		System.out.println("3.arrayList 크기 : " + arrayList.size()); 
		System.out.println("3.toString 크기 : " + arrayList.toString()); //2번지 자리 : 첫번째 홍길동 다음에 추가 
		System.out.println();
		
		//검색 .get(index)
		String name = arrayList.get(2); //get 반환을 위함
		System.out.println("4.name : " + name);
		
		//변경 .set(index, 자료)
		arrayList.set(2, "감나무");
		System.out.println("5.arrayList 크기 : " + arrayList.size()); 
		System.out.println("5.toString 크기 : " + arrayList.toString()); //소나무 -> 감나무로 변경 
		System.out.println();
		
		//삭제 .remove(index) or .remove("삭제할 값을 직접 입력") !!정말 중요
		arrayList.remove(2);
		arrayList.remove("홍길동");
		System.out.println("6.arrayList 크기 : " + arrayList.size());  //6개 //5
		System.out.println("6.toString 크기 : " + arrayList.toString()); //감나무 제거 //이기자 제거 //홍길동 중복시 앞의 홍길동 삭제 //순차 - 앞 먼저 삭제
		System.out.println();
		
		List<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(0);
		for(int i=1; i<5; i++) arrayList2.add(i,(i*100));
		System.out.println("7.arrayList 크기 : " + arrayList2.size());
		System.out.println("7.toString 크기 : " + arrayList2.toString());
		System.out.println();
		
		
		//arrayList.remove(200); //49번과 동일하게 작성, (index) - (200) index200을 못 찾음 ::IndexOutOfBoundsException
		//(객체개념)으로 작성
		arrayList2.remove(new Integer(200)); //이렇게 사용해야 한다. 새로운 객체 생성 //실제 값을 삭제하려면 객체형식으로 삭제처리한다.
		System.out.println("8.arrayList 크기 : " + arrayList2.size());
		System.out.println("8.toString 크기 : " + arrayList2.toString());
		System.out.println();
		
		//향상된 for문을 이용한 ArrayList객체 활용 !!!엄청 많이 사용!!!
		String str = "";
		for(String s : arrayList) {
			str += s + "/";
		}
		str = str.substring(0,str.length()-1); //마지막 / 삭제 외우기!!!!!
		System.out.println("9. str : " + str);
		System.out.println();
		
		//일반 for문 
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(i + "번지 : " + arrayList.get(i));
		}
		System.out.println();
		
		//모든 자료 삭제(clear)
		arrayList.clear();
		System.out.println("10.arrayList 크기 : " + arrayList.size());
		System.out.println("10.toString 크기 : " + arrayList.toString());
		System.out.println();
		
		ArrayList<String> arrayList3 = new ArrayList<>();
		arrayList3.add("서울");
		arrayList3.add("청주");
		arrayList3.add("부산");
		arrayList3.add("제주");
		System.out.println("11.arrayList 크기 : " + arrayList3.size());
		System.out.println("11.toString 크기 : " + arrayList3.toString());
		System.out.println();
		
		//ArrayList 객체의 내용을 모두 추가(합치기) ,단 객체타입이 같아야 한다.(제너릭!!!) : addAll()
		arrayList.addAll(arrayList3);
		System.out.println("12.arrayList 크기 : " + arrayList.size());
		System.out.println("12.toString 크기 : " + arrayList.toString());
		System.out.println();
		
		arrayList.addAll(1,arrayList3); //index 1번 위치에 arrayList3 추가
		System.out.println("13.arrayList 크기 : " + arrayList.size());
		System.out.println("13.toString 크기 : " + arrayList.toString());
		System.out.println();
		
		arrayList.addAll(arrayList); //자기꺼에 자기꺼를 뒤에 추가 
		System.out.println("14.arrayList 크기 : " + arrayList.size());
		System.out.println("14.toString 크기 : " + arrayList.toString());
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
}
