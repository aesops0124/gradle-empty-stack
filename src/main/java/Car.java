
public class Car extends Vehicle{

	public Car(String name, String brand) {
		super(name, brand);
		// TODO Auto-generated constructor stub
	}
	public void speedUp(int increase) {
		
		if(increase >= 200)
			System.out.println(this.brand + " " + this.name + " has been failed to speed up");
		else
			System.out.println(this.brand + " " + this.name + " has been speeded up to " + increase);
	}

}
