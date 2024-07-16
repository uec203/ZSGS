public class PrimeNumbertillN {
    public static void main(String[] args) {
        int N = 30;
        boolean b[] = new boolean[N+1];
        for(int i=2;i<=Math.sqrt(N);i++){
            for(int j=i+i;j<=N;j+=i){
                b[j]=true;
            }
        }
        System.out.println("Prime Numbers till 30 is");
        for(int i=2;i<=N;i++){
            if(!b[i]) System.out.print(i+" ");
        }
    }
}
