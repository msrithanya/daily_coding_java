package LeetCode;

public class ReverseString
{
	public static void main(String[] args) {
	ReverseString c=new ReverseString();
	
	System.out.println(c.rev("riya","",3));
	}
	String rev(String str,String r,int i){
	    if(i<0){
	        return r;
	    }
	        r=r+str.charAt(i);
	        i=i-1;
	    return rev(str,r,i);
	}
}
