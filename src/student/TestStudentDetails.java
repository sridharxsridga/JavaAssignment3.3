/*
 * This class pass students details and prints his result.
 */

package student;
public class TestStudentDetails {

	public static void main(String[] args) {

		StudentDetails student1 = new StudentDetails("09nmsb5016", "Sridhar", 67, 34, 77);
		StudentDetails student2 = new StudentDetails("09nmsb5015", "Rohit", 48, 86, 89);
		StudentDetails student3 = new StudentDetails("09nmsb5014", "Amit", 67, 34, 78);
		StudentDetails student4 = new StudentDetails("09nmsb5012", "Ranjit", 25, 34, 7);
		System.out.println("\t\t\t\t\t Student Result Details ");

		System.out.println(student1 + "\n");
		System.out.println(student2 + "\n");
		System.out.println(student3 + "\n");
		System.out.println(student4 + "\n");

	}

}
