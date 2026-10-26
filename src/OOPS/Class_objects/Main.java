package OOPS.Class_objects;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setDimension(1,2,3);
        b1.showDimension();
//        System.out.println(Box.getMaxDimension());
        Box b2 = new Box();
        b2.setDimension(10,12,13);
        b2.showDimension();
    }
}

//class Box {
//    int length, breadth, height; //instance member variable
//    static int maxDimension=10; //static member variable
//
//    void setDimension(int l, int b, int h){
//        length = l;
//        breadth = b;
//        height = h;
//    }
//
//    static int getMaxDimension(){
//        return maxDimension;
//    }
//    void showDimension(){ //instance member function
//        System.out.println("Length: " + length + " Breadth: " + breadth + " Height: " + height);
//    }
//}
