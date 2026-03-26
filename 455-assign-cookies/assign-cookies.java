class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int child=g.length-1;
        int cookie=s.length-1;
        int content=0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(cookie>=0 && child>=0){
            if(g[child]<=s[cookie]){
                content++;
                child--;
                cookie--;
            }
            else{
                child--;
            }
        }
        return content;
    }
}