

public class Shape {
    int numSides;

    Shape(int numSides) {
        this.numSides = numSides; 
    }

    public void draw() {
        System.out.println("Assume we draw a shape with " + numSides + " sides.");
    }
}

class Triangle extends Shape {
    Triangle() {
        super(3);
    }

    @Override
    public void draw() {
        System.out.println("Assume we draw a triangle");
    }

    public static void main(String[] args) {
        Shape par = new Shape(3);
        Triangle tr = new Triangle();
        par.draw();
        tr.draw();
    }
}
