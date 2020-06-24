package creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * A factory for creating ContainerPrototype objects.
 */
public class ContainerPrototypeFactory {

	/** The Constant containerRegistry. */
	private static final Map<String, Container> containerRegistry = new HashMap<>();

	static {
		containerRegistry.put("simple", new SimpleContainer());
	}

	/**
	 * Gets the container.
	 *
	 * @param type the type
	 * @return the container
	 */
	public static Container getContainer(String type) {
		return containerRegistry.get(type).cloneContainer();
	}

	/**
	 * Adds the container.
	 *
	 * @param type      the type
	 * @param container the container
	 */
	public static void addContainer(String type, Container container) {
		containerRegistry.put(type, container);
	}

}
