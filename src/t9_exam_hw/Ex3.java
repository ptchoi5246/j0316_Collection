package t9_exam_hw;

import java.util.TreeSet;

// Lotto 6개의 당첨 번호를 중복을 배제해서 오름차순 출력하시오
//단, set계열 객체 사용

public class Ex3 {
	public static void main(String[] args) {
		
		//TreeSet<Integer> treeSet = new TreeSet<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<>();
		//Set<Integer> treeSet = new TreeSet<>();
		
//		for(int i=0; i<10; i++) {
//			treeSet.add((int)(Math.random()*100)+1);
//		}
		
//		treeSet.add(5); //오름차순 순서에 맞게 추가
//		treeSet.add(5); //중복 배제
		
		/*char gpt
	// 중복되지 않는 무작위 번호를 생성하기 위해 Set을 사용합니다.
    Set<Integer> lottoNumbers = new HashSet<>();

    // 로또 번호 6개를 생성합니다.
    Random random = new Random();
    while (lottoNumbers.size() < 6) {
        int number = random.nextInt(45) + 1; // 1부터 45까지의 무작위 숫자 생성
        lottoNumbers.add(number); // 중복되지 않는 숫자만 추가
    }

    // 생성된 로또 번호를 정렬하여 출력합니다.
    List<Integer> sortedNumbers = new ArrayList<>(lottoNumbers);
    Collections.sort(sortedNumbers);

    System.out.println("로또 번호: ");
    for (int number : sortedNumbers) {
        System.out.print(number + " ");
    }
		*/
		
	}
}	