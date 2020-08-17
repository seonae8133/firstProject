package statics;

public class SingletonExample {

	public static void main(String[] args) {
//		new Singleton(); private 으로 지정해둬서 new로 못만듬
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance(); //public 으로 지정된 getInstance로만 생성할수 있음
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2) {//getInstance로 가져온 값들은 동일한 객체.
			System.out.println("동일한 instance입니다");
		}else {
			System.out.println("다른 instance입니다");
		}
	}
}
