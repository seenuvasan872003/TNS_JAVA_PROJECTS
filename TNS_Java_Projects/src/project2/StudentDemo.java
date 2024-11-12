package project2;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student S1=new Student();
		Student S2=new Student();
		Student S3=new Student();
		
		
		S1.setSid(100);
		S1.setSName("seenuvasan S");
		S1.setSdept("ECE");
		S1.setSstream("Engineering");
		S1.setSgraduation(2025);
		S1.setSyear("Final Year");
		S1.setSmobilenumber("9342238388");
		
		
		S2.setSid(101);
		S2.setSName("saravanan B");
		S2.setSdept("ECE");
		S2.setSstream("Engineering");
		S2.setSgraduation(2025);
		S2.setSyear("Final Year");
		S2.setSmobilenumber("6597542194");
		
		S3.setSid(102);
		S3.setSName("saravanan S");
		S3.setSdept("ECE");
		S3.setSstream("Engineering");
		S3.setSgraduation(2025);
		S3.setSyear("Final Year");
		S3.setSmobilenumber("9564120358");
		
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);

	}

}
