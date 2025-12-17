public class Currency {
    public static void main(String[] args) {
        int arr[]={2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int n=4532;
       for(int a:arr){
             if(a<=n){
                int num=n/a;
                n=n-(a*num);
                System.out.println(a+":"+num);
             }
       }
    }
}
