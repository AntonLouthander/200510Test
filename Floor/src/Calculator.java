
public class Calculator {

	//F�r att kunna h�mta egenskaper fr�n dessa klasser till denna klass
	//Beh�vs de skrivas ut som instanser p� detta sett
	private Floor floor;
	private Carpet carpet;
	
	public Calculator(Floor floor, Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}
	
	//H�r h�mtas sedan egenskaperna fr�n respektive klass med getters
	public double getTotalCost() {
		return floor.getArea() * carpet.getCost();
	}
}
