package run;

import java.util.Arrays;

public class Wave {
    public void waveForm() {
        int number[] = {1, 2, 3, 4, 5};
        int len = number.length;
        for (int i = 0; i < len; i++) {

            if (i % 2 == 1) {
                System.out.print(number[i] + " ");
                System.out.print(number[i - 1] + " ");


            }
            else if (len % 2 == 1 && i==len-1) System.out.print(number[len - 1] + " ");
        }
    }
    public static void main(String[] args) {
        Wave obj=new Wave();
        obj.waveForm();

    }
}
