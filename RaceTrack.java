class RaceTrack{
	
	public static void main(String []args){
		Car c1 = new Car(2020,"Suzuki",70.00);
		
		System.out.println("Manufacturing year is =="+c1.getYear());
		System.out.println("Car name is =="+c1.getMake());
		System.out.println("Speed of car is =="+c1.getSpeed());
		c1.accelerate();
		System.out.println("Speed of car after acceleration is =="+c1.getSpeed());
	}
	
}
		
		