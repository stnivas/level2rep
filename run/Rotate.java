package run;

import java.util.Arrays;

public class Rotate {
    public void rotate(){
        int number[]={1,2,3,4,5};
        int last=number[number.length-1];
        for (int i = number.length-1; i > 0; i--) {
            number[i]=number[i-1];

        }
        number[0]=last;
        System.out.println(Arrays.toString(number));


    }

    public static void main(String[] args) {
	Rotate obj =new Rotate ();
	obj.rotate();

    }
}
