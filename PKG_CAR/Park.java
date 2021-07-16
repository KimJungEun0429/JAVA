package PKG_Car;

import java.util.ArrayList;

public class Park {

	private ArrayList parkCars;
	
	public Park() {
		this.parkCars = new ArrayList();
	}//인스턴스화 시켜주기
	
	public void carPark(Car car) {
		parkCars.add(car);
	}
	
	public void getCarList() {
		
		for(int i=0; i<parkCars.size(); i++) {
			System.out.println(((Car)parkCars.get(i)).toString());
		}
	}
	
}
