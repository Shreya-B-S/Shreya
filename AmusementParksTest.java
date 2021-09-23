class AmusementParksTest

{

public static void main(String a[])

{
	AmusementParks amusementParks=new AmusementParks();
		amusementParks.name="Wonder Laa";
		amusementParks.costPerHead=900;
		amusementParks.noOfGames=40;
		amusementParks.location="Banglore";

	AmusementParks amusementParks1=new AmusementParks();
		amusementParks1.name="GRS";
		amusementParks1.costPerHead=700;;
		amusementParks1.noOfGames=25;
		amusementParks1.location="Mysore";

	AmusementParks amusementParks2=new AmusementParks();
		amusementParks2.name="Veega Land";
		amusementParks2.costPerHead=800;
		amusementParks2.noOfGames=35;
		amusementParks2.location="Kerala";

System.out.println(amusementParks.name+" "+amusementParks.costPerHead+" "+amusementParks.noOfGames+" "+amusementParks.location);
System.out.println(amusementParks1.name+" "+amusementParks1.costPerHead+" "+amusementParks1.noOfGames+" "+amusementParks1.location);
System.out.println(amusementParks2.name+" "+amusementParks2.costPerHead+" "+amusementParks2.noOfGames+" "+amusementParks2.location);

	amusementParks.enjoy();	

}


}