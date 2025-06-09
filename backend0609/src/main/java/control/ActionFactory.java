package control;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;

import action.Action;
import action.HelloAction;
import action.IndexAction;
import action.ProfileAction;

public class ActionFactory {

	private static ActionFactory factory;
	
	private Properties prop;
	private String path;

	private ActionFactory() {
		prop = new Properties();
//		path = "D:\\ICTPassword02\\3_webapp\\workspace\\backend0513\\src\\main\\java\\control\\classinfo.properties";
		path = "D:\\ICTPassword02\\3_webapp\\workspace\\backend0609\\src\\main\\java\\control\\classinfo.properties";
	}

	public synchronized static ActionFactory getInstance() {
		if (factory == null) {
			factory = new ActionFactory();
		}
		return factory;
	}

	//
	// String cmd = request.getParameter("cmd"); 받아서
	// getAction("index");
	// 요청이 index라면 -> 제어문 필요
	// Action action = new IndexAction();
	// ictpass.do?cmd=hello
	// Action action = new HelloAction();
	// -> 다형성
	public Action getAction(String cmd) {
		Action action = null;
		
		try (FileReader fr = new FileReader(path)) {
			prop.load(fr);
			// cmdPath : hello => action.HelloAction
			String cmdPath = prop.getProperty(cmd, "action.IndexAction");
			Class<?> handler = Class.forName(cmdPath);
			// 기본 생성자를 호출 해서 newInstance로 호출 jdk9이상 부터
			Constructor<?> ct = handler.getDeclaredConstructor();
			// 생성자로부터 객체를 생성하는 메서드인 newInstance() 호출해서 객체로 생성함
			action = (Action) ct.newInstance();
		} catch (Exception e) {
			e.getStackTrace();
		}
//		if (cmd.equals("index")) {
//			action =  new IndexAction();
//		} else if(cmd.equals("hello")){
//			action = new HelloAction();
//		} else if(cmd.equals("profile")) {
//			action = new ProfileAction();
//		} else {
//			
//		}
		return action;
	}


}
