package DS ;
class Node {

    int data ;
    Node next ;

    Node(int data){
    	this.data = data ;
    	this.next = null ;
    }    

}

public class LinkedList{
       Node head ;
        
        public void prepend(int data){
        	if(head==null){
           		this.head = new Node(data) ;
           		return ;
        }
        	Node x = new Node(data) ;
        	x.next = this.head ;
        	this.head = x ;
        	return;
        }

        
        public void append(int data){

        if(head==null){
        	this.head = new Node(data) ;
        	return ;
        }
        Node current = this.head ;

        while(current.next !=null){
        	current = current.next ;
        }
        current.next = new Node(data) ;
        return ;
         }

        public void search(int data)
        {

                 
				if(head==null){
				System.out.println("the list is empty");
                     return ;}

                int i = 0;
                Node current = this.head ;
			    while(current.next!=null){
                    if(current.data==data)
                    	{System.out.println("Found at "+ i) ;
                           return ;}
                    current = current.next ;
                    i++ ;
                    }
                    System.out.println("Not Found !!") ;
                    return ;

			    }


        public void delete(int data)
        {

        		if(head.data==data)
        		{
        			this.head=head.next;
        			return;
        		}
        		Node current=head;
        		while(current.next!=null)
        		{
        			if(current.next.data==data)
        			{
        				current.next=current.next.next;
        				return;
        			}
        		

        			current=current.next;

        		}

              System.out.println("node not found");
              return;

        }

public void showList(){

if(head==null){
	System.out.println("List is empty ");
	return ;
}


Node current =head;
while(current.next!=null)
{
	System.out.println(current.data);
	current=current.next;
}
	System.out.println(current.data);
return;
}

}
