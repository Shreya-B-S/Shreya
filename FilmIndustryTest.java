class FilmIndustryTest

{
public static void main(String a[])

{
	FilmIndustry filmIndustry=new FilmIndustry();
		filmIndustry.name="Sandalwood";
		filmIndustry.noOfWorkers=4000;
		filmIndustry.year=1960;

	FilmIndustry filmIndustry1=new FilmIndustry();
		filmIndustry1.name="Bollywood";
		filmIndustry1.noOfWorkers=8000;
		filmIndustry1.year=1965;

	FilmIndustry filmIndustry2=new FilmIndustry();
		filmIndustry2.name="Tollywood";
		filmIndustry2.noOfWorkers=6000;
		filmIndustry2.year=1970;

System.out.println(filmIndustry.name+" "+filmIndustry.noOfWorkers+" "+filmIndustry.year);
System.out.println(filmIndustry1.name+" "+filmIndustry1.noOfWorkers+" "+filmIndustry1.year);
System.out.println(filmIndustry2.name+" "+filmIndustry2.noOfWorkers+" "+filmIndustry2.year);

		filmIndustry.act();

}


}










