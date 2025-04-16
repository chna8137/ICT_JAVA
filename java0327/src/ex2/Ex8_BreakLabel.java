package ex2;
//break 라벨 : break 시점을 정하는 기능 
//break 라벨 : 라벨을 선언한 곳으로 바로 빠져나는 기능 
//
public class Ex8_BreakLabel {
	// 실행 순서 
	// 큰for문 시작 i=1 -> i<=9;(true) -> 
	// 			작은for문 시작 시작 j=1 -> j<=9;(true) -> 
	//                if문이 j값을 점검 j가 6에 해당이 되면 break문 실행 ->적은 for만 빠져나옴
	// 큰for문 시작 i=2 -> i<=9;(true) -> 
	// 			작은for문 시작 시작 j=1 -> j<=9;(true) -> 
	//                if문이 j값을 점검 j가 6에 해당이 되면 break문 실행 ->적은 for만 빠져나옴
	public static void main(String[] args) {
		ext:for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(j == 6) { // j값이 6이 되면 
					break ext;
				}
				System.out.print(j+"x"+i+"\t");
			} // 안쪽 for문을 빠져 나간다. 즉 외부 for문에는 영향을 준다 안준다?
			System.out.println("");
		}
	}
}
