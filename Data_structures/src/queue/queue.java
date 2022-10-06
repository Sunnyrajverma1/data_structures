package queue;

public class queue {
	
	private int data[];
	private int rear,front,size;
	public queue(int capacity)
	{
		data=new int[capacity];
		rear=-1;
		front=-1;
		size=0;
	}
	public void enqueue(int ele) throws queuefullexception
	{
		if(size==data.length)
			throw new queuefullexception();
		if(size==0)
		{
			front=0;
		}
		rear=(rear+1)%data.length;
		data[rear]=ele;
		size++;
	}
	public int  dequeue() throws queueemptyexception
	{
		if(size==0)
		{
			throw new queueemptyexception();
		}
		int temp=data[front];
		front=(front+1)%data.length;
		size--;
		if(size==0)
		{
			front=-1;
			rear=-1;
		}
		return temp;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public int front(){
		if(size==0)
		{
			return Integer.MIN_VALUE;
		}
		return data[front];
	}

}
