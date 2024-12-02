package forloop_sorular;

public class Whileloop {
    public static void main(String[] args) {

        int num = 1;

        while (num<3){
            System.out.print(num+" ");//1 2

            num++;
        }

        //-------------------------

        int num1 = 1;
        while(num1<1) {
            System.out.print(num1 + " ");
            num1++;
        }

        //-----------------------------

        int sum =0;
        int nm=1;

        while (nm<5){
            sum=sum+nm;
            nm++;

        }
        System.out.println(sum);
    }
}
