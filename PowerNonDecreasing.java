public class PowerNonDecreasing {
static int makePowerNonDecreasing(int[] power,int n)
{
    if(n==1)
        return 0;
    int sum=0;
    for(int i=0;i<n-1;i++){
        if(power[i]>power[i+1]){
            int val=power[i]-power[i+1];
                sum += val;
            for(int j=i+1;j<n;j++){
                power[j]=power[j]+val;
            } // inner loop end
        } // if loop end
    } // outer loop end
    return sum;
}
}

// Time complexity is always less than O(n2) 
