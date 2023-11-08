class perimeter{
    int w;
    int l;
    int perimeter;

    public void perimeter(int l,int w ) {
        int i = l + w;
        perimeter=2*i;
       System.out.println("Perimeter of the rectangle is: "+perimeter);
    }

}
public class Main {
    public static void main(String[] args) {
        perimeter c=new perimeter();
        c.perimeter(16, 10);

    }
}