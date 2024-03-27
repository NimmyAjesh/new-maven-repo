package String_Buffer;

public class ReplaceBuffer {

	public static void main(String[] args) {
		StringBuffer obj=new StringBuffer("welcome");
		obj.replace(1,3,"hello");
		System.out.println("new string is : "+obj);

	}

}
