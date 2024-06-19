public class Multiple{
    /* This program checks if numbers in range between 71 to 150 is a multiple of 2, 3 and  7*/

    public static void main(String[] args){

        //Loop from 71 to 150
        for (int i = 71; i <= 150; i++){
            if (i%2==0 && i%3==0 && i%7==0){
                System.out.printf("%d\n", i);
            }
        }

    }


}