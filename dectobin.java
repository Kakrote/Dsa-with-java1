public class dectobin {
    public static void dectobin(int decnum){
        int mynum = decnum;
        int pow = 0;
        int binnum =0;
        while(decnum>0){
            int lastdigit =decnum %2;
            binnum = binnum+(lastdigit*(int)Math.pow(10,pow));
             pow++;
             decnum =decnum/2;


        }
        System.out.println(mynum + "=" + binnum);

    }
    public static void main(String args[]){
dectobin(15);

    }
    
}
