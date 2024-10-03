
//Task1

public class Main{


public static void main(String[]args){

	Team t1 = new Team("De Uovervindelige");
	Team t2 = new Team("De Overlegne");
	Team t3 = new Team("De Arrogante");
	Team t4 = new Team("De Smarteste");
	Team t5 = new Team("De Sejeste");

	t1.setRank(3);
	t2.setRank(2);
	t3.setRank(1);
	t4.setRank(4);
	t5.setRank(5);


	t1.addPlayer("Victor");
	t2.addPlayer("Sofus");
	t3.addPlayer("Magnus");
	t4.addPlayer("Emil");
	t5.addPlayer("Flemming");

	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	System.out.println(t4);
	System.out.println(t5);
}


}

