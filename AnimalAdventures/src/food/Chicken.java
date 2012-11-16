package food;

public class Chicken extends Food{
	
	private String type;
	private int satiating;
	
	public Chicken() {
		type = "chicken";
		satiating = 5;
	}
	
	@Override
	public String getType() {
		return type;
	}

	@Override
	public int getSatiating() {
		return satiating;
	}
}