class Election{
public static String electionName="Rajya Sabha Election";
public static int age=18;
public static String voting(String[]voterId){
System.out.println("Inside voting method");
if(age>=18){
System.out.println("allowed to vote show me the voterId");
if(voterId!=null){
getVoterIdDetails(voterId);
System.out.println("Allowed to vote");
}
else{
System.out.println("voterId not found");
}
}
else{
System.out.println("Please update the voterId");
}
System.out.println("End of the voting method");
}
public static void getVoterIdDetails(String[]voterId){
for(int i=0; i<voterId.length; i++){
System.out.println(voterId[i]);
}
}
}