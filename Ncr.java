class Ncr{
public static void main(String a[])
{
System.out.println("main method started");
int nCr=(fact(5)/fact(5-3)*fact(3));
System.out.println(nCr);
System.out.println("main method ended");
}
public static int fact(int num)
{
System.out.println("fact method started");
int fact=1;
for(int i=1; i<=num; i++){
fact=fact*i;
}
System.out.println("fact method ended");
return fact;
}
}

