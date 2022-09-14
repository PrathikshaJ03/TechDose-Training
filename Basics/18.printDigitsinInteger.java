import java.util.*;
class Main{
    
  //Recursion method
    public static void printDigits1(int N){
        if(N<=0){
            return;
        }
        int val=N%10;
        printDigits1(N/10);
        System.out.print(val+" ");
    }
    
    public static void printDigits2(int N){
        ArrayList<Integer> list = new ArrayList<>();
        while(N>0){
            list.add(N%10);
            N/=10;
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		printDigits1(N);
		System.out.println();
		printDigits2(N);
	}
}
