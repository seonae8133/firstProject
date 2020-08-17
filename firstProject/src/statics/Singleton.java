package statics;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	//여러개 인스턴스 필요없이 하나만 사용할때
	
	private Singleton() {
		
	}
	
	public static  Singleton getInstance() {//
		return singleton;
	}
}
