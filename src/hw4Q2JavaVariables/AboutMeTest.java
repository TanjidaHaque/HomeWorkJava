package hw4Q2JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		
		AboutMe aboutMe = new AboutMe();
		aboutMe.name = "Tanjida";
		aboutMe.age = 22;
		aboutMe.myMonthlyHouseRent = 500;
		aboutMe.myYearlyIncome = 10000;
		aboutMe.height = 5.2f;
		aboutMe.myGrade = 3.00;
		aboutMe.sex = 'f';
		aboutMe.myProperties = 1000000000;
		aboutMe.usCitizen = true;
		aboutMe.aboutMe();

		System.out.println();

		AboutMe aboutMe1 = new AboutMe();
		aboutMe1.name = "Tanjida";
		aboutMe1.age = 22;
		aboutMe1.myMonthlyHouseRent = 500;
		aboutMe1.myYearlyIncome = 10000;
		aboutMe1.height = 5.4f;
		aboutMe1.myGrade = 3.50;
		aboutMe1.sex = 'f';
		aboutMe1.myProperties = 1000000000;
		aboutMe1.usCitizen = false;
		aboutMe1.aboutMe();
		
		
	}

}
