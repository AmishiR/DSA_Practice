class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int content=0;
        int left=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;

        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                content++;
                i++;
            }
            j++;
        }
        return (content);
    }
}