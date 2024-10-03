import java.util.ArrayList;
//Task 4

public class Main{

public static void main(String[]args){

ArrayList<String>actions = new ArrayList<String>();



actions.add("Start game");
actions.add("Resume game");
actions.add("Pause game");
actions.add("End game");

GameMenu gameMenu = new GameMenu(actions);

gameMenu.displayMenu();
}

}