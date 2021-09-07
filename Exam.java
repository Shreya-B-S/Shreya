class Exam{
public static String universityName="VTU";
public static String[] hallTicket={"Ramdev Baba","PATA2006AY001","Home Products"};
public static int fees=1350;
public static boolean allow(String[] hallTicket){
boolean allowedToWriteExam=false;
if(fees>1000){
if(hallTicket!=null){
allowedToWriteExam=true;
getHallTicket(hallTicket);
return allowedToWriteExam;
}
else{
System.out.println("No HallTicket!!! cannot allow to write exam");
}
}
else{
System.out.println("Gube Please pay the fees");
}
return allowedToWriteExam;
}
public static void getHallTicket(String[] hallTicket){
for(int i=0; i<hallTicket.length; i++){
System.out.println(hallTicket[i]);
}
}
}