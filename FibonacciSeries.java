package Package1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int first=0;
int second=1;
int next;
System.out.print(first+" ");
System.out.print(second+" ");
for(int i=0; i<=10;i++) {
	next=second+first;
	first=second;
	second=next;
	System.out.print(next+" ");
}
	}

}
