class MncTester

{
public static void main(String a[])
{

	Wipro wip = new Wipro();
	wip.companyName="Wipro";
	wip.noOfEmployees=209890;
	wip.year=1945;
	wip.ceoName="Theory Delaporte";

	String solve1 = wip.solveProblem();

System.out.println(solve1);
wip.displayDetails();




	Tcs tcs = new Tcs();
	tcs.companyName="Tata Consultancy Service";
	tcs.noOfEmployees=303890;
	tcs.year=1940;
	tcs.ceoName="John";

	String solve2 = tcs.solveProblem();

System.out.println(solve2);
tcs.displayDetails();




	
	Infosys info = new Infosys();
	info.companyName="Infosys";
	info.noOfEmployees=205890;
	info.year=1935;
	info.ceoName="George";

	String solve3 = info.solveProblem();

System.out.println(solve3);
info.displayDetails();




	Capgemini cap = new Capgemini();
	cap.companyName="Capgemini";
	cap.noOfEmployees=103890;
	cap.year=1960;
	cap.ceoName="Patty";

	String solve4 = cap.solveProblem();

System.out.println(solve4);
cap.displayDetails();





	Cognizant cog = new Cognizant();
	cog.companyName="Cognizant";
	cog.noOfEmployees=300520;
	cog.year=1970;
	cog.ceoName="Charlie";

	String solve5 = cog.solveProblem();

System.out.println(solve5);
cog.displayDetails();





	Birla birla = new Birla();
	birla.companyName="Birla";
	birla.noOfEmployees=1003890;
	birla.year=1920;
	birla.ceoName="Kumarmangalam Birla";

	String solve6 = birla.solveProblem();

System.out.println(solve6);
birla.displayDetails();




	Amazon amaz = new Amazon();
	amaz.companyName="Amazon";
	amaz.noOfEmployees=2003890;
	amaz.year=1930;
	amaz.ceoName="John Peter";

	String solve7 = amaz.solveProblem();

System.out.println(solve7);
amaz.displayDetails();
	




	Ibm ibm = new Ibm();
	ibm.companyName="IBM";
	ibm.noOfEmployees=103890;
	ibm.year=1935;
	ibm.ceoName="Samy";

	String solve8 = ibm.solveProblem();                         

System.out.println(solve8);
ibm.displayDetails();






	Hp hp = new Hp();
	hp.companyName="Hawlett Packard";
	hp.noOfEmployees=203890;
	hp.year=1935;
	hp.ceoName="Hawlett";

	String solve9 = hp.solveProblem();

System.out.println(solve9);
hp.displayDetails();




	Sony sony = new Sony();
	sony.companyName="Sony";
	sony.noOfEmployees=4003890;
	sony.year=1920;
	sony.ceoName="Anuj";

	String solve10 = sony.solveProblem();

System.out.println(solve10);
sony.displayDetails();
	

	

	Google google = new Google();
	google.companyName="Google";
	google.noOfEmployees=3003890;
	google.year=1901;
	google.ceoName="Sundar Pichai";

	String solve11 = google.solveProblem();

System.out.println(solve11);
google.displayDetails();
	



	Citibank citi = new Citibank();
	citi.companyName="Citibank";
	citi.noOfEmployees=103890;
	citi.year=1960;
	citi.ceoName="Gupta";

	String solve12 = citi.solveProblem();

System.out.println(solve12);
citi.displayDetails();





	CocaCola cola = new CocaCola();
	cola.companyName="CocaCola";
	cola.noOfEmployees=4003890;
	cola.year=1920;
	cola.ceoName="Peram";

	String solve13 = cola.solveProblem();

System.out.println(solve13);
cola.displayDetails();





	Pepsico pepsi = new Pepsico();
	pepsi.companyName="Pepsico";
	pepsi.noOfEmployees=203890;
	pepsi.year=1935;
	pepsi.ceoName="Chahal";

	String solve14 = pepsi.solveProblem();

System.out.println(solve14);
pepsi.displayDetails();





	Vertusa vert = new Vertusa();
	vert.companyName="Vertusa";
	vert.noOfEmployees=503890;
	vert.year=1930;
	vert.ceoName="Jack";

	String solve15 = vert.solveProblem();

System.out.println(solve15);
vert.displayDetails();
}

}


