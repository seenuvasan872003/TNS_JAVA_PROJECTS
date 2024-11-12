package project3;

public class Student {

	private int Rollnumber;
	private String Name;
	private String Grade;
	private double Percentage;
	
	
	

	
	public int getRollnumber() {
		return Rollnumber;
	}





	public void setRollnumber(int rollnumber) {
		Rollnumber = rollnumber;
	}





	public String getName() {
		return Name;
	}





	public void setName(String name) {
		Name = name;
	}





	public String getGrade() {
		return Grade;
	}





	public void setGrade(String grade) {
		Grade = grade;
	}





	public double getPercentage() {
		return Percentage;
	}





	public void setPercentage(double percentage) {
		Percentage = percentage;
	}





	@Override
	public String toString() {
		return "Student [Rollnumber=" + Rollnumber + ", Name=" + Name + ", Grade=" + Grade + ", Percentage="
				+ Percentage+"%" + "]";
	}





	
	
	
	
	
	
	
}
