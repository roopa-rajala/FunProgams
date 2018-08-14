import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class MyClass {
    public static void main(String args[]) {
        String sentence="The lines are printed in reverse order.";
       sentence= sentence.substring(0,1).toLowerCase()+sentence.substring(1,sentence.length()-1);
        String[] words=sentence.replaceAll("[\\.+$]","").split(" ");
      HashMap<Integer,List<String>>  hmap =new HashMap<Integer,List<String>>();
     for(int i=0;i<words.length;i++){
         if(!hmap.containsKey(words[i].length())){
              hmap.put(words[i].length(),new ArrayList<String>());
              hmap.get(words[i].length()).add(words[i]);
         }
         else{
             hmap.get(words[i].length()).add(words[i]);
         }
     }
     StringBuilder str=new StringBuilder();
     
for(Entry<Integer,List<String>> en : hmap.entrySet()){
			for(String obj : en.getValue()){
				str.append(obj+" ");
			}
		}
		str.setCharAt(str.length()-1,'.');
		str.setCharAt(0,(char)(str.charAt(0)-32));
        System.out.print(str);
    }
}
