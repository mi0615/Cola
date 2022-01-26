package e_final;

class Parent {
	 String field = "부모님꺼";
	 public void jib() {
		System.out.println("부모님이 만드신 집");
	}
}

class Child extends Parent {
	String field = "내꺼";
  

//public void jib() {
//	System.out.println("물려받아 탕진한 집");
//	}
}

public class MainApp {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.field);
		p.jib();

	}

}
