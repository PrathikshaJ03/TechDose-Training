import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1=sc.nextInt(),y1=sc.nextInt();
		int x2=sc.nextInt(),y2=sc.nextInt();
		int x3=sc.nextInt(),y3=sc.nextInt();
		double area=Math.abs((x1*(y2-y3) + x2*(y1-y3) + x3*(y1-y2)) / 2.0);
		System.out.print(area);
	}
}
