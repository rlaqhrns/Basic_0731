
public class InstanceCar extends Car {

	@Override
	public void driving() {
		// TODO Auto-generated method stub
		System.out.println("운전중!");
	}
	@Override
	int sum(int a, int b) {// 구현부가 있는 메서드

		return a * b;
	}

}
