package Problens;

public class NGE {

	// https://www.geeksforgeeks.org/next-greater-element/
	
	// Create a Stack from an Array
	static class stack {
        int top;
        int items[] = new int[100];
 
        // Stack functions to be used by printNGE
        void push(int x)
        {
            if (top == 99)
            {
                System.out.println("Stack full");
            }
            else
            {
                items[++top] = x;
            }
        }
 
        int pop()
        {
            if (top == -1)
            {
                System.out.println("Underflow error");
                return -1;
            }
            else {
                int element = items[top];
                top--;
                return element;
            }
        }
 
        boolean isEmpty()
        {
            return (top == -1) ? true : false;
        }
    }
	
	
	 static void printNGE(int arr[], int n)
     {
        int next, i, j;
        for (i=0; i<n; i++)
        {
            next = -1;
            for (j = i+1; j<n; j++)
            {
                if (arr[i] < arr[j])
                {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+" -- "+next);
        }
    }
	
	 
	public static void main(String[] args) {
		
		 int arr[]= {11, 13, 21, 3};
		 int n = arr.length;
		 //	        printNGE(arr, n);

		 int i = 0;
         stack s = new stack();
         s.top = -1;
         int element, next;
 
         /* push the first element to stack */
         s.push(arr[0]);
         System.out.println(s.pop());
		
		//  
         
         
	}

}
