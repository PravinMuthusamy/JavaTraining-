interface CalcArea {
    double area();
    double perimeter();
}

interface CalcVolume {
    double surfaceArea();
    double volume();
}

class Circle implements CalcArea {
    private double radius;
    private final double pi = Math.PI;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        return pi * radius * radius;
    }
    
    public double perimeter() {
        return 2 * pi * radius;
    }
}

class Square implements CalcArea {
    private double side;
    
    Square(double side) {
        this.side = side;
    }
    
    public double area() {
        return side * side;
    }
    
    public double perimeter() {
        return 4 * side;
    }
}

class Triangle implements CalcArea {
    private double a;
    private double b;
    private double c;
    
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    public double perimeter() {
        return a + b + c;
    }
}

class Sphere implements CalcArea, CalcVolume {
    private double radius;
    private final double pi = Math.PI;
    
    Sphere(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        return 4 * pi * radius * radius;
    }
    
    public double perimeter() {
        return 2 * pi * radius;
    }
    
    public double surfaceArea() {
        return 4 * pi * radius * radius;
    }
    
    public double volume() {
        return (4/3) * pi * radius * radius * radius;
    }
}

class Cuboid implements CalcArea, CalcVolume {
    private double side;
    
    Cuboid(double side) {
        this.side = side;
    }
    
    public double area() {
        return side * side;
    }
    
    public double perimeter() {
        return 4 * side;
    }
    
    public double surfaceArea() {
        return 6 * side * side;
    }
    
    public double volume() {
        return side * side * side;
    }
}

public class Day3_2 {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Circle area: " + c.area());
        System.out.println("Circle perimeter: " + c.perimeter());
        
        Square s = new Square(10.0);
        System.out.println("Square area: " + s.area());
        System.out.println("Square perimeter: " + s.perimeter());
        
        Triangle t = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Triangle area: " + t.area());
        System.out.println("Triangle perimeter: " + t.perimeter());
        
        Sphere sp = new Sphere(5.0);
        System.out.println("Sphere area: " + sp.area());
        System.out.println("Sphere perimeter: " + sp.perimeter());
        System.out.println("Sphere surface area: " + sp.surfaceArea());
        System.out.println("Sphere volume: " + sp.volume());

        Cuboid cu = new Cuboid(12.0);
        System.out.println("Cuboid area: " + cu.area());
        System.out.println("Cuboid perimeter: " + cu.perimeter());
        System.out.println("Cuboid surface area: " + cu.surfaceArea());
        System.out.println("Cuboid volume: " + cu.volume());
    }
}