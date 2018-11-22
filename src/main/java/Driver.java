
public class Driver {
	
	public Vehicle v;
	public String name;
	
	public Driver(Vehicle v, String name) {
		// TODO Auto-generated constructor stub
		this.v = v;
		this.name = name;	
	}
	
	public void speedUp(int increase) {
		
		this.v.speedUp(increase);
	}


}
