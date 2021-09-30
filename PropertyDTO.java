public class PropertyDTO
{

public PropertyDTO()
{
System.out.println("Object is created");
}

private long propertyId;
private String name;
private String size;
private String type;



public long getPropertyId()
{
return propertyId;
}
public void setPropertyId(long propertyId)
{
this.propertyId=propertyId;
}




public String getName()
{
return name;
}
public void setName(String Name)
{
this.name=name;
}





public String getSize()
{
return size;
}
public void setSize(String size)
{
this.size=size;
}





public String getType()
{
return type;
}
public void setType(String type)
{
this.type=type;
}






}