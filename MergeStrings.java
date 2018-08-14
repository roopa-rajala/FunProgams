public class MyClass {
    public static void main(String args[]) {
        String str="ab12";
     char[] a=str.toCharArray();
        str="cde";
       char[] b=str.toCharArray();
      
        int aSize=a.length;
        int bSize=b.length; 
    char[] temp=new char[a.length+b.length];
        int index=0;
        int index1=0;
        while(aSize>0 && bSize>0){
            temp[index]=a[index1];
            temp[index+1]=b[index1];
            index=index+2;
            aSize--;
            bSize--;
            index1++;
        }
        if(aSize>bSize){
            temp[index]=a[index1];
            index=index+1;
            aSize--;
            index1++;
            
        }
        else if(bSize>aSize){
            temp[index]=b[index1];
            index=index+1;
            bSize--;
            index1++;
        }
        for(char i:temp){
            System.out.println(i);
        }
        
        
    }
}
