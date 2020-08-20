package yedam.com.interfaces;

class Anonymous {
	void run() {
		System.out.println("실행.");
	}
}

class ChildAnonymous extends Anonymous{
}

interface AnonymInterface {
	void run();
}



public class AnonymouseExample {
	public static void main(String[] args) {
		
		AnonymInterface anonymIntf = new AnonymInterface() {//익명의 구현 객체

			@Override
			public void run() {
		System.out.println("자식 구현 객체 실행");
				
			}
		};
		anonymIntf.run();
	Anonymous anonym = new Anonymous()	{//익명의 자식객체
		String str;

		@Override
		void run() {
			System.out.println("자식실행.");
			
		}
		
		
		};
		anonym.run();
	}
}
