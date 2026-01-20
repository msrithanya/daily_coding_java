public class StringProblem {
    public static void main(String[] args) {
        int sum=0;
        String[] data={"1001,Jack,2000","1002,Dan,1000","1003,Jane,2000","1004,Stuart,1000"};
        int[] salary=new int[data.length];
        int i=0;
        for(String s:data){
            String[] sdata=s.split(",");
            int a=Integer.parseInt(sdata[2]);
            sum=sum+a;
            salary[i]=a;
            i++;
        }
        System.out.println(sum);
    }
}
