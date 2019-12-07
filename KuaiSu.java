package test.sort;
/*
快速排序

 */
public class KuaiSu {
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,3,7,9,4};
        kuaiSuSort(arr,0,arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }
    }

    private static void kuaiSuSort(int[] arr,int l,int r) {
         if(l < r){
             swap(arr,l + (int)(Math.random()*(r - l + 1)),r);
             int[] p = partition(arr, l, r);
             kuaiSuSort(arr,l,p[0] - 1);
             kuaiSuSort(arr,p[1] + 1,r);
         }
    }

    private static int[] partition(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r;
        int cur = l;
        while (cur < more){
            if(arr[cur] < arr[r]){
                swap(arr,++less,cur++);
            }else {
                swap(arr,--more,cur);
            }
        }
        swap(arr,more,r);
        return new int[]{less + 1,more};
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
