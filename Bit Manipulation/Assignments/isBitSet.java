//Is position bit Set?
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),position=sc.nextInt();
        if((N&(1<<(position-1)))!=0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
