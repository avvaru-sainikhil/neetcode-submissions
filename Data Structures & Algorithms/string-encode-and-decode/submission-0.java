class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<strs.size();i++)
        {
            sb.append(strs.get(i));
            sb.append("--");
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> li=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=0;i<str.length();i=j+2)
        { j=i;
            while(j+1<str.length() && !(str.charAt(j)=='-'&& str.charAt(j+1)=='-'))
            {
                sb.append(str.charAt(j));
                j++;
            }
           li.add(sb.toString());
           sb.setLength(0);
        }
        return li;
}
}