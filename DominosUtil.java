class DominosUtil
{

public static void main(String a[])
{

DominosDTO dto=new DominosDTO();

	dto.setOrderId(123456789L);
	dto.setCustomerName("Shreya");
	dto.setLocation("Rajajinagar");
	dto.setCost(450);


System.out.println(dto.getOrderId()+" "+dto.getCustomerName()+" "+dto.getLocation()+" "+dto.getCost());
}

}
