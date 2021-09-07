class WatchFactoryNames{
static String[] watchFactoryNames=new String[10];
public static void main(String a[]){
watchFactoryNames[0]="Bentley";
watchFactoryNames[1]="Titan";
watchFactoryNames[2]="Fastrack";
watchFactoryNames[3]="Timex";
watchFactoryNames[4]="Roadster";
watchFactoryNames[5]="Rolex";
watchFactoryNames[6]="Tommy Hilfiger";
watchFactoryNames[7]="Casio";
watchFactoryNames[8]="Dressberry";
watchFactoryNames[9]="Adidas";
getWatchFactoryNames();
}
public static void getWatchFactoryNames(){
System.out.println(watchFactoryNames.length);
for(int i=0; i<watchFactoryNames.length; i++){
System.out.println(watchFactoryNames[i]+" ");
}
}
}








