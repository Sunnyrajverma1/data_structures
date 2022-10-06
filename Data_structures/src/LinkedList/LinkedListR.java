package LinkedList;
import java.util.*;
public class LinkedListR {
	Scanner sc= new Scanner(System.in);

	public Node<Integer> take()
	{
		int data=sc.nextInt();
		
		Node<Integer> head;
		if(data==-1){
			head=null;
			
			return head;	
		}
		else
		{
			Node<Integer>curr=new Node <Integer>(data);
			
			head=take();
			curr.next=head;
			head=curr;
			return head;
		}
		
	}
	public Node<Integer> insert(Node<Integer> head,int data,int pos)
	{
		Node<Integer> curr=new Node<Integer>(data);
		if(head==null&&pos>0)
			return head;
		if(pos==0)
		{
			curr.next=head;
			head=curr;
			return head;
		}

		head.next=insert(head.next,data,pos-1);
		return head;
	}
	public int size(Node<Integer>head)
	{
		int count=0;
		if(head==null)
			return count;
		if(head.next==null)
		{
			count=count+1;
		}
		count=size(head.next);
		count=count+1;
		return count;
	}
	public Node<Integer>delete(Node<Integer>head,int pos)
	{
		
		if(head==null)
			return head;
		
		if(pos==1)
		{
			head=head.next;
			return head;
		}
		head.next=delete(head.next,pos-1);
		return head;
	}
	public void print(Node<Integer>head)
	{
		if(head==null)
			return;
		System.out.print(head.data+" -->");
		print(head.next);
	
	}

}
