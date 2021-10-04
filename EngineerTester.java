class EngineerTester

{
public static void main(String a[])

{

	Electrical elec = new Electrical();
	elec.branchName="Electrical and Electronics";
	elec.noOfStudents=85;
	elec.fees=100000;
	elec.noOfFaculties=40;
	elec.hodName="Thejaswi A H";
	elec.noOfClassrooms=15;

	String study1 = elec.learn();

System.out.println(study1);
elec.displayDetails();




ComputerScience cs = new ComputerScience();
	cs.branchName="Computer Science";
	cs.noOfStudents=140;
	cs.fees=150000;
	cs.noOfFaculties=60;
	cs.hodName="John";
	cs.noOfClassrooms=50;

	String study2 = cs.learn();

System.out.println(study2);
cs.displayDetails();



	Electronics electronics = new Electronics();
	electronics.branchName="Electronics and Communication";
	electronics.noOfStudents=150;
	electronics.fees=140000;
	electronics.noOfFaculties=65;
	electronics.hodName="Antony";
	electronics.noOfClassrooms=55;

	String study3 = electronics.learn();

System.out.println(study3);
elec.displayDetails();



	Civil civ = new Civil();
	civ.branchName="Civil Engineer";
	civ.noOfStudents=120;
	civ.fees=130000;
	civ.noOfFaculties=60;
	civ.hodName="George";
	civ.noOfClassrooms=50;

	String study4 = civ.learn();

System.out.println(study4);
civ.displayDetails();





	Mechanical mech = new Mechanical();
	mech.branchName="Mechanical Engineer";
	mech.noOfStudents=130;
	mech.fees=135000;
	mech.noOfFaculties=45;
	mech.hodName="Micheal";
	mech.noOfClassrooms=35;

	String study5 = mech.learn();

System.out.println(study5);
mech.displayDetails();


}


}