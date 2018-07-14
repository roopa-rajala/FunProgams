class JudgeRouteCircle {
    public static boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char mov:moves.toCharArray()){
            switch(mov){
                case 'L':y=y-1;
                    break;
                case 'R':y=y+1;
                    break;
                case 'U':x=x+1;
                    break;
                case 'D':x=x-1;
                    break;
                    
            }
        }
         return x+y==0?true:false;
        
    }
    public static void main(String args[]){
   
    System.out.println(judgeCircle("UD"));
    }
    
}
