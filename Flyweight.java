package Ex5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Flyweight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> displayPaintColor = Arrays.asList("Red", "Green", "Blue", "White", "Yellow");
		System.out.println(displayPaintColor);
		while (true) {
			System.out.println("Enter Color:");
			String paintColor = input.next();
			ColorBrush colorBrush = (ColorBrush) PaintFactory.getColor(paintColor);
			colorBrush.displayPaintColor();
		}
	}
}

interface Brush {
	void displayPaintColor();
}

class ColorBrush implements Brush {
	private String paintColor;

	public ColorBrush(String paintColor) {
		this.paintColor = paintColor;
	}

	@Override
	public void displayPaintColor() {
		System.out.println("Paint colour=" + paintColor);

	}

}

class PaintFactory {
	private static final HashMap<String, ColorBrush> colorMap = new HashMap<>();

	public static Brush getColor(String paintColor) {
		ColorBrush colorBrush = (ColorBrush) colorMap.get(paintColor);
		if (colorBrush == null) {
			colorBrush = new ColorBrush(paintColor);
			colorMap.put(paintColor, colorBrush);
			System.out.println("Buying paintColor : " + paintColor);
		}
		System.out.println(colorMap);
		return colorBrush;
	}

}

