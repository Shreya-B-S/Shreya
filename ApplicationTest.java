class ApplicationTest

{

public static void main(String a[])

{
	Application application=new Application();
		application.name="Gmail";
		application.version="GM001";
		application.users=10101114;
		application.year=1970;

	Application application1=new Application();
		application1.name="Instagram";
		application1.version="INS002";
		application1.users=2589654;
		application1.year=2015;

	Application application2=new Application();
		application2.name="Whatsapp";
		application2.version="WTS007";
		application2.users=14725;
		application2.year=2012;


System.out.println(application.name+" "+application.version+" "+application.users+" "+application.year);
System.out.println(application1.name+" "+application1.version+" "+application1.users+" "+application1.year);
System.out.println(application2.name+" "+application2.version+" "+application2.users+" "+application2.year);

	application.use();
}
}