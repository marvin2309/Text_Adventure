/**
 * 
 */
package venedigundparis;

/**
 * @author User
 *
 */
public class ZweiteCooleKlasse implements DasInterface {

	@Override
	public void strings() {
		System.out.println(DasEnum.ZWEITEKL.getString());
	}

	@Override
	public String voids(String str) {
		return DasEnum.SAUCOOL.getString();
	}

	@Override
	public int integers(int inte) {
		return inte + 77;
	}

}
