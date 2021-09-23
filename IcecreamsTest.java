class IcecreamsTest

{

public static void main(String a[])

{

	Icecreams icecreams=new Icecreams();
		icecreams.name="Vanilla Slab";
		icecreams.shape="Rectangle";
		icecreams.color="White";
		icecreams.cost=50;


	Icecreams icecreams1=new Icecreams();
		icecreams1.name="Cornetto";
		icecreams1.shape="Cone";
		icecreams1.color="Brown";
		icecreams1.cost=75;

	Icecreams icecreams2=new Icecreams();
		icecreams2.name="Straw Berry Candy";
		icecreams2.shape="Semi-circle";
		icecreams2.color="Pink";
		icecreams2.cost=30;

System.out.println(icecreams.name+" "+icecreams.shape+" "+icecreams.color+" "+icecreams.cost);
System.out.println(icecreams1.name+" "+icecreams1.shape+" "+icecreams1.color+" "+icecreams1.cost);
System.out.println(icecreams2.name+" "+icecreams2.shape+" "+icecreams2.color+" "+icecreams2.cost);

	icecreams.flavour();

}

}