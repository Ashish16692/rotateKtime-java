public class RotateKtime {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=3;

        int[] temp=new int[n];

        for (int i=0;i<n;i++){
            temp[(k+i)%n]=arr[i];       
        }
        for (int i=0;i<n;i++){
            System.out.print(temp[i]+",");
    }
    
}}
