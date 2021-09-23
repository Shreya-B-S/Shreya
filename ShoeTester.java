class ShoeTester
{

public static void main(String a[])




{

	Shoe shoe=new Shoe();
		shoe.brandName="Adidas";
		shoe.color="White";
		shoe.price=3500;
		shoe.size=10;


System.out.println(shoe.brandName+" "+shoe.color+" "+shoe.price+" "+shoe.size);

	shoe.wear();




	Shoe shoe1=new Shoe();
		shoe1.brandName="Lancer";
		shoe1.color="Black";
		shoe1.price=2000;
		shoe1.size=9;

System.out.println(shoe1.brandName+" "+shoe1.color+" "+shoe1.price+" "+shoe1.size);

	shoe1.wear();






	Shoe shoe2=new Shoe();
		shoe2.brandName="Buddies";
		shoe2.color="Pink";
		shoe2.price=1500;
		shoe2.size=8;

System.out.println(shoe2.brandName+" "+shoe2.color+" "+shoe2.price+" "+shoe2.size);

	shoe2.wear();

}


























}