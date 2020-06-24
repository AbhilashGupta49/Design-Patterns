package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * A factory for creating Page objects.
 */
public class PageFactory {

	/** The type map. */
	private static Map<String, PageType> typeMap = new HashMap<>();

	/**
	 * Gets the page type.
	 *
	 * @param quality   the quality
	 * @param thickness the thickness
	 * @return the page type
	 */
	public static PageType getPageType(String quality, int thickness) {
		PageType type = typeMap.get(quality + thickness);
		if (type == null) {
			type = new PageType(quality, thickness);
			typeMap.put(quality + thickness, type);
		}
		return type;
	}
}
