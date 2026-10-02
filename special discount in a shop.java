class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=0;i<Prices.length;i++){
            for(int j=i+1;Prices.length;j++){
                if(p[j]<=p[i]){
                    p[i]=p[i]-p[j];
                    break;
                }
            }
        }
        
    }
}