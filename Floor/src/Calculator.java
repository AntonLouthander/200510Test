
public class Calculator {

	//För att kunna hämta egenskaper från dessa klasser till denna klass
	//Behövs de skrivas ut som instanser på detta sett
	private Floor floor;
	private Carpet carpet;
	
	public Calculator(Floor floor, Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}
	
	//Här hämtas sedan egenskaperna från respektive klass med getters
	public double getTotalCost() {
		return floor.getArea() * carpet.getCost();
	}
}
