package run;

public class MaxMin {
    public  void maxMin(){
        int max=0;
        int number[]={7,1,2,3,4,5,6,};
        for (int i = 0; i < number.length; i++) {
            if(number[i]>max){
                max=number[i];
                number[i]=max;
            }

        }
    }
    public static void main(String[] args) {

    }
}
