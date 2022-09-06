import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=N;i++){
            if(N%i==0){
                list.add(i);
                if(i*i!=N){
                    list.add(N/i);
                }
            }
        }
        for(int val:list){
            System.out.print(val+" ");
        }
    }
}
