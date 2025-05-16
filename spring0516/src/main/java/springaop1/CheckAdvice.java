package springaop1;

import org.aspectj.lang.ProceedingJoinPoint;

// 공통 관심 사항
// 절대로 JoinPoint를 생략할 수 없다.
// 반드시 ProceedingJoinPoint 객체를 인자값으로 지정해야 한다.
public class CheckAdvice {
	
	// 일반 메서드를 만들면서 AroundAdvice 매개 변수 인자에 ProceedingJoinPoint 를 꼭 넣어야 함
	public void checkTime(ProceedingJoinPoint pjp) throws Throwable {
		
		// 구현 객체들에게 적용할 공통 관심사항을 작성한다.
		// 시간이 소요되는 코드를 설계한 first계열에 적용될 Advice
		long start = System.currentTimeMillis();
		// target 객체의 메서드를 호출 - 여기서는 first() 호출,
		// firstStatementTest() 호출 될 때 적용될 공통 코드들...
		pjp.proceed();
		
		long end = System.currentTimeMillis();
		System.out.println("수행된 속도 : " + (end - start) + "초");
	}

}
