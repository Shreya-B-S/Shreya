class CountryName1{
static String []countryName=new String[7];
public static void main(String a[])
{
countryName[0]="India";
countryName[1]="Pakistan";
countryName[2]="Sri Lanka";
countryName[3]="England";
countryName[4]="USA";
countryName[5]="Andorra";
countryName[6]="Afghanistan";
getCountryNames();
}
public static void getCountryNames(){
System.out.println(countryName.length);
for(int i=0; i<countryName.length; i++)
{
System.out.println(countryName[i]+" ");
}
}
}