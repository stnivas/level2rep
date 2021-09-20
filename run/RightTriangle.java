package run;

public class RightTriangle {
    public  void right(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }
    public static void main(String[] args) {
        RightTriangle obj=new RightTriangle();
        obj.right();

    }
}
