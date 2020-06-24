package behavioral.memento;

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
		GameBean game = new GameBean();
		Caretaker caretaker = new Caretaker();
		game.setState(new Coordinate(10, 13));
		caretaker.addMemento(game.save());
		game.setState(new Coordinate(12, 15));
		caretaker.addMemento(game.save());
		game.setState(new Coordinate(17, 20));
		game.restore(caretaker.getMemento());
	}
}
