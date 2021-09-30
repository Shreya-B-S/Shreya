public class GoldDTO
{

public GoldDTO()
{
System.out.println("Object is created");
}


private String goldId;
private String color;
private String carat;
private int weight;



public String getGoldId()
{
return goldId;
}
public void setGoldId(String goldId)
{
this.goldId=goldId;
}



public String getColor()
{
return color;
}
public void setColor(String color)
{
this.color=color;
}



public String getCarat()
{
return carat;
} 
public void setCarat(String carat)
{
this.carat=carat;
}



public int getWeight()
{
return weight;
}
public void setWeight(int weight)
{
this.weight=weight;
}


}