class SportsTest

{

public static void main(String a[])

{
	Sports sports=new Sports();
		sports.name="Cricket";
		sports.noOfPlayers=11;


	Sports sports1=new Sports();
		sports1.name="Throw Ball";
		sports1.noOfPlayers=11;


	Sports sports2=new Sports();
		sports2.name="Hockey";
		sports2.noOfPlayers=7;
		
System.out.println(sports.name+" "+sports.noOfPlayers);
System.out.println(sports1.name+" "+sports1.noOfPlayers);
System.out.println(sports2.name+" "+sports2.noOfPlayers);

	sports.play();

}

}