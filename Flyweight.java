package Ex5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Flyweight {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> paint = Arrays.asList("Red", "Green", "Blue", "White", "Yellow");
		System.out.println(paint);
		while (true) {
			System.out.println("Enter Color:");
			String colour = scan.next();
			ColourBrush colourbrush = (ColourBrush) PaintFactory.getColor(colour);
			colourbrush.paint();
		}
	}
}

interface Brush {
	void paint();
}

class ColourBrush implements Brush {
	private String colour;

	public ColourBrush(String colour) {
		this.colour = colour;
	}

	@Override
	public void paint() {
		System.out.println("Paint colour=" + colour);

	}

}

class PaintFactory {
	private static final HashMap<String, ColourBrush> colorMap = new HashMap<>();

	public static Brush getColor(String colour) {
		ColourBrush colourbrush = (ColourBrush) colorMap.get(colour);
		if (colourbrush == null) {
			colourbrush = new ColourBrush(colour);
			colorMap.put(colour, colourbrush);
			System.out.println("Buying colour : " + colour);
		}
		System.out.println(colorMap);
		return colourbrush;
	}

}

