 static int longestChain(List<String> words) {
        HashSet<String> wordDictionary=new HashSet<>();
        HashMap<String,Integer> wordToMap =new HashMap<>();
        if(words.size()==0){
            return 0;
        }
        for(String word:words){
            wordDictionary.add(word);
        }
        int maxChainLength = -1;
        for (String target : words) {
            int currentChainLength = depthFirstCount(target, wordDictionary,wordToMap);
            wordToMap.put(target,currentChainLength);
            if (currentChainLength > maxChainLength) maxChainLength = currentChainLength;
        }

        return maxChainLength;
    }
private static int depthFirstCount(String target, Set<String> wordDictionary, HashMap<String,Integer> wordToMap) {
        int n = target.length();
        int max = 0;

        if (!wordDictionary.contains(target)) return 0;

        for (int i = 0; i < n; i++) {
            String currentWord = target.substring(0,i)+target.substring(i+1);
             int local=0;
            if(wordToMap.containsKey(currentWord)){
            local = 1 + wordToMap.get(currentWord);   
            }
            else{
                int temp=depthFirstCount(currentWord, wordDictionary,wordToMap);
                 
                if(temp>0){
                    wordToMap.put(currentWord,temp);  
                }
                local = 1 + temp;
                
            }
            if (local > max)
                max = local;
        }
        return max;
    }
