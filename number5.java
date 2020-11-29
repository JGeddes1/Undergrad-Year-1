
public class number5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fib1=0;
int fib2=1;
int fib=15;
int i=15;
int fib3=15;
System.out.print(fib1+""+fib2);

for(i=2;i<fib;++i){
	
	fib3=fib1+fib2;
	System.out.print(" "+fib3);
	fib1=fib2;
	fib2=fib3;
}
	}

}
