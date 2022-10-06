package queue;
import java.util.Stack;

public class QueueUsing2stacks {
	Stack<Integer> s1=new Stack<Integer>();
	Stack<Integer> s2=new Stack<Integer>();
	public void enqueue(int ele){
		System.out.println("enqueue  "+ele);
		s1.push(ele);
		return ;
	}
	public int dequeue()
	{
		System.out.println("dequeue  ");
		while(s1.size()!=0)
		{
			if(s1.size()==1)
				return s1.pop();
			else
			{
				s2.push(s1.pop());
			}
		}
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		return Integer.MIN_VALUE;
	}
	public int size(){
		return s1.size();
	}
	public boolean isEmpty()
	{
		return s1.isEmpty();
	}

}
