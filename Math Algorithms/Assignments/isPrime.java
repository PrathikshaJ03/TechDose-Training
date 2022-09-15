import java.util.*;
class Main {
    
    public static boolean isPrime(int N){
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(isPrime(N)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
