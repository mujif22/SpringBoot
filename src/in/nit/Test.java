package in.nit;

public class Test {
	private int sid;
	private String sname;
	private String address;

	public static void main(String[] args) {
		

	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Test [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
	}

}
