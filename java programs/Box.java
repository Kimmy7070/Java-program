class Box{
    private int h;
    private int l;
    private int b;
    private int area;
    private int volume;
    void show_area()
    {
        System.out.println("Area: "+area);
    }
    void show_volume()
    {
        System.out.println("Volume: "+volume);
    }
    void Area(int height,int length)
    {
        h=height;
        l=length;
        area=h*l;
    }
    void Area(int a)
    {
        h=a;
        area=h*h;
    }
    void Area(int height,int breadth,int length)
    {
            h=height;
            l=length;
            b=breadth;
            area=2*(l*b)+2*(b*h)+2*(h*l);
        }
        void Volume(int a)
        {
            b=h=l=a;
            volume=l*b*h;
        }
        void Volume(int height,int breadth,int length)
    {
            h=height;
            l=length;
            b=breadth;
            volume=l*b*h;
        }
}