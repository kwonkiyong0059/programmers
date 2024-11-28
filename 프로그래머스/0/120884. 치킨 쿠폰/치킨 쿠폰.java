class Solution {
    public int solution(int chicken) {
        int service = 0;
        
        for(int i=1; i<=chicken; i++){
            if((i+service)%10==0){
                service++;
            }
        }
        return service;
    }
}