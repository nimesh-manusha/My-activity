public class District{
	public static void main(String args[]){
		
		Schools girls = new Schools();
		District place = new District();

		place.Colombo(girls.school1);
		place.Kandy(girls.school2);
		place.Gampaha(girls.school3);
		place.Galle(girls.school4);
		place.Mathara(girls.school5);
	}

	public void Colombo(String g){
		System.out.println("Colombo Girl's School: " + g);
	}

	public void Kandy(String g){
		System.out.println("Kandy Girl's School: " + g);
	}
	
	public void Gampaha(String g){
		System.out.println("Gampaha Girl's School: " + g);
	}

	public void Galle(String g){
		System.out.println("Galle Girl's School: " + g);
	}

	public void Mathara(String g){
		System.out.println("Mathara Girl's School: " + g);
	}
}