package cleancode;

public class Naming1 {

	int a;
	String fnme;
	String lnme;
	String adr;
	String c = "INDIA";

	public Naming1(int a, String fnme, String lnme, String adr) {
		this.a = a;
		this.fnme = fnme;
		this.lnme = lnme;
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Naming1 [a=" + a + ", fnme=" + fnme + ", lnme=" + lnme + ", adr=" + adr + ", c=" + c + "]";
	}

}
