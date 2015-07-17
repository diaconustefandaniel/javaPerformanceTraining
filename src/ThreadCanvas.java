import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

import javax.swing.JFrame;

public class ThreadCanvas {
    static int size = 15;
    public static void main(String[] args) {
        //create a jframe and adds boxes to it
        final List<Box> boxes = new ArrayList<>();
        final List<Color> color=new ArrayList<>();
        
       /* color.add(Color.BLACK);
        color.add(Color.RED);
        color.add(Color.GREEN);
        color.add(Color.CYAN);
        color.add(Color.YELLOW);
        color.add(Color.PINK);
        color.add(Color.WHITE);*/
        
        
       // ExecutorService executor = Executors.newFixedThreadPool();
        JFrame frame = new JFrame("example");
        frame.setLayout(new GridLayout(size, size));
        for (int i=0;i<size*size; i++){
            final Box box = new Box();
            box.changeColor();
            boxes.add(box);
            frame.add(box);
        }

        frame.repaint();
        frame.setSize(1400, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (Box box:boxes){
            box.startBlinking();
        }
    }
}

class Box extends Canvas{

    public Box(){
    }

    public void startBlinking(){
        ColorChanger cg = new ColorChanger(this);
        cg.start();
    }

    public void changeColor(){
        Color color = new Color((int)( Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        this.setBackground(color);
        System.out.println(color);
    }
}

class ColorChanger extends Thread{
    Box box;
    int pause = 50;

    public ColorChanger(Box box){
        this.box = box;
    }
    @Override
    public void run(){
        while (true) {
            box.changeColor();
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}