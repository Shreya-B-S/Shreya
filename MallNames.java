class MallNames{
static String[] mallNames=new String[5];
public static void main(String a[]){
mallNames[0]="Orion Mall";
mallNames[1]="Mantri Square";
mallNames[2]="City Centre";
mallNames[3]="SS";
mallNames[4]="Vishal Mart";
getMallNames();
}
public static void getMallNames(){
System.out.println(mallNames.length);
for(int i=0; i<mallNames.length; i++){
System.out.println(mallNames[i]+" ");
}
}
}













