package springaop1;

import org.aspectj.lang.ProceedingJoinPoint;

// ���� ���� ����
// ����� JoinPoint�� ������ �� ����.
// �ݵ�� ProceedingJoinPoint ��ü�� ���ڰ����� �����ؾ� �Ѵ�.
public class CheckAdvice {
	
	// �Ϲ� �޼��带 ����鼭 AroundAdvice �Ű� ���� ���ڿ� ProceedingJoinPoint �� �� �־�� ��
	public void checkTime(ProceedingJoinPoint pjp) throws Throwable {
		
		// ���� ��ü�鿡�� ������ ���� ���ɻ����� �ۼ��Ѵ�.
		// �ð��� �ҿ�Ǵ� �ڵ带 ������ first�迭�� ����� Advice
		long start = System.currentTimeMillis();
		// target ��ü�� �޼��带 ȣ�� - ���⼭�� first() ȣ��,
		// firstStatementTest() ȣ�� �� �� ����� ���� �ڵ��...
		pjp.proceed();
		
		long end = System.currentTimeMillis();
		System.out.println("����� �ӵ� : " + (end - start) + "��");
	}

}
