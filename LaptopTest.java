class LaptopTest

{

public static void main(String a[])

{

Laptop laptop=new Laptop();
	laptop.brandName="Dell";
	laptop.core="i7";
	laptop.color="Black";
	laptop.price=75000;



Laptop laptop1=new Laptop();
	laptop1.brandName="HP";
	laptop1.core="i5";
	laptop1.color="Silver";
	laptop1.price=50000;


Laptop laptop2=new Laptop();
	laptop2.brandName="Lenovo";
	laptop2.core="i3";
	laptop2.color="Black";
	laptop2.price=40000;

Laptop laptop3=new Laptop();
	laptop3.brandName="Asus";
	laptop3.core="i5";
	laptop3.color="Black";
	laptop3.price=48000;


System.out.println(laptop.brandName+" "+laptop.core+" "+laptop.color+" "+laptop.price);
System.out.println(laptop1.brandName+" "+laptop1.core+" "+laptop1.color+" "+laptop1.price);
System.out.println(laptop2.brandName+" "+laptop2.core+" "+laptop2.color+" "+laptop2.price);
System.out.println(laptop3.brandName+" "+laptop3.core+" "+laptop3.color+" "+laptop3.price);


laptop.code();

}

}