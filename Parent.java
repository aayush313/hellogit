public class Parent 
{
	int x=10;
}
class Child extends Parent
{
	int x=200;
	void show()
	{
		System.out.println(super.x);
		System.out.println(x);
	}
	public static void main(String[] args) {
		Child ch=new Child();
		ch.show();
	}
}