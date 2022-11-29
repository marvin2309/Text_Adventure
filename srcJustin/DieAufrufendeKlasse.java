/**
 * 
 */
package venedigundparis;

/**
 * @author User
 *
 */
public class DieAufrufendeKlasse {
	private final DasInterface noice;
	public DieAufrufendeKlasse() {
		this(new EineCooleKlasse(3));
	}
	public DieAufrufendeKlasse(int inte) {
		this(new EineCooleKlasse(inte));
	}
	public DieAufrufendeKlasse(DasInterface interf) {
		this.noice = interf;
	}
	public void ausf() {
		noice.strings();
		System.out.println(noice.integers(3));
		System.out.println(noice.voids(" Ich bin eine Biene"));
	
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DieAufrufendeKlasse lulw = new DieAufrufendeKlasse(4);
		lulw.ausf();
		System.out.println("-----------------");
		DieAufrufendeKlasse lulww= new DieAufrufendeKlasse(new ZweiteCooleKlasse());
		lulww.ausf();
	}

}
