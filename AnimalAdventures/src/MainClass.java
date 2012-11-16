//to be able to read user input
import java.util.Scanner;

public class MainClass {
	private static Scanner scan;
	public static void main(String[] args) {
		//A new animal is created
		Animal pinky = null;
		//create a room
		Room room = new Room(5, 5);
		//initiate the scanner
		scan = new Scanner(System.in);
		
		//describes the room
		room.roomDescription();
		//user gets promoted what to do one of four chooses 
		System.out.println("Games started what do u want to do ?");
		System.out.println("1 - open the door");
		System.out.println("2 - eat some food");
		System.out.println("3 - go to cage");
		System.out.println("4 - go to wardrobe");
		//create variable that holds to users choose
		int choose = scan.nextInt();
		
		//do while door is closed
		do{
			//If statement checks that user has chosen between 1 - 4 
			if(choose > 0 && choose <= 4){
				System.out.println("your chose is "+ choose);
			}else{
				System.out.println("your chose is "+ choose +" you have to choose between 1-4");
			}
			choose = scan.nextInt();
		}while(1 == 2);
		
		//close the scanner
		scan.close();
		

	}//end main 

}//end class
