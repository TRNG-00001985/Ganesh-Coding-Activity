class Fibonacii{
    public static void main(String args[]){
        int n=5;
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}