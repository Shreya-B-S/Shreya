class LibraryUtil
{

public static void main(String a[])
{

LibraryDTO lib=new LibraryDTO();

	lib.setLibraryId(123456789L);
	lib.setName("Dev");
	lib.setType("Central");
	lib.setLocation("Rajajinagar");

System.out.println(lib.getLibraryId()+" "+lib.getName()+" "+lib.getType()+" "+lib.getLocation());

}

}