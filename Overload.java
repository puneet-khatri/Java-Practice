class OverloadDemo {
    void test()
    {
        System.out.println("No Parameter");
    }
    void test(int a)
    {
        System.out.println("a:"+a);
    }
    void test(int a,int b){
        System.out.println("a aand b:"+a+" "+b);
    }

    double test(double a)
    {
        System.out.println("double a:" +a);
        return a*a;
    }
}

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result=ob.test(123.45);
        System.out.println("result of overloading method is :"+result);
    }
}
