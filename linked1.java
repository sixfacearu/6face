class linked1
{
	Node head;
	int count=0;
static class Node    
{
	int data;
	Node next;
	Node(int d)   //constructor 
	{
	data=d;
	next=null;
        }
}
void display()  //display the data in linked list
{
	Node n=head;
	while(n!=null)
        {
	System.out.print(n.data+" ");
	n=n.next;
        }

}
void push_head(int new_data)  //push the data in head
{
	Node new_node=new Node(new_data);
	new_node.next=head;
	head=new_node;
}
void delet(int key)       //delet the particular data in the linked list
{

	Node temp=head,prev=null;
	if(temp !=null && temp.data==key)
	{
	 head=temp.next;
	 return;
	}
        
	while(temp!=null && temp.data!=key)
	{
	   prev=temp;
	   temp=temp.next;
	}
        if(temp==null)
	{
	 System.out.println("its not a linked list data:");
	 return;
	}
        prev.next=temp.next;
}
void delet_position(int position)  // delet the particular position data in the linked list
{

	Node temp=head; //temp assign head
	if(position==0)      //position ==0 means head =temp.next;
	{
	 head=temp.next;
	 return;
	}
        int i=0;
        
	while(temp!=null && i<position-1)  //temp !=null and position <-1
	{
	   
	   temp=temp.next;
	   i++;
	}
        if(temp==null)  //temp is not have a element 
	{
	 System.out.println("its not a linked list data:");
	 return;
	}
        Node next=temp.next.next;
	temp.next=next;
}
void delet_Full() //delete the linked list completly
{
	head.next=null;
}
void length()  //Find the length of the linked list
{
	Node temp=head;
	
	while(temp!=null)
	{
	 count++;
	 temp=temp.next;
	}
	System.out.println("length of the array is:"+count);
}
 public boolean search(Node head, int x)
    {
        Node current = head;    //Initialize current
        while (current != null)
        {
            if (current.data == x)
                return true;    //data found
	    System.out.println("yes");
            current = current.next;
        }
        return false;    //data not found
	
    }
public static void main(String args[])
{

	linked1 link=new linked1();
	link.head=new Node(10);
	Node second=new Node(20);
	Node thired=new Node(30);
	link.head.next=second;
	second.next=thired;
	link.search(link.head,30);
        link.push_head(5);
        link.delet(20);
	link.delet_position(1);
	link.display();
	link.length();
 	link.delet_Full();
	System.out.println("delet complete array:");
	link.display();
        link.length();
}
}
