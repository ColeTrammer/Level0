import javax.swing.JOptionPane;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class ObediantTortoise {
	public static void main(String args[]) {
		Tortoise.setSpeed(10);
		String color = JOptionPane.showInputDialog("What color do you want?");
		if(color.equalsIgnoreCase("red"))
			Tortoise.setPenColor(PenColors.Reds.Red);
		else if(color.equalsIgnoreCase("green"))
			Tortoise.setPenColor(PenColors.Greens.Green);
		else if(color.equalsIgnoreCase("yellow"))
			Tortoise.setPenColor(PenColors.Yellows.Yellow);
		else if(color.equalsIgnoreCase("blue"))
			Tortoise.setPenColor(PenColors.Blues.Blue);
		else if(color.equalsIgnoreCase("brown"))
			Tortoise.setPenColor(PenColors.Browns.Brown);
		else if(color.equalsIgnoreCase("gray"))
			Tortoise.setPenColor(PenColors.Grays.Gray);
		else if(color.equalsIgnoreCase("orange"))
			Tortoise.setPenColor(PenColors.Oranges.Orange);
		else if(color.equalsIgnoreCase("cyan"))
			Tortoise.setPenColor(PenColors.Blues.Cyan);
		else if(color.equalsIgnoreCase("black"))
			Tortoise.setPenColor(PenColors.Grays.Black);
		else 
			Tortoise.setPenColor(PenColors.getRandomColor());

		drawShape(Integer.parseInt(JOptionPane.showInputDialog("How many sides do you want to have(360 is a circle)?")));
	}

	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(360 / 4);
		}
	}

	static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(100);
			Tortoise.turn(360 / 3);
		}
	}

	static void drawCircle() {
		Tortoise.setSpeed(10);
		for (int i = 0; i < 360; i++) {
			Tortoise.move(100 / 360);
			Tortoise.turn(360 / 360);
		}
	}
	static void drawShape(int sides) {
		for (int i = 0; i < sides; i++) {
			Tortoise.move(360 * 2.5 / sides);
			Tortoise.turn(360 / sides);
		}
	}
}
