abstract class shape {
    abstract int numberofsides();
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        int n1=r.numberofsides();
        System.out.println("sides of rect is "+n1);
        Triangle t= new Triangle();
        int n2=t.numberofsides();
        System.out.println("sides of triangle is "+n2);
        Hexagon h= new Hexagon();
        int n3=h.numberofsides();
        System.err.println("sides of h is "+n3);
    }

    
}
class Rectangle extends shape
{int numberofsides()
{int nr=4;
return nr;}}
class Triangle extends shape
{int numberofsides()
{int nt=3;
return nt;}}
class Hexagon extends shape
{int numberofsides()
{int nh=6;
return nh;}}

