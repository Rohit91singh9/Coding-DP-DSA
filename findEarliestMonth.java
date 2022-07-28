class Result
{
    static int findEarliestMontth(int arr[]){
        int month=0;
        int change=Integer.MAX_VALUE;
        int tsum=0;
        int s=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            tsum+=arr[i];
        }
        int avg1=0,avg2=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
            avg1=s/(i+1);
            avg2=tsum/n;
            if(Math.abs(avg1-avg2)<change){
                change=Math.abs(avg1-avg2);
                month=i+1;
            }
        }
        return month;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[]={1,3,2,3};
		System.out.println(findEarliestMontth(arr));
	}
}
