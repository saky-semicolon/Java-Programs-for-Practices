// Type A - Problem 2
// write a java program to find the area of the circle . the programmer assigns the radius of the circle

class TypeA2{
    public double CircleArea (double radius){
    return Math.PI * radius * radius;
    }
    public static void main(String[] args){
    TypeA2 cir = new TypeA2();
    double area = cir.CircleArea(2.4);
    System.out.println("The area of your circle is :"+ area);
    }
    }