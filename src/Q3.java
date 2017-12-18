public class Q3 {
    public static void main(String[] arg){
        int count = 0;
        for (int f=100; f<=999; f++) {
            int hundreds = (int) Math.floor(f / 100);
            int tens = (int) Math.floor((f - (hundreds * 100)) / 10);
            int units = f - tens * 10 - hundreds * 100;
            if (hundreds*hundreds*hundreds+tens*tens*tens+units*units*units == f){
                System.out.println(f+"是水仙花数。");
                count++;
            }
        }
        System.out.println("有"+count+"个水仙花数。");
    }
}
