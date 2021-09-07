class IplTeams{
static String[] teamNames=new String[8];
public static void main(String a[]){
teamNames[0]="Chennai Super Kings";
teamNames[1]="Royal Challengers Bengaluru";
teamNames[2]="Mumbai Indians";
teamNames[3]="Kolkata Knight Riders";
teamNames[4]="Rajasthan Royals";
teamNames[5]="Delhi Capitals";
teamNames[6]="Sunrisers Hyderabad";
teamNames[7]="Punjab Kings";
getIplTeams();
}
public static void getIplTeams(){
System.out.println(IplTeams.length);
for(int i=0; i<IplTeams.length; i++){
System.out.println(IplTeams.length[i]+" ");
}
}
}







