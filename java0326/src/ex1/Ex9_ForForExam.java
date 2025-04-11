package ex1;

//미션1) 
//구구단에 타이틀단을 출력하시오 
//단 기존의 for문 이외에 새로운 for문을 추가하지 마시오.
//미션2)
//단: 8
//범위(1,3,5,7,9):3
//<결과>
//7단	8단	9단
//7x1	8x1	9x1
//7x9	8x9	9x9
//-----------------
//단: 8
//범위(1,3,5,7,9):5
//<결과>
//6단  7단	8단	9단  10단
// ........
//-----------------
public class Ex9_ForForExam {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + (j * i) + "\t");
			}
			System.out.println("");
		}

	}
}
