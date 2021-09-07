class IplTeamNames{
static String[] iplTeamNames=new String[8];
public static void main(String a[]){
iplTeamNames[0]="Chennai Super Kings";
iplTeamNames[1]="Royal Challengers Bengaluru";
iplTeamNames[2]="Mumbai Indians";
iplTeamNames[3]="Kolkata Knight Riders";
iplTeamNames[4]="Rajasthan Royals";
iplTeamNames[5]="Delhi Capitals";
iplTeamNames[6]="Sunrisers Hyderabad";
iplTeamNames[7]="Punjab Kings";
getIplTeamsNames();
}
public static void getIplTeamsNames(){
System.out.println(iplTeamsNames.length);
for(int i=0; i<iplTeamsNames.length; i++){
System.out.println(iplTeamsNames[i]+" ");
}
}
}


