package ch13.generic;

public class Box<T> { //모든 타입을 허용 하는 테스트용
	
	private T t ; //필드 (최상위 객체)
	
	public void set(T t) {
		this.t = t;
	} // 세터
	
	public T get() {
		return t;
	} // 게터

}
