class Solution {

    public String encode(List<String> strs) {
            StringBuilder sb=new StringBuilder();

            for(String s:strs){
                sb.append(s.length());
                sb.append("#");
                sb.append(s);
            }
            return sb.toString();
    }

    public List<String> decode(String s) {
       
        int i=0;
        int n=s.length();
        ArrayList<String> res=new ArrayList<>();
        while(i<n){
             int len=0;
            while(s.charAt(i)!='#'){
                len=len*10+(s.charAt(i)-'0');
                i++;
            }
            i++;

            String temp=s.substring(i,i+len);
            res.add(temp);
            i+=len;
        }
        return res;
    }
}
