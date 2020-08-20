package generic;

//<T> : 타입 파라미터
public class Box<T> {//T자리에는 여러 타입들어갈수 있고, 제네릭으로 만들면 밑에 메서드 타입도 다 동일하게 지정한 타입으로 바궈주어ㅑ됨
	//------Object 타입 필드-------------
	private T  obj; //최상위 클래스 object라서 obj는 여러 종류 데이터 타입 다 올수 있음(String.Member 등등 // 모든 클래스를 다담을수 있는 최상위 부모 클래스)
	
	public void set (T obj) {
		this.obj = obj;
	}
	
	public T get() {//obj필드 반환 메서드
		return this.obj;
	}
	
	
}
