public class rotatebinarysearch
{
    public static void main(String[] args) {
int arr[] = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,3,0, arr.length));
    }
    static int search(int [] arr, int target, int start, int end)
    {
        if(start>end)
        {
            return -1;
        }
        int middle = start+ (end-start)/2;
        if(arr[middle]== target)
        {
            return middle;
        }
        if(arr[start]<=arr[middle])
        {
            if (target>= arr[start] && target<=arr[middle])
        {
            return search(arr,target,start,middle-1);
        }
            return search(arr,target,middle+1,end);
        }

        if (arr[start]>arr[middle])
        {
            if(target>=arr[middle] && target<=arr[end])
            {
                return search(arr,target,middle+1,end);
            }

        }
        return search(arr,target,start,middle-1);
    }
}
