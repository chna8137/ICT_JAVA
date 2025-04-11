package ex1;
/*  구구단 응용
[2x1]3x1	4x1	5x1	6x1	7x1	8x1	9x1	[\n]
2x2	3x2	4x2	5x2	6x2	7x2	8x2	9x2	[\n]
2x3	3x3	4x3	5x3	6x3	7x3	8x3	9x3	[\n]
2x4	3x4	4x4	5x4	6x4	7x4	8x4	9x4	[\n]
2x5	3x5	4x5	5x5	6x5	7x5	8x5	9x5  [\n]
..
2x9	3x9	4x9	5x9	6x9	7x9	8x9	9x9=연산  [\n]
*/
public class Ex8_ForForExam {
public static void main(String[] args) {
	//for(int i){
	// for(int j){
		//sout(j+"x"+i+"="+(j *i));
	//}
	// soutln(); //\n
	//}
	for(int i=1; i<=9; i++) {
		for(int j=2; j<=9; j++) {
			System.out.print(j+"x"+i+"="+(j *i)+"\t");
		}
		System.out.println("");
	}
	
	
	
	
	
	
	}
}
