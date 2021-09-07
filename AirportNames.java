class AirportNames{
static String[] airportNames=new String[5];
public static void main(String a[]){
airportNames[0]="Donakonda Airport";
airportNames[1]="Bangalore International Airport";
airportNames[2]="Mangalore International Airport";
airportNames[3]="Vishakapatnam International Airport";
airportNames[4]="Delhi International Airport";
getAirportNames();
}
public static void getAirportNames(){
System.out.println(airportNames.length);
for(int i=0; i<airportNames.length; i++){
System.out.println(airportNames[i]+" ");
}
}
}














