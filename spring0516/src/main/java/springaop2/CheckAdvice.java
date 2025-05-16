package springaop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CheckAdvice {
	
	@Around("execution(* springaop2.DaoImple.first*(..))")
	public String checkTime(ProceedingJoinPoint pjp) throws Throwable {
		
		long start = System.currentTimeMillis();
		
		String res = (String) pjp.proceed();
		
		long end = System.currentTimeMillis();
		System.out.println("수행된 속도 : " + (end - start) + "초");
		
		return res;
	}
	
	// String result => 매개변수로 반환 받을 변수를 선언한다.
	// returning = "" 매개변수로 반환 받을 변수 이름을 작성한다.
	@AfterReturning(pointcut = "execution(* springaop2.DaoImple.second(..))", returning = "result")
	public void afterReturnAdvice(String result) {
		System.out.println("비즈니스 로직이 수행 된 이후의 반환값을 받는 Advice");
		System.out.println("반환값 : " + result);
	}
	
	@AfterThrowing(pointcut = "execution(* springaop2.DaoImple.third(..))", throwing = "ex")
	public void afterthrowingAdvice(Exception ex) {
		System.out.println("예외 메세지 : " + ex.getMessage());
	}
	
	@Before(value = "execution(* springaop2.DaoImple.my*(..))")
	public void beforeAdvice() {
		
		System.out.println("ICT Password! BeforeAdvice적용!");
	}

}
