import java.util.Arrays;

public class Practice
{
    public static void main(String[] args) {

        int[] arr = new int[]{0,1,2,1,2,1,0,0,0,1,2,0,1,0,2,1,0,0,1,0};
        int l=0;int m=0; int h=arr.length-1;
      while(m<=h){

            if(arr[m]==1)
            {
                m++;
            }
            else if(arr[m]==0)
            {
                int temp=arr[l];
                 arr[l]=arr[m];
                 arr[m]=temp;
                 l++;m++;
            }
            else {
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
