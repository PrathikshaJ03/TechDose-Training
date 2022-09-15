import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N>0 && (N&(N-1))==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
