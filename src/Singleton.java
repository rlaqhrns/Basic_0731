


//디자인 패턴의 하나 singleton패턴 => 객체를 하나 만듦
public class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {//외부에서 생성자를 호출할 수 없음
		
		
	}
	
	public static Singleton getInstance() {//외부에서 이 메서드를 호출
		if(s == null) {
			s = new Singleton();
		}
		return s;
		
	}
}
