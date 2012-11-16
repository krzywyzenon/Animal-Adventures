//to be able to read user input
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		//A new animal is created
		Animal pinky = null;
		//create a room
		Room room = new Room();
		//initiate the scanner
		Scanner scan = new Scanner(System.in);
		
		
		//user gets promoted what to do one of four chooses 
		System.out.println("Games started what do u want to do ?");
		System.out.println("1 - open the door");
		System.out.println("2 - eat");
		System.out.println("3 - Fight bat");
		System.out.println("4 - go to cabinet");
		//create variable that holds to users choose
		int choose = scan.nextInt();
		
		//If statement checks that user has chosen between 1 - 4 
		if(choose > 0 && choose <= 4){
			System.out.println("your chose is "+ choose);
		}else{
			System.out.println("your chose is "+ choose +" you have to choose between 1-4");
		}
		
		/*do{	
		}(room.openDoor == false)*/
		
		//close the scanner
		scan.close();
		

	}//end main 

}//end class
