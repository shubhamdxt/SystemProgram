package programs;

public class FindMissingNumberInUnSortedArray {
	
static int ar[]={3,7,5,8,44,24};  //given array
    
    public static void main(String[] args) {
           System.out.print("given array : ");
           for (int j = 0; j < ar.length; j++)
                  System.out.print(ar[j] +" "); // display it
           
       //    mergeSortWrapper();
           displayMissing();       
    }
    
    static void mergeSortWrapper(){
           int ar2[]=new int[ar.length];
           mergeSort(ar2,0,ar.length-1);         
    }
    
    static void mergeSort(int ar2[],int lowBound,int highBound){
           int mid;
           
           if(lowBound==highBound)
                  return;
           else
                  mid=(lowBound+highBound)/2;
           
           mergeSort(ar2, lowBound, mid); //sort lower
           mergeSort(ar2, mid+1, highBound);//sort upper
           
           merging(ar2,lowBound,mid+1,highBound);
    }
    
    static void merging(int  ar2[],int lowBound,int highPtr,int highBound){
           
           int j=lowBound;
           int lowptr=highPtr-1;
           int n=highBound-lowBound+1;
           int lowBoundCount=lowBound;
           
           while(lowBound<=lowptr && highPtr<=highBound){
                  if(ar[lowBound]<ar[highPtr])
                        ar2[j++]=ar[lowBound++];
                  else
                        ar2[j++]=ar[highPtr++];
           }
           
           while(lowBound<=lowptr)
                  ar2[j++]=ar[lowBound++];
           
           
           while(highPtr<=highBound)
                  ar2[j++]=ar[highPtr++];
                  
           for(int i=lowBoundCount;i<lowBoundCount+n;i++)
                  ar[i]=ar2[i];
           
    }
    
    
    /*
     * Method for displaying missing number in given range.
     */
    static public void displayMissing(){
           
           System.out.print("\nArray after sorting: ");
           for (int j = 0; j < ar.length; j++)
                  System.out.print(ar[j] +" ");
           
           System.out.print("\nAs array is sorted, its easy to find missing numbers now");
           
           
           int j=0;
           for(int i=1;i<=100;i++){
                  if(j<ar.length && i==ar[j])
                        j++;
                  else
                        System.out.print(i+" ");
                  
           }
           
    }

}
