import java.util.Scanner;
class BankingUtil
{
static String[] passBook=new String[3];
public static void main(String a[])
{
System.out.println("main method started");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
String name=sc.next();
System.out.println("Enter IFSC Code");
String ifscCode=sc.next();
System.out.println("Enter Aadhaar details");
String aadhaarDetails=sc.next();
passBook[0]=name;
passBook[1]=ifscCode;
passBook[2]=aadhaarDetails;
Banking.transaction(passBook);
System.out.println("main method ended");
}
}