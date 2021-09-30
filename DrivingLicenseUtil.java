class DrivingLicenseUtil
{
public static void main(String a[])
{

DrivingLicenseDTO dto=new DrivingLicenseDTO();

	dto.setDrivingLicenseId("KA12GG4564");
	dto.setName("Shreya Gowda");
	dto.setYear(1999);
	dto.setIsValid(true);

System.out.println(dto.getDrivingLicenseId()+" "+dto.getName()+" "+dto.getYear()+" "+dto.getIsValid());
}

}