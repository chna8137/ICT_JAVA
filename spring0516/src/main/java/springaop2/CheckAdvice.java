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
		System.out.println("����� �ӵ� : " + (end - start) + "��");
		
		return res;
	}
	
	// String result => �Ű������� ��ȯ ���� ������ �����Ѵ�.
	// returning = "" �Ű������� ��ȯ ���� ���� �̸��� �ۼ��Ѵ�.
	@AfterReturning(pointcut = "execution(* springaop2.DaoImple.second(..))", returning = "result")
	public void afterReturnAdvice(String result) {
		System.out.println("����Ͻ� ������ ���� �� ������ ��ȯ���� �޴� Advice");
		System.out.println("��ȯ�� : " + result);
	}
	
	@AfterThrowing(pointcut = "execution(* springaop2.DaoImple.third(..))", throwing = "ex")
	public void afterthrowingAdvice(Exception ex) {
		System.out.println("���� �޼��� : " + ex.getMessage());
	}
	
	@Before(value = "execution(* springaop2.DaoImple.my*(..))")
	public void beforeAdvice() {
		
		System.out.println("ICT Password! BeforeAdvice����!");
	}

}
