package stack;

public class stack {
	private int topindex;
	private int data[];
	public stack(int size)
	{
	    topindex=-1;
		data=new int[size];
	}
	public void doublecapacity()
	{
		int temp[]=data;
		data=new int[2*data.length];
		for(int i=0;i<data.length/2;i++)
		{
			data[i]=temp[i];
		}
	}
	public  void push(int ele)
	{
		if(topindex==data.length-1)
		{
			doublecapacity();
		}
		data[++topindex]=ele;
	}
	public int pop() throws stackemptyexception
	{
		if(topindex==-1)
		{
			throw new stackemptyexception();
		}
		int temp=data[topindex];
		topindex--;
		return temp;
		
	}
	public int top()
	{
		if(topindex==-1)
		{
			return Integer.MIN_VALUE;
		}
		return data[topindex];
	}
	public boolean isEmpty()
	{
		if(topindex==-1)
		{
			return true;
		}
		return false;
	}
	public int size()
	{
		return topindex+1;
	}
}
