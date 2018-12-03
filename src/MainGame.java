import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) {
		
		MainGame game = new MainGame();
		System.out.println("Test");
		
	}
	
	ElderBeing todaysBeing = null;
	
	Scanner s = new Scanner(System.in);
	
	boolean observed = false;
	
	public MainGame() {
		MainGameLoop();
	}
	
	public void MainGameLoop () {
		while (Pantheon.pantheon.devotion > -150 && Pantheon.pantheon.devotion < 350) {
			DisplayDay();
			DisplayMenu();
		}
		EndGame();
	}
	
	private void DisplayDay () {
		todaysBeing = Pantheon.pantheon.getTodaysBeing();
		System.out.println("Today is: " + Calendar.calendar.displayDate() + ".");
		System.out.println("Your current devotion is: " + Pantheon.pantheon.devotion);
		System.out.println("You must make a sacrifice to: " + todaysBeing.name + ".");
		System.out.println("You can sacrifice: \n" + Inventory.inventory.toString());
		System.out.println();
	}
	
	private void DisplayMenu() {
		System.out.println("Actions:");
		if (!observed) {
			System.out.println("Ponder " + todaysBeing.name + " (P)");
		}
		System.out.println("Observe an object (O + #)");
		System.out.println("Sacrifice an object (S + #)");
		if (Pantheon.pantheon.devotion > 100 && Inventory.inventory.maxCount < 5) {
			System.out.println("Use 100 devotion to gain another sacrifice choice (U)");
		}
		System.out.println("Quit Game (Q)");
		System.out.println();
		GetMenuChoice();
	}
	
	private void GetMenuChoice(){
		String choice = s.nextLine();
		if (choice.substring(0, 1).equalsIgnoreCase("P") && !observed) {
			System.out.println(todaysBeing.getDescription());
			System.out.println();
			observed = true;
			DisplayMenu();
			return;
		}
		if (choice.substring(0, 1).equalsIgnoreCase("U") && Pantheon.pantheon.devotion > 100 && Inventory.inventory.maxCount < 5) {
			Inventory.inventory.IncreaseCount();
			Pantheon.pantheon.devotion -= 100;
			System.out.println("You now have " + Pantheon.pantheon.devotion + " devotion.");
			System.out.println("You can sacrifice: \n" + Inventory.inventory.toString());
			System.out.println();
			DisplayMenu();
			return;
		}
		if (choice.substring(0, 1).equalsIgnoreCase("Q")) {
			System.out.println("Thanks for playing!!");
			System.exit(0);
		}
		if (choice.substring(0, 1).equalsIgnoreCase("O")) {
			int i = -1;
			try{
				i = Integer.parseInt(choice.substring(1, 2));
			} catch(NumberFormatException e){
				System.out.println("After 'O', please type a number");
				System.out.println();
				DisplayMenu();
				return;
			}
			
			if (i <= Inventory.inventory.maxCount) {
				System.out.println(Node.root.getDescription(Inventory.inventory.objects.get(i-1)));
			} else {
				System.out.println("Sorry that is not a vaild object to observe.");
			}
			System.out.println();
			DisplayMenu();
			return;
		}
		if (choice.substring(0, 1).equalsIgnoreCase("S")) {
			int i = -1;
			try{
				i = Integer.parseInt(choice.substring(1, 2));
			} catch(NumberFormatException e){
				System.out.println("After 'S', please type a number");
				System.out.println();
				DisplayMenu();
				return;
			}
			
			if (i <= Inventory.inventory.maxCount) {
				String s = Inventory.inventory.objects.remove(i-1);
				System.out.println("You sacrifice the " + s + " to " + todaysBeing.name + ".");
				Pantheon.pantheon.devotion += todaysBeing.checkObject(s);
				System.out.println();
				Inventory.inventory.objects.add(Node.root.getRandomObject());
				Calendar.calendar.nextDay();
				return;
			} else {
				System.out.println("Sorry that is not a vaild object to sacrifice.");
			}
			System.out.println();
			DisplayMenu();
			return;
		}
		
		System.out.println("Sorry that is not a vaid action.");
		System.out.println();
		DisplayMenu();
		
	}
	
	private void EndGame() {
		if (Pantheon.pantheon.devotion < 0) {
			System.out.println("In anger at your seeming ineptitude, the beings smite you...");
		}
		else {
			System.out.println("In gratitude for your loyal service, the beings fufil your every wish for the rest of your days.");
		}
		System.out.println("Thanks for playing!!");
		//System.exit(0);
	}
	
//	private static void Test(){
//		System.out.println(Node.root.getDescription("Mouse"));
//		System.out.println(Node.root.checkParent("Bison", "Plant"));
//		System.out.println(Node.root.checkParent("Cat", "LivingThings"));
//		System.out.println(Calendar.calendar.displayDate());
//		//System.out.println(Pantheon.pantheon.getTodaysBeing() + " " + Calendar.calendar.displayDate());
//		for (int i = 0; i < 31; i++) {
//			System.out.println(Pantheon.pantheon.getTodaysBeing().name);
//			Calendar.calendar.nextDay();
//			
//		}
//		System.out.println(Pantheon.pantheon.getTodaysBeing().name);
//		System.out.println(Calendar.calendar.displayDate());
//		System.out.println(Node.root.getRandomObject());
//		System.out.println(Node.root.getRandomObject());
//		System.out.println(Node.root.getRandomObject());
//		System.out.println(Node.root.getRandomObject());
//	}
	
}
