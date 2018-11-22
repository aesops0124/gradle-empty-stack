class Vehicle {

	public String name;
	public String brand;

	public Vehicle(String name, String brand) {
		this.name = name;
		this.brand = brand;
	}

	public void speedUp(int increase) {
		System.out.println(this.brand + " " + this.name + " has been speeded up to " + increase);
	}

	
}
