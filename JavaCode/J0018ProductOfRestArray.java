public class J0018ProductOfRestArray{
    public static int[] productPuzzle(int[] arr) {
        int []product = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int prod =1;
            for(int j=0;j<arr.length;j++){
                if(j==i)
                    continue;
                prod = prod*arr[j];
            }
            arr[i] = prod;
        }
        return product;
    }
    public static void main(String[] args) {
        int []arr = new int[]{1,3,3,10,2};
        int []result = productPuzzle(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}