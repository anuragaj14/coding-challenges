package Generics;

public class TObj<T> {
	
	public T obj;
	
	public TObj(T Obj) {
		this.obj = Obj;
	}
	
	public void print() {
		System.out.println(obj.toString());
	}

}
