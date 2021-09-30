class PropertyUtil
{

public static void main(String a[])
{

PropertyDTO dto=new PropertyDTO();

	dto.setPropertyId(123456789L);
	dto.setName("Dev");
	dto.setSize("1500sq m");
	dto.setType("A Katha");

System.out.println(dto.getPropertyId()+" "+dto.getName()+" "+dto.getSize()+" "+dto.getType());

}

}