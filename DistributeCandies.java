class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set=new HashSet<>();
        for(int candy:candies){
            set.add(candy);
        }
        return set.size()>=candies.length/2?candies.length/2:set.size();
    }
    public static void main(String args[]){
    System.out.println(distributeCandies([1,1,2,2,3,3]));
    }
}
