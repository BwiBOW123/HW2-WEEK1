package ShapeCreate;

import java.util.Scanner;

public class Foot {
    public String draw(int type){
        FootShape fs = new FootShape();
        switch (type) {
            case 1:
                Ellipse e = new Ellipse();
                return fs.drawAsEllipse(e);
            case 2:
                Rectangle r = new Rectangle();
                return fs.drawAsRectangle(r);
            default:
                return "Draw Foot";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = in.nextInt();
        
        Foot f = new Foot();
        System.out.println(f.draw(type));
    }

    
}