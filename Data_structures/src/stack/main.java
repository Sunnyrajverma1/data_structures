package stack;

public class main {
	public static void main(String args[])
	{
		stack s=new stack(5);
		System.out.println(s.isEmpty());
		s.push(12);
		System.out.println(s.size());
		System.out.println(s.top());
		s.push(13);
		System.out.println(s.size());
		System.out.println(s.top());
		try{
			System.out.println(s.pop());
		}
		catch(stackemptyexception e){
			System.out.println("empty");
		}
		
		System.out.println(s.isEmpty());
		try{
			System.out.println(s.pop());
		}
		catch(stackemptyexception e){
			System.out.println("empty");
		}
		System.out.println(s.isEmpty());
		
		
		
		
		
		
	}

}
