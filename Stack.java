package DS ;
public class Stack
{

private int top =-1,size=1;
private int[] arr;

 public Stack(int size){
 	this.size=size;
 	this.top=-1;
 	this.arr = new int[size] ;
 }
public void push(int data)
{
	if(top==size-1){
		System.out.println("Stack overflow");
		return;

		}
	
	arr[++top]=data ;	
    return ;
}

public int pop(){
	if(top==-1){
		System.out.println("Stack underflow");
		return -1;
	}

	return arr[top--] ;

}
public int getTop(){
	if(top<0)
		return -1;
	return arr[top];
}


}
