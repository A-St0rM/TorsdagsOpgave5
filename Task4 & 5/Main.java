import java.util.ArrayList;


class Main{
	public static void main(String[] args){

		ArrayList<String> actionsMain = new ArrayList<String>();
		actionsMain.add("1) Start game" + "\n");
		actionsMain.add("2) Resume game" + "\n");
		actionsMain.add("3) Pause game" + "\n");
		actionsMain.add("4) End game");


		GameMenu gameMenu = new GameMenu(actionsMain);
		String inputChoice = gameMenu.getAction();
		//Convert choice 
		int userChoice = Integer.parseInt(inputChoice);
		doAction(userChoice);


	}

	public static void doAction(int action){


		switch(action){
		case 1:
			System.out.println(" 1: Starting the game now");
			break;
		case 2:
			System.out.println("2: Fetching previously saved game data");
			break;
		case 3:
			System.out.println("3: Game paused");
			break;
		case 4:
			System.out.println("4: Ending game");
			break;
		}


	}

}