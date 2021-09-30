public class DrivingLicenseDTO
{



public DrivingLicenseDTO()
{
System.out.println("License is created");
}



private String drivingLicenseId;
private String name;
private int year;
private boolean isValid;



public String getDrivingLicenseId()
{
return drivingLicenseId;
}
public void setDrivingLicenseId(String drivingLicenseId)
{
this.drivingLicenseId=drivingLicenseId;
}



public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}




public int getYear()
{
return year;
}
public void setYear(int year)
{
this.year=year;
}




public boolean getIsValid()
{
return isValid;
}
public void setIsValid(boolean isValid)
{
this.isValid=isValid;
}



}