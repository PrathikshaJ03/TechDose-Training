import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(),B=sc.nextInt();
        System.out.println("Before Swapping : "+A+" "+B);
        A=A^B;
        B=A^B;
        A=A^B;
        System.out.println("After Swapping : "+A+" "+B);
    }
}
