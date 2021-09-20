package run;

public class TriangleLeft {
    public void  left(){
        for (int i = 0; i<=5; i++) {
            for (int j =i ; j<=5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<=i; j++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }

    }
    public static void main(String[] args) {
        TriangleLeft obj =new TriangleLeft();
        obj.left();

    }
}

