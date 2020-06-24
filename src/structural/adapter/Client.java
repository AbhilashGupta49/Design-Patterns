package structural.adapter;

/**
 * The Class Client.
 */
public class Client {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		HourUnit hours = new HourUnit(10);
		System.out.println("Hours - " + hours.getData());
		Adapter minuteAdapter = new MinuteUnitAdapter(hours);
		System.out.println("Minutes - " + minuteAdapter.getConvertedData().getData());
	}

}
