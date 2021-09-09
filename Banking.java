class Banking{
public static String bankName="State Bank Of India";
public static int minimumBalance=1000;
public static void transaction(String[]passBook){
System.out.println("Inside transaction method");
if(minimumBalance>1000){
System.out.println("Transaction can be done");
if(passBook!=null){
getPassBookDetails(passBook);
System.out.println("Allowed to do banking");
}
else{
System.out.println("PassBook not found");
}
}
else{
System.out.println("Please deposit the money for more than the minimum balance");
}
System.out.println("End of transaction method");
}
public static void getPassBookDetails(String[]passBook){
for(int i=0; i<passBook.length; i++){
System.out.println(passBook[i]);
}
}
}