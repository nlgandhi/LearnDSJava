package ZDS;


public class Element<T> {
	private T data;
	private Element next;

	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	public Element getNext() {
		return next; 
	}

	public void setNext(Element next) {
		this.next = next;
	}
	
	public Element(T data, Element next) {
		this.data = data;
		this.next = next;
	}
	
	
}
	

//public class Stack {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
