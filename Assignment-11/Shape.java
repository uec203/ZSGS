public class Shape{
    private String color;

    public Shape(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    } 
}
class Rectangle extends Shape{
    private int height;
    private int width;
    public Rectangle(String color,int height,int width){
        super(color);
        this.height = height;
        this.width = width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getWidth(){
        return width;
    }
    public int area(int height,int width){
        return height*width;
    }
}
class Circle extends Shape{
    private int radius;
    public Circle(String color,int radius){
        super(color);
        this.radius=radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public double area(int radius){
        return 3.14*radius*radius;
    }
}