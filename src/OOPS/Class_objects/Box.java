package OOPS.Class_objects;

class Box {
    int length, breadth, height;

    void setDimension(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    void showDimension(){
        System.out.println("Length: " + length + " Breadth: " + breadth + " Height: " + height);
    }
}
