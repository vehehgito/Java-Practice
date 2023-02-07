 class Main 
 {
    int volume(int side)
    {
        return side*side*side;
    }

    int volume(int length, int breadth, int height)
    {
        return length*breadth*height;
    }

    double volume(int radius, int height)
    {
        return 3.14*radius*radius*height/3;
    }
    
    public static void main(String[] args)
    {
        Main oe = new Main();
        System.out.println("Volume of cube: " + oe.volume(5));
        System.out.println("Volume of cuboid: " + oe.volume(5, 6, 7));
        System.out.println("Volume of cone: " + oe.volume(5, 7));
    }
 }