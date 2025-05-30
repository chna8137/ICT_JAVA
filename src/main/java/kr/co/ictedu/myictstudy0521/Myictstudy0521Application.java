package kr.co.ictedu.myictstudy0521;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Myictstudy0521Application {

	public static void main(String[] args) {
		SpringApplication.run(Myictstudy0521Application.class, args);
	}
	
	// 스프링이 이 메서드를 실행해서 반환한 객체를 빈으로 등록하라는 의미
	@Bean
	public WebMvcConfigurer crosConfigurer() {
	    
	    // WebMvcConfigurer는 스프링의 웹 설정을 커스터마이징할 수 있게 해주는 인터페이스
	    return new WebMvcConfigurer() {
	        
	        // CORS 설정을 오버라이드하여 직접 설정할 수 있게 함
	        @Override
	        public void addCorsMappings(CorsRegistry registry) {
	            System.out.println("Cross Allow Origin 실행!");

	            registry.addMapping("/**") // 모든 경로에 대해 CORS 허용
	                .allowedOrigins(
	                    "http://192.168.0.36:3001",
	                    "http://192.168.0.36:3000",
	                    "http://localhost:3001",
	                    "http://localhost:3000"
	                ) // 위 주소들에서 들어오는 요청만 허용
	                .allowedHeaders("*")   // 어떤 헤더든 허용
	                .allowedMethods("*")   // GET, POST, PUT 등 모든 메서드 허용
	                .maxAge(3600);         // 브라우저가 preflight 요청 결과를 3600초(1시간) 동안 캐싱
	        }
	    };
	}

}
