class BagTester
{

public static void main(String a[])

{
	Bag bag=new Bag();
		bag.brandName="Wild craft";
		bag.color="Purple";
		bag.price=1500;
		bag.noOfCompartments=7;

System.out.println(bag.brandName+" "+bag.color+" "+bag.price+" "+bag.noOfCompartments);

	bag.wear();



	Bag bag1=new Bag();
		bag1.brandName="American Tourister";
		bag1.color="Black";
		bag1.price=2000;
		bag1.noOfCompartments=5;
System.out.println(bag1.brandName+" "+bag1.color+" "+bag1.price+" "+bag1.noOfCompartments);

	bag1.wear();


Bag bag2=new Bag();
		bag2.brandName="Fastrack";
		bag2.color="Blue";
		bag2.price=2500;
		bag2.noOfCompartments=6;
System.out.println(bag2.brandName+" "+bag2.color+" "+bag2.price+" "+bag2.noOfCompartments);

	bag2.wear();

}

}