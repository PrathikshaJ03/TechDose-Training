import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        while(N>0){
            if((N&1)==1){
                count++;
            }
            N=N>>1;
        }
        System.out.print(count);
    }
}
