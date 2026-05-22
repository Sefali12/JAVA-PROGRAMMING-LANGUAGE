long lo=0,hi=1000000000L;
while(lo<hi){
    long mid=(lo+hi+1)/2;
if(countProvider(v,d,n,mid)>=m){
    lo=mid;
}
else{
    hi=mid-1;
}
long x=lo;
long[] result=sumAtWorkload(v,d,n,x);
long count=result[0];
long total=result[1];
total-=x*(count-m);
System.out.print(total);

static long countProvider(long[] v,long[] d,int n,long x){
    long count=0;
    for(int i=0;i<n;i++){
        if(v[i]>=k){
            count+=v[i]-x/d[i]+1;
        }
        return count;
    }
}
static long sumAtWorkload(long[] v,long[] d,int n,long x){
    long count=0,sum=0;
    for(int i=0;i<n;i++){
        if(v[i]>=x){
            long cnt=(v[i]-x)/d[i]+1;
            count+=cnt;
            sum+=cnt*v[i]-d[i]*cnt*(cnt-1)/2;
        }
    }
    return new long[]{count,sum};
}

}