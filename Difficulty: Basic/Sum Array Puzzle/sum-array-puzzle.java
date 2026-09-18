class Solution {
    public void sumArray(int[] arr) {
        // code here
        int totalsum = 0;
        for(int num: arr){
            totalsum += num;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = totalsum - arr[i];
        }
        
    }
}