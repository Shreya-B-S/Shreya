class CameraTest

{

public static void main(String a[])
{
	Camera camera=new Camera();
		camera.name="Nikon";
		camera.cost=75000;
		camera.lens="DX198";

	Camera camera1=new Camera();
		camera1.name="Canon";
		camera1.cost=60000;
		camera1.lens="AX5648";

	Camera camera2=new Camera();
		camera2.name="Sony";
		camera2.cost=95000;
		camera2.lens="MX234";

System.out.println(camera.name+" "+camera.cost+" "+camera.lens);
System.out.println(camera1.name+" "+camera1.cost+" "+camera1.lens);
System.out.println(camera2.name+" "+camera2.cost+" "+camera2.lens);
	
	camera.capture();


}



}