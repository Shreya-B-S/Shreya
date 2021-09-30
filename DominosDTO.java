public class DominosDTO
{


public DominosDTO()
{
System.out.println("Order is created");
}


private long orderId;
private String customerName;
private String location;
private int cost;



public long getOrderId()
{
return orderId;
}
public void setOrderId(long orderId)
{
this.orderId=orderId;
}



public String getCustomerName()
{
return customerName;
}
public void setCustomerName(String customerName)
{
this.customerName=customerName;
}



public String getLocation()
{
return location;
}
public void setLocation(String location)
{
this.location=location;
}



public int getCost()
{
return cost;
}
public void setCost(int cost)
{
this.cost=cost;
}





}