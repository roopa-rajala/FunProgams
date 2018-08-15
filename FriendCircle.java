static int friendCircles(List<String> friends) {
        // can use dfs for this
       char[][] arrOfFriend=new char[friends.size()][friends.size()];
         int i=0;
          for(String friend:friends){
            arrOfFriend[i]= friend.toCharArray();
              i++;
        }
        int count=0;
        int[] visited=new int[friends.size()];
        for(int row=0;row<friends.size();row++){
        if(visited[row]==0){
            dfs(arrOfFriend,visited,row);
            count++;
        }
        }
        return count;
    }
static void dfs(char[][] arrOfFriend,int[] visited,int position){
    for(int col=0;col<arrOfFriend[0].length;col++){
        if(arrOfFriend[position][col]=='Y' && visited[col]==0){
            visited[col]=1;
            dfs(arrOfFriend,visited,col);
        }
    }
}
