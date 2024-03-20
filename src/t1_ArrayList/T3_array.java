package t1_ArrayList;

import java.util.ArrayList;

public class T3_array {
	public static void main(String[] args) {
		
		//ArrayList<Integer[]> vos = new ArrayList<>();
		ArrayList<int[]> vos = new ArrayList<>(); //unboxing //2차원배열로 사용 가능 3행4열 //1차원배열 공부!!!!!
		//ArrayList Vector, Linked List로 사용 가능
		
		int[] jum1 = new int[4]; //번호/국어/영어/수학 점수
		jum1[0] = 1;
		jum1[1] = 100;
		jum1[2] = 90;
		jum1[3] = 80;
		vos.add(jum1);
		//vos.add(jum1); = 2차원 배열로 사용 가능
		
		int[] jum2 = new int[4]; //번호/국어/영어/수학 점수
		jum2[0] = 2;
		jum2[1] = 90;
		jum2[2] = 80;
		jum2[3] = 70;
		vos.add(jum2);
		
		int[] jum3 = new int[4]; //번호/국어/영어/수학 점수
		jum3[0] = 3;
		jum3[1] = 70;
		jum3[2] = 60;
		jum3[3] = 50;
		vos.add(jum3);
		
		
		System.out.println("1.vos의 크기 : " + vos.size());
		System.out.println("1.toString : " + vos); //vos안에는 배열이 들어있어서 배열 주소 출력
		System.out.println();
		
		System.out.println("2.vos 객체 안의 배열값 출력"); //이중 for문 - 2차원 배열 !!!많이 사용한다.!!! 
		for(int[] voArray : vos) {//배열 꺼낼 때 향상된 for문 //바깥for문 : ArrayList<int[]> vos에 넣음 //큰덩어리 [0][1][2][3] 뽑기
			for(int v : voArray) {//int[] 객체 안에 있는걸 꺼내기 위해 안쪽 for문 사용 //각각의 내용 뽑기
				System.out.print(v + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("3.vos 객체 안의 배열값 출력"); //더 많이 사용:: 지칭해서 사용하기 때문에
		int[] imsi = new int[jum1.length]; //51줄의 출력을 위해 배열 생성
		for(int i=0; i<vos.size(); i++) { //일반 for문 사용
			imsi = vos.get(i); //vos의 첫번째꺼를 꺼내봐야한다. //얕은 복사
			for(int j=0; j<imsi.length ; j++) { //이중for문
				System.out.print(imsi[j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("4.vos 객체 안의 배열값 출력");
		//이중 for문과 출력 같음
		System.out.print(vos.get(0)[0]+ " "); //vos.get(0) = int[] jum1 //vos.get(0)[0] = int[]jum1[0]
		System.out.print(vos.get(0)[1]+ " "); //int jum[1]
		System.out.print(vos.get(0)[2]+ " ");
		System.out.print(vos.get(0)[3]+ " ");
		System.out.println();
		System.out.print(vos.get(1)[0]+ " "); 
		System.out.print(vos.get(1)[1]+ " "); 
		System.out.print(vos.get(1)[2]+ " ");
		System.out.print(vos.get(1)[3]+ " ");
		System.out.println();
		System.out.print(vos.get(2)[0]+ " "); 
		System.out.print(vos.get(2)[1]+ " "); 
		System.out.print(vos.get(2)[2]+ " ");
		System.out.print(vos.get(2)[3]+ " ");
		System.out.println();
		System.out.println();
		
		System.out.println("5.vos 객체 안의 배열값 출력"); //4.2차원 배열 출력과 같다
		for(int i=0; i<vos.size(); i++) {
			for(int j=0; j<vos.get(i).length; j++) {
				System.out.print(vos.get(i)[j] + " ");
			}
			System.out.println();
			
		}
	}
}
