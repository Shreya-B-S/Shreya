class Factorial{
public static void main(String a[])
{
System.out.println("main method started");
myFactorial(8,4);
System.out.println("main method ended");
}
public static void myFactorial(int n, int r)
{
System.out.println("myFactorial method started");
int fact=1;
for(int i=1; i<=n; i++){
fact=fact*i;
}
System.out.println(fact);
int rfact=1;
for(int i=1; i<=r; i++){
rfact=rfact*i;
}
System.out.println(rfact);
int a=(n-r);
int afact=1;
for(int i=1; i<=a; i++){
afact=afact*i;
}
System.out.println(afact);
int bfact=(afact)*(rfact);
int result=fact/bfact;
System.out.println(result);
System.out.println("myFactorial method ended");
}
}
