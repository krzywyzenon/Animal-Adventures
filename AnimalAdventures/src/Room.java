
public class Room {
	private int foodInRoom;
	int batHitPoints;
	private boolean doorUnlockingStatus = false;
	
	public Room(int food, int batHitPointsNumber){
		
	}
	
	public int animalEats(){
		foodInRoom --;
		return foodInRoom;
	}
	
	public void unlockDoor(){
		doorUnlockingStatus = true;
	}
	
	public boolean openDoor(){
		if (doorUnlockingStatus=true){
			System.out.println("Congratulations! You have opened the door and");
			return true;
		}
		else
		{
			System.out.println("Sorry the door is locked");
			return false;
		}
	}
	
	public void roomDescription(){
		System.out.println("You are in... guess what!! ... a rooom");
		System.out.println("Not so much to look at - just an old TV, a couch, wardrobe and the food bowl.");
		System.out.println("...Oh and did I forget to mention the cage with an evil bat? You did not think it would be too easy now did you?");
	}
		

}
