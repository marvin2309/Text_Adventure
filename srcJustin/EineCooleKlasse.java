/**
 * 
 */
package venedigundparis;

/**
 * @author User
 *
 */
public final class EineCooleKlasse implements DasInterface{
	private final int cool;
	public EineCooleKlasse(int integre) {
		this.cool = integre;
	}
	@Override
	public void strings() {
		if(cool % 2 == 0){
			System.out.println(DasEnum.WON.getString());
		} else {
			System.out.println(DasEnum.LOST.getString());
		}
	}

	@Override
	public String voids(String str) {
		return DasEnum.BRO.getString() + str;
	}

	@Override
	public int integers(int inte) {
		return DasEnum.INT.getInt() + inte;
	}
}
