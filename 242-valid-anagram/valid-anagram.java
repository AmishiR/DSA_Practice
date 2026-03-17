class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();    
        
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int j=0;j<t.length();j++){
            char d=t.charAt(j);
            if(!map.containsKey(d)){
                return false;
            }
            map.put(d, map.get(d) - 1);

            if(map.get(d)<0){
                return false;
            }
        }
    return true;
    }
}