import java.util.NoSuchElementException;

public class LinkedQueue
{
    Node front, rear;
    int size;

    public LinkedQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        if(front == null)
            return true;
        else
            return false;
    }

    public int getSize()
    {
        return size;
    }

    public void push(int data)
    {
        Node n = new Node(data);
        if(isEmpty())
            front = rear = n;
        else
        {
            rear.setLink(n);
            rear = n;
        }

        size++;
    }

    public int pop()
    {
        Node temp = new Node(front.getData());
        if(isEmpty())
        {
            throw new IllegalAccessError();
        }
        else
        {
            front = front.getLink();
            size--;
        }

        return temp.getData();
    }

    public int peek()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("Stack is empty.");
        }
        else
        {
            return front.getData();
        }
    }

    public String toString()
    {
        Node tempFront = front;
        String returnStr = "Stack: [";
        while(tempFront != null)
        {
            returnStr += tempFront.getData() + ", ";
            tempFront = tempFront.getLink();
        }

        returnStr += "]";

        return returnStr;
    }
}
