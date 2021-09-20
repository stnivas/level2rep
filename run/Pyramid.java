package run;

public class Pyramid {
    public void  pyramid(){
        for (int i = 0; i<=5; i++) {
            for (int j =i ; j<=5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<=i; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");

        }

    }
    public static void main(String[] args) {
        Pyramid obj=new Pyramid();
        obj.pyramid();

    }
}
