class Solution {
    public String largestPalindromic(String num) {
        TreeMap<Character,Integer> map=new TreeMap<>();
        Map<Character, Integer> revMap = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<num.length();i++){
            map.put(num.charAt(i),map.getOrDefault(num.charAt(i),0)+1);
            revMap.put(num.charAt(i),revMap.getOrDefault(num.charAt(i),0)+1);
        }
        StringBuilder str=new StringBuilder(); 
        for(Character ch:revMap.keySet()){
            if(ch!=0 && map.get(ch)%2!=0){
                str.append(ch);
                map.put(ch,map.get(ch)-1);
                break;
            }
        }
        for(Character ch:map.keySet()){
            if(map.size()==1 && ch=='0'){
                break;
            }
            while(map.get(ch)>1){
                str.append(ch);
                str.insert(0,ch);
                map.put(ch,map.get(ch)-2);
            }
        }
        while(str.length()>1 && str.charAt(0)=='0'){
            str.deleteCharAt(0);
            str.deleteCharAt(str.length()-1);
        }
        return (str.toString()).equals("")?"0":str.toString();
    }
}
