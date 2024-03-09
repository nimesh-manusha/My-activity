public class AgeCal {
	public static void main (String[] args) {
		int isuriniAge;
		int fatherAge = 40;
		int motherAge;
		int brotherAge;

		motherAge = fatherAge-10;
		isuriniAge = motherAge/2;
		brotherAge = isuriniAge/3;

		System.out.println("Isuruni's Age= " + isuriniAge);
		System.out.println("Father's Age= " + fatherAge);
		System.out.println("Mother's Age= " + motherAge);
		System.out.println("Brother's Age= " + brotherAge);
	}
}