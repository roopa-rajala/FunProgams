class Solution {
    public static String toLowerCase(String str) {
        String lowercase="";
        
        for(char letter:str.toCharArray()){
            if(letter-'a'>= -32 &&letter-'a'<= -7 ){
                letter=(char)(letter+32);
                lowercase=lowercase+letter;
            }
            else{
                lowercase=lowercase+letter;
            }
        }
        return lowercase;
    }
    public static void main(String args[]){
    System.out.println(toLowerCase("H$ello"));
    }
    
}
