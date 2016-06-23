class WordBreakProblem{
    
    public static final Set<String> DICTIONARY = new HashSet<String>(){"my","name","car","is","john","i","have","a",",","."};
    
    public static void main(String[] args){
        
    }
    
    public static List<String> breakWords(String text){
        byte[][] checkWord = new byte[text.length][text.length];
        int[][] clipPosition = new int[text.length][text.length];
        int len = text.length;
        for(int i=0;i<len;i++){
            for(int j = 0,int k = i+j;k<len;j++){
                String word = text.substring(j,k);
                checkWord[j][k] = false;
                if(DICTIONARY.contains(word)){
                    checkWord[j][k] = true;
                }else{
                    for(int c = j+1;c<=k;c++){
                        if(checkword[j][c] && checkword[c][k]){
                            checkWord[j][k] = true;
                            clipPosition[j][k] = c-j;
                            break;
                        }
                    }
                }
            }
        }
        int N;
        while(true){
            
        }
    }
}
