public class Rectangle {
    private int width;
    private int height;
    public Rectangle(){
        width = 25;
        height = 10;
        System.out.printf("default rectangle created: width %d, height %d\n",width,height);
    }
    public Rectangle(int width,int height){
        if (!valitDim(width,height)){
            System.out.println("dimension invalida");
            return;
        }
        this.width = width;
        this.height = height;
        System.out.printf("rectangle created: width %d, height %d\n",width,height);
    }
    private boolean valitDim(int width,int height){
        final int minV=0;
        final int maxV=30;
        boolean minDim = width > minV || height > minV;
        boolean maxDim = width < maxV || height < maxV;
        return maxDim && minDim;
    }
    public int getArea(){
        return width * height;
    }
    public void printArea(){
        System.out.printf("area is: %d \n",getArea());
    }
    public void print(){
        for (int i=0; i < height;i++){
            for (int e=0;e < width;e++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
