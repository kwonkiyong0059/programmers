class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        String[] sounds = {"aya", "ye", "woo", "ma" };
        
        for(String word : babbling) {
            String prevSound = "";
            boolean isValid = true;
            
            while(word.length()>0){
                boolean found = false;
                for(String sound : sounds){
                    if(word.startsWith(sound)){
                        if(sound.equals(prevSound)){
                            isValid = false;
                            break;
                        }
                        prevSound = sound;
                        word = word.substring(sound.length());
                        found = true;
                        break;
                    }
                }
                if(!found){
                    isValid = false;
                    break;
                }
            }
            
            if(isValid){
                count++;
            }
        }
        return count;
    }
}