package forloop_sorular;

public class Forloop {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <6 ; i++) {
            sum =sum +i;

        }

        System.out.println("Toplam:"+sum);//15

        //--------------------------------

        int sum1 =0;

        for (int i = 10; i >0 ; i=i-5) {
            sum1 =sum1 +i;

        }

        System.out.println(sum1);//15

       //-----------------------------------

       int product =1;

        for (int i = 5; i >= 0; i--) {
            product =product*i;
        }

        System.out.println(product);//0

        //-----------------------------

        for (int i =10; i >0 ; i++) {
        //    System.out.println("hello");//sonsuz defa yazar

        }
      //----------------------------------

        for (int count = 1; count <=10 ;count ++) {
            System.out.println("Welcome to Java");
        }

        //---------------------------

        for (int i = 1;  i<=5 ; i++) {

            for (int j = (5-i); j > 1; j--) {

                System.out.print(i+j);

            }
            System.out.println();
        }
    }
}
