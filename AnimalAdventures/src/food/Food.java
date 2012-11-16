package food;

public abstract class Food {
	
	private String type;
	private int satiating;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	public abstract int getSatiating();
	public abstract String getType();
}
