package Course22Exercise1Town;

public class Main {
	public static void main(String[] args) {
		Town town1 = new Town("Cluj", 530);
		Town town2 = new Town("Sibiu", 350);
		Town town3 = new Town("Timisoara", 600);
		Town town4 = new Town("Ploiest", 100);
		
		TownOrderedList<Town> oList = new TownOrderedList<>();
		oList.addInOrderedList(town1);
		oList.addInOrderedList(town2);
		oList.addInOrderedList(town3);
		oList.addInOrderedList(town4);
		
		System.out.println(oList);
	}
}
