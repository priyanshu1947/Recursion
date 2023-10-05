import java.util.Arrays;

public class pattern1
{
    public static void main(String[] args) {
      // pattern2(4,0);
       int [] arr = {4,3,2,1};
       selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));

    }

    static void pattern2(int row, int col)
    {
        if(row==0)
        {
            return;
        }
        if (col<row)
        {
            pattern2(row,col+1);
            System.out.print("*");

        }
        else {
            pattern2(row-1,0);
            System.out.println();
        }
    }


    static void pattern(int row, int col)
    {
        if(row==0)
        {
            return;
        }
        if (col<row)
        {
            System.out.print("*");
            pattern(row,col+1);
        }
        else {
            System.out.println();
            pattern(row-1,0);
        }
    }

    static void bubblesort(int [] arr, int row, int col)
    {
        if(row==0)
        {
            return;
        }
        if (col<row)
        {
            if(arr[col]>arr[col+1])
            {
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1]= temp;
            }
            bubblesort(arr,row,col+1);
        }
        else {
            bubblesort(arr,row-1,0);

        }
    }

    static void selection(int [] arr,int row, int col , int max)
    {
        if(row==0)
        {
            return;
        }
        if (col<row) {
            if (arr[col] > arr[max]) {
                selection(arr, row, col + 1, col);
            } else {
                selection(arr, row, col + 1, max);
            }
        }
        else
        {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1]= temp;

            selection(arr,row-1,0,0);
        }

    }

}
