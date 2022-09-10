import java.util.*;
class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
            for(int j=list.size()-1;j>0;j--){
                if(list.get(j)>=list.get(j-1)){
                    break;
                }
                Collections.swap(list,j,j-1);
            }
        }
        for(int val:list){
            System.out.print(val+" ");
        }
    }
}
