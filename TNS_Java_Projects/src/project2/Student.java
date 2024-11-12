package project2;

public class Student {

	private int Sid;
	private String SName;
	private String Sdept;
	private String Sstream;
	private int Sgraduation;
	private String Syear;
	private String Smobilenumber;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getSdept() {
		return Sdept;
	}
	public void setSdept(String sdept) {
		Sdept = sdept;
	}
	public String getSstream() {
		return Sstream;
	}
	public void setSstream(String sstream) {
		Sstream = sstream;
	}
	public int getSgraduation() {
		return Sgraduation;
	}
	public void setSgraduation(int sgraduation) {
		Sgraduation = sgraduation;
	}
	public String getSyear() {
		return Syear;
	}
	public void setSyear(String syear) {
		Syear = syear;
	}
	public String getSmobilenumber() {
		return Smobilenumber;
	}
	public void setSmobilenumber(String smobilenumber) {
		Smobilenumber = smobilenumber;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", SName=" + SName + ", Sdept=" + Sdept + ", Sstream=" + Sstream
				+ ", Sgraduation=" + Sgraduation + ", Syear=" + Syear + ", Smobilenumber=" + Smobilenumber + "]";
	}
	
	
	
	
	
	
}
