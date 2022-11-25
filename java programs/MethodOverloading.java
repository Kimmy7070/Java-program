class MethodOverloading
{
    public static void main(String args[])
    {
        Box ob=new Box();
        ob.Area(7,8);
        ob.show_area();
        ob.Area(8);
        ob.show_area();
        ob.Volume(8,5,9);
        ob.show_volume();
        ob.Volume(6);
        ob.show_volume();
    }
}