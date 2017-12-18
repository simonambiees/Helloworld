public class Q2 {
    public static void main(String[] arg){
        int Count = 0;


        for (int number = 101; number <= 200; number++){
            boolean bool = true;
            int mod=0;
            int a=0;
            for (int div=2; div<number; div++) {
                mod = number%div;
                if (mod==0) {
                    bool = false;
                    break;
                }
            }
            if(bool){
                Count = Count + 1;
            }
        }
        System.out.println("There are " + Count + " primary numbers.");

        //System.out.println(4 % 3);
    }

}
