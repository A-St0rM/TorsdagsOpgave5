import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{

	
	
	private ArrayList<String> actions = new ArrayList<String>();

	GameMenu(){

	}

	GameMenu(ArrayList<String> tempActions){

		this.actions = tempActions;
	}

	public void displayActions(){

		for(String s : actions){
			System.out.println(s);

		}
	}

	public String getAction(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number to choose an action");
		displayActions();
		String choice = scanner.nextLine();
		return choice;

	}


}	