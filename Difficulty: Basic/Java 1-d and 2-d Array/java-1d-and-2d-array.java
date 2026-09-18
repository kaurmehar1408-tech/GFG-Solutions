class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        int dsum = 0;
        int max = b[0];
        
        for(int i=0;i<n;i++){
            dsum += a[i][i];
            
            if(b[i]>max){
                max = b[i];
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(dsum);
        result.add(max);
        
        return result;
        
    }
}
