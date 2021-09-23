class ChocolateTest

{

public static void main(String a[])

{
	Chocolate chocolate=new Chocolate();
		chocolate.chocolateName="Temptation";
		chocolate.color="Black";
		chocolate.price=90;
		chocolate.shape="rectangle";

	Chocolate chocolate1=new Chocolate();
		chocolate1.chocolateName="Dairy Milk";
		chocolate1.color="Brown";
		chocolate1.price=100;
		chocolate1.shape="rectangle";


	Chocolate chocolate2=new Chocolate();
		chocolate2.chocolateName="Milky Bar";
		chocolate2.color="White";
		chocolate2.price=40;
		chocolate2.shape="rectangle";

System.out.println(chocolate.chocolateName+" "+chocolate.color+" "+chocolate.price+" "+chocolate.shape);
System.out.println(chocolate1.chocolateName+" "+chocolate1.color+" "+chocolate1.price+" "+chocolate1.shape);
System.out.println(chocolate2.chocolateName+" "+chocolate2.color+" "+chocolate2.price+" "+chocolate2.shape);


	chocolate.eat();

}

}