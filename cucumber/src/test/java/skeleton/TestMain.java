package skeleton;

public class TestMain 
{
 int x=50;
 public static void main(String[] args)
 {
	 final TestMain f1=new TestMain();
	 TestMain f2=new TestMain();
	 TestMain f3=isValid(f1,f2);
	 System.out.println((f1==f3)+" "+(f1.x==f3.x));
 }
 static TestMain isValid(TestMain x,TestMain y)
 {
	 final TestMain z=x;
	 z.x=60;
	 return z;
 }
}
