package mypackage;

public class StackDemo {
	static final int max=1000;
	int top;
	int[] a= new int[max];
	boolean isEmpty() {
		return top<0;
	}
	StackDemo(){
		top=-1;
	}
	boolean push(int x) {
		if(top>=max-1) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top]=x;
			System.out.println(x+" pushed in to stack");
			return true;
		}
	}
	int pop() {
		if(top<0) {
			System.out.println(" Stack is Underflow");
			return 0;
		}
		else {
			int x=a[top--];
			return x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDemo s=new StackDemo();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.top);
		System.out.println("Printing stack elements:");
		for(int i=0;i<=s.top;i++) {
			System.out.println(s.a[i]+"   ");
		}
		System.out.println(s.pop()+" popped from the stack");
		System.out.println(s.pop()+" popped from the stack");
	}

	

}
