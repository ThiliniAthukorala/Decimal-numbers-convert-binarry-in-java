public class Stack {
    private StackNode top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty(){
        if (this.top==null){
            return true;
        }else{
            return false;
        }
    }

    public void push(int data){
        StackNode stack=new StackNode(data);
        if (isEmpty()){
            this.top=stack;
        }else{
            stack.setNext(this.top);
            this.top=stack;
        }
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("Empty stack");
        }else {
            this.top=this.top.getNext();
        }
    }

    public void print(){
        StackNode temp=this.top;

        while (temp!=null){
            System.out.print(temp.getData());
            temp=temp.getNext();
        }

    }


}
