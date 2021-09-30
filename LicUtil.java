class LicUtil
{

public static void main(String a[])
{

LicDTO lic=new LicDTO();
	
	lic.setPolicyId(123456789L);
	lic.setCustomerName("Devendra Singh");
	lic.setYears(1990);

System.out.println(lic.getPolicyId()+" "+lic.getCustomerName()+" "+lic.getYears());

}

}