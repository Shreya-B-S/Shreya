class SweetTester

{


public static void main(String a[])

{

Sweet sweet=new Sweet();
	sweet.sweetName="Kaaju Bharfi";
	sweet.price=300;


Sweet sweet1=new Sweet();
	sweet1.sweetName="Champakali";
	sweet1.price=250;


Sweet sweet2=new Sweet();
	sweet2.sweetName="Peda";
	sweet2.price=200;


System.out.println(sweet.sweetName+" "+sweet.price);
System.out.println(sweet1.sweetName+" "+sweet1.price);
System.out.println(sweet2.sweetName+" "+sweet2.price);


sweet.taste();

}


}