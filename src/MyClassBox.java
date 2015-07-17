/*import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Box extends Canvas {

	Color bgColor;
	ColorChanger colorchanger=new ColorChanger();

	public void changeBlinking() {
		// starts the colorChanger
	}

	public void changeColor() {
		int i = (int) (Math.random() * 4);
		if (i % 4 == 0)
			this.bgColor = Color.blue;
		else if (i % 3 == 0)
			this.bgColor = Color.RED;
		else if (i % 2 == 0)
			this.bgColor = Color.YELLOW;
		else if (i % 1 == 0)
			this.bgColor = Color.CYAN;
		i++;
		this.setBackground(bgColor);

		// assign random color & repainting
	}

}

class ColorChanger extends Thread {
	Box box;
	int pause;

	public void run() {

	}

}


 * class Test{
 * 
 * JFrame frame = new JFrame("JFrame Example"); Box b1=new Box(); Box b2=new
 * Box(); public void initialize() { frame.add(b1); }
 * 
 * }
 

public class MyClassBox {

	// panel.setLayout(new FlowLayout());

	public static void main(String argv[]) throws InterruptedException {
		int size = 5;
		List<Box> boxes = new ArrayList<Box>();
		JFrame frame = new JFrame("JFrame Example");
		frame.setLayout(new GridLayout(size, size));

		for (int i = 0; i < size * size; i++) {

			final Box box = new Box();
			boxes.add(box);
			frame.add(box);
		}
		List<Color> listColor = new ArrayList<Color>();
		listColor.add(Color.BLACK);
		listColor.add(Color.RED);
		listColor.add(Color.BLUE);
		listColor.add(Color.yellow);

		int i = 0;
		for (int j = 0; j < 5; j++) {
			
			for (Box box : boxes) {
				box.changeColor();
				i++;
				// box.bgColor=startNlinking();
			}
			Thread.sleep(1000);
			frame.repaint();
		}
		//frame.repaint();
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
*/