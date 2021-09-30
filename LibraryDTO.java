public class LibraryDTO
{

public LibraryDTO()
{
System.out.println("Object is created");
}



private long libraryId;
private String name;
private String type;
private String location;




public long getLibraryId()
{
return libraryId;
}
public void setLibraryId(long libraryId)
{
this.libraryId=libraryId;
}




public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}




public String getType()
{
return type;
}
public void setType(String Type)
{
this.type=type;
}




public String getLocation()
{
return location;
}
public void setLocation(String location)
{
this.location=location;
}






}