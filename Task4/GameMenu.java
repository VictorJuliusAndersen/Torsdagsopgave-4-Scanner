import java.util.ArrayList;
//Task 4

public class GameMenu{


private ArrayList<String>actions;

public GameMenu(ArrayList<String>actions){
	this.actions = actions;

}

public void displayMenu(){

for (String action : actions){
System.out.println(action);
}

}


}