package project1;

public class Customer {

	private int cid;
	private String cName;
	private String cAddress;
	private String cCity;
	private String cDept;
	public int getCid() {
		return cid;
	}
	public void setcid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	public String getcCity() {
		return cCity;
	}
	public void setcCity(String cCity) {
		this.cCity = cCity;
	}
	public String getcDept() {
		return cDept;
	}
	public void setcDept(String cDept) {
		this.cDept = cDept;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cName=" + cName + ", cAddress=" + cAddress + ", cCity=" + cCity + ", cDept="
				+ cDept + "]";
	}
	
	
}
