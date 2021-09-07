class TempleNames{
static String[] templeNames=new String[6];
public static void main(String a[]){
templeNames[0]="Kote Anjaneya Swamy Temple";
templeNames[1]="Dharmasthala";
templeNames[2]="Kukke Subramanya";
templeNames[3]="Kollur Mookambike Temple";
templeNames[4]="Hornadu";
templeNames[5]="Shringeri";
getTempleNames();
}
public static void getTempleNames(){
System.out.println(templeNames.length);
for(int i=0; i<templeNames.length; i++){
System.out.println(templeNames[i]+" ");
}
}
}



















