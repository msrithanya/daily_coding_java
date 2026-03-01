package LeetCode;

public class Recursion
{
	public static void main(String[] args) {
		Recursion c=new Recursion();
		c.num(5,1);
	}
     void num(int a,int fac){
	    if(a>=1){
	        fac=fac*a;
	        System.out.println(fac);
	    }
	    else{
	        return;
	    }
	    num(--a,fac);
	    System.out.println(a);
	}
}