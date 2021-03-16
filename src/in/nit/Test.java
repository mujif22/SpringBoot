package in.nit;

public class Test {
	private int sid;
	private String sname;
	private String address;

	public static void main(String[] args) {
		
		Test t= new Test();

	}

	public int getSid() {
		return sid;
	}

	@Override
	public String toString() {
		return "Test [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
	}

	

}
