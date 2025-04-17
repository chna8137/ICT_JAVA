package classpart_exam;

import java.util.Scanner;

import classpart.Student;

public class StudentMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Student[] students = new Student[3];
	for(int i=0; i<3; i++) {
	Student st = new Student();
	System.out.print("번호:");
	st.stid = Integer.parseInt(sc.nextLine());
	System.out.print("이름:");
	st.sname = sc.nextLine();
	System.out.print("학년:");
	st.grade= Integer.parseInt(sc.nextLine());
	System.out.print("주소:");
	st.addr = sc.nextLine();
	students[i] = st;
	}
	//새로운 학생 추가 
	for(Student e : students) {
		System.out.println("번호:"+e.stid);
		System.out.println("이름:"+e.sname);
		System.out.println("학년:"+e.grade);
		System.out.println("주소:"+e.addr);
		System.out.println("================");
	}
}
}
