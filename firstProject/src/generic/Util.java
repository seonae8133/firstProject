package generic;

public class Util {
	public static <T> Box<T> boxing(T t) {//boxing 호출할때 파라미터 값을 지정할때 그때 타입을 Box에 담아서 그 타입으로 리턴하겠다. 
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
		
	public static<T,M> boolean compare(Product<T,M> p1, Product<T,M>p2) {
		boolean b1 = p1.getType().equals(p2.getType());
		boolean b2 = p1.getModel().equals(p2.getModel());
		return b1&&b2;
	}
}
