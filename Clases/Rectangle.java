public class Rectangle {
    //atributos
    double area;
    double length;
    double perimeter;
    double width;

    //Metodos
    public void calcArea(){
        area = length*width;
    }

    public void calcPerimeter(){
        perimeter = (length*width)/2;
    }

    public double getArea(){
        return area;    
    }

    public double getPerimeter(){
        return perimeter;
    }

    public void setLength(double length){

    }

    public static void main(String[]args){
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();

        rectangle1.width = 5.2d;
        rectangle2.width = 10d;
        rectangle3.width = 13d;

        rectangle1.length = 5;
        rectangle2.length = 4;
        rectangle3.length = 10;

        rectangle1.calcArea();
        rectangle2.calcArea();
        rectangle3.calcArea();

        System.out.println("El area del rectangle1 es: " + rectangle1.getArea());
        System.out.println("El area del rectangle2 es: " + rectangle2.getArea());
        System.out.println("El area del rectangle3 es: " + rectangle3.getArea());

        System.out.println("El perimetro de rectangle1 es: " + rectangle1.getPerimeter());
        System.out.println("El perimetro de rectangle2 es: " + rectangle2.getPerimeter());
        System.out.println("El perimetro de rectangle3 es: " + rectangle3.getPerimeter());
    }
}