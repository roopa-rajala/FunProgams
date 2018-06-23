public class CharacterCount{

     public static void main(String []args){
         String word="abcb";
         HashMap<Character,Integer> map=new HashMap();
         int index=0;
         int value=0;
         while(index<word.length()){
             if(!map.containsKey(word.charAt(index))){
                 map.put(word.charAt(index),1);
             }
             else{
                 value=map.get(word.charAt(index));
                 map.replace(word.charAt(index),value+1);
             }
             index++;
         }
         System.out.println(map.entrySet());
         

        
     }
}