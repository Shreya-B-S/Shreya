import java.util.Scanner;
class ElectionUtil
{
static String[] voterId=new String[2];
public static void main(String a[])
{
System.out.println("main method started");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the candidate name");
String candidateName=sc.next();
System.out.println("Enter voterId number");
String voterIdNumber=sc.next();
voterId[0]=candidateName;
voterId[1]=voterIdNumber;
Election.voting(voterId);
System.out.println("main method ended");
}
}