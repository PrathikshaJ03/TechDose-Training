class Solution {
    public String discountPrices(String sentence, int discount) {
        StringBuilder str=new StringBuilder();
        String s[]=sentence.split(" ");
        for(String i:s){
            int flag=0;
            if(i.length()!=1 && i.charAt(0)=='$'){
                for(int j=1;j<i.length();j++){
                    if(!(i.charAt(j)>='0' && i.charAt(j)<='9')){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    String temp=i.substring(1);
                    double val=Double.parseDouble(temp);
                    double d=val-(discount/100.0*val);
                    str.append("$");
                    str.append(String.format("%.2f",d));
                    str.append(" ");
                }
                else{
                    str.append(i);
                    str.append(" ");
                }
            }
            else{
                str.append(i);
                str.append(" ");
            }
        }
        return str.toString().trim();
    }
}
