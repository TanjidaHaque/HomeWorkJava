package hw4Q2JavaVariables;

public class AboutMe {

	
		public String name;
		public byte age;
		public short myMonthlyHouseRent;
		public int myYearlyIncome;
		public float height;
		public double myGrade;
		public char sex;
		public long myProperties;
		public boolean usCitizen;

		// Default Constructor declared here
		public AboutMe() {
			System.out.println("This is about me");

		}

		public void aboutMe() {

			System.out.println("My Name is: " + name + "\nAge: " + age + "\nMonthly HouseRent: " + myMonthlyHouseRent
					+ "\nYearly Income: " + myYearlyIncome + "\nHeight: " + height + "\nGrade: " + myGrade + "\nSex: " + sex
					+ "\nmyProperties: " + myProperties + "\nUs Citizen: " + usCitizen);
		
			

	}

}
