class rectangle{
    int length,width;
    rectangle(int x, int y)
    {
        length=x;
        width=y;
    }

    int rectArea()
    {
        return(length*width);
    }
}

public class Constructor {
    public static void main(String[] args) {
        rectangle rect1 = new rectangle(15, 10);
        int area1 = rect1.rectArea();
        System.out.println("The area of the rectangle is: " +area1);
    }
}
