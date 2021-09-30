class GoldUtil
{

public static void main(String a[])
{

GoldDTO gold=new GoldDTO();

	gold.setGoldId("123456");
	gold.setColor("Gold yellow");
	gold.setCarat("24K");
	gold.setWeight(5);

System.out.println(gold.getGoldId()+" "+gold.getColor()+" "+gold.getCarat()+" "+gold.getWeight() );

}


}