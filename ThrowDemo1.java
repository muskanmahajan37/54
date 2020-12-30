class ThrowDemo1
{
static void DemoProc()
{
try
{
throw new NullPointerException("\nDemo Proc..");
}
catch(NullPointerException e)
{
System.out.println("\nPrint Exception");
throw e;
}
}
public static void main(String args[])
{
try
{
DemoProc();
}
catch(NullPointerException e)
{
System.out.println("\nRecaught " + e);
}
}
}
