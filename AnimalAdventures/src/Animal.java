import food.*;


public abstract class Animal {

	protected int hunger;

	public Animal(){
		hunger = 10;
	}
	
	public void eat(){
		
		Food food = new Chicken();
		
		hunger =+ food.getSatiating();
		System.out.println("Num num this "+food.getType()+" is so delicious!");
	}
	
	public void check(){
		
	}
	
	public void pickUp(){
		
	}
	
	public abstract void fight();
}
