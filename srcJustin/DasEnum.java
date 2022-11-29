/**
 * 
 */
package venedigundparis;

/**
 * @author User
 *
 */
public enum DasEnum{
	WON("you've won", 1), 
	
	LOST("you've lost", 2),
	
	BRO("cool story bro", 3),
	
	INT("", 5),
	
	SAUCOOL("es macht was anderes sau cool", 7),
	
	ZWEITEKL("Das ist die zweite coole Klasse mega", 8)
	;
	private final String stringe;
	private final int integre;
	private DasEnum(String str, int inte) {
		this.stringe = str;
		this.integre = inte;
	}
	public String getString() {
		return stringe;
	}
	public int getInt() {
		return integre;
	}
}
