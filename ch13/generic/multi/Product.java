package ch13.generic.multi;

public class Product<T, M> { //멀티 타입 파라미터
	private T kind;  //객체용
	private M model; //String 용
	
	public T getKind() {return kind;	}
	public M getModel() {return model;	} //게터 : 값 출력
	
	public void setKind(T kind) {	this.kind = kind;	}
	public void setModel(M model) {	this.model = model;	} //세터 : 값 입력
	
	

}
