package Thread_Demo;
public class TestThread {

	public static void main(String[] args) {
		Runnable r= new OddNumber();
		Thread t= new Thread(r);
		t.start();
		Runnable r1= new EvenNumber();
		Thread t2= new Thread(r1);
		t2.start();
	}
}
class OddNumber implements Runnable{
	public void run() {
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd number "+i);
			}
		}
	}
}
class EvenNumber implements Runnable{
	public void run() {
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number "+i);
			}
		}
	}
}
