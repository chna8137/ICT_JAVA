package demo2;

public class CodeHere {

	//메뉴얼을 보고 메서드를 10개정도 정의
	
	// 1) 입력받은 두 값을 더해서 그값을 반환하는 메서드
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	// 2) 입력받은 두 값을 더해서 그값을 반환하는 메서드 - 반환값 -> "1 + 1 = 2" 문자열
	
	// 3) 새의 이름을 입력  입력 , 해당 새가 어떻게 우는지 반환하는 메서드 
	// 참새 -> 짹짹
	// 독수리 ->??
	// if elseif , switch 
	
	
	public static void main(String[] args) {
		CodeHere ref = new CodeHere();
		int res = ref.add(1, 1);
		System.out.println(res);
		System.out.println("--------------------------");
	}
}
