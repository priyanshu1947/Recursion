public class linearsearch
{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
int target = 11;
        System.out.println(target(arr,target,0));
    }
    static boolean target(int [] arr, int target, int index)
    {
        if(index ==arr.length)
        {
            return false;
        }
        else {
            return arr[index] == target || target(arr,target,index+1);
        }
    }
}
