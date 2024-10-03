class Main{
	public static void main(String[] args){

	Team team1 = new Team("Red Dragons");
	Team team2 = new Team("Bones");
	Team team3 = new Team("The serpents");
	Team team4 = new Team("Adventures");
	Team team5 = new Team("Blues");

	team1.setRank(9);
	team2.setRank(5);
	team3.setRank(3);
	team4.setRank(2);
	team5.setRank(10);

	team1.addPlayer("Alissa");

	
	System.out.println(team1);
	System.out.println(team2);
	System.out.println(team3);
	System.out.println(team4);
	System.out.println(team5);



	}






}