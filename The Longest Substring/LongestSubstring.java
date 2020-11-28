class Solution {
    public int lengthOfLongestSubstring(String s) {
	
	ArrayList<Character> x = new ArrayList<Character>();
        int n=0,q=0;
        
        for(int i = 0;i<s.length();i++){
            if(x.isEmpty()){
                n=i;
                x.add(s.charAt(i));
                if(x.size()>q)
                    q=x.size();
                continue;
            }
            if(!x.contains(s.charAt(i))){
                x.add(s.charAt(i));
                if(x.size()>q)
                    q=x.size();
                continue;
            }
            if(x.contains(s.charAt(i))){
                i=n;
                x.clear();
            }
        }
        return q;
    }
}