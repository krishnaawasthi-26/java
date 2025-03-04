
public class ArrayExample{
    public static void main(String[] args) {
        int arr[]={1,2,3}; // create a fixed 3 size array whose first index start from 0
        
        System.out.println(arr[0]);// printing the first element of the array arr
        System.out.println(arr[2]);// printing the third(n+1 element where n is three) element of the array arr
        arr[1]=8;// changing the value of the 2 element of array err to 8
        
        // if we dont know what will be the value of the elements of array but we know size 
        // let size be 5
        int arr2[]=new int[5];// here arr2 become a array of size 5 where by default the value is 0
        arr2[1]=6;// changing the value of the 2 element of array err to 6
        arr2[0]=5;
        arr2[4]=2;
        arr2[3]=9;
        for(int i=0;i<3;i++){
            System.out.println("value of arr "+ i+" index element"+arr[i]);// printing all the element from 0 to 3 in arr
        }
        int itr=0;// will give us count about how many times loop have runed
        for(int val:arr2){// enhanced for loop which will run arr2 size type ans in every loop val will have value of arr2[i] where i will have value as number of time loop have completed
            System.out.println("value of arr2 "+itr +" index element"+val);
            itr++;
        }
    }
}