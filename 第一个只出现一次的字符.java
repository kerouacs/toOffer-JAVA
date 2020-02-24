class Solution {
    //// char是表示的是字符，定义的时候用单引号，只能存储一个字符。例如; char='d'。 做差为对应index差
    public char firstUniqChar(String s) {
        int[] count=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        for(char c:s.toCharArray()){
            if(count[c-'a']==1) return c;
        }
        return ' ';
    }
}