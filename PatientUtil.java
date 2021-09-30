class PatientUtil
{

public static void main(String a[])
{

PatientDTO dto= new PatientDTO();
	dto.setPatientId(2154232450L);
	dto.setPatientName("Dev");
	dto.setAge(90);
	dto.setGender("Male");
	dto.setAddress("NagarBhavi circle");
	dto.setBloodGroup("B+");

System.out.println(dto.getPatientId()+" "+dto.getPatientName()+" "+dto.getAge()+" "+dto.getGender()+" "+dto.getAddress()+" "+dto.getBloodGroup());

}
}