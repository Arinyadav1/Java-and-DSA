class HelloWorld {
    public static void main(String[] args) {
        int [] value = {5, 4, 3, 9, 6, 7};
        divideArray(value, 0, value.length-1);
        for(int i=0; i < value.length; i++){
            System.out.print(value[i] +" ");
        }
    }
    public static void divideArray(int[] value, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si) / 2;
        divideArray(value, si, mid);
        divideArray(value, mid+1, ei);
        sortArray(value, mid, si, ei);
    }
    public static void sortArray(int[] value, int mid, int si, int ei){
        int [] mergeArray = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei){
            if(value[idx1] <= value[idx2]){
                mergeArray[x++] = value[idx2++];
            } else {
                 mergeArray[x++] = value[idx1++];
            }
        }
        while (idx1 <= mid){
            mergeArray[x++] = value[idx1++];
        }
        while (idx2 <= ei){
            mergeArray[x++] = value[idx2++];
        }
        for(int i= 0, j = si; i < mergeArray.length; i++, j++){
            value[j] = mergeArray[i];
        }
    }
}
