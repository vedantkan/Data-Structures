package homw.hw_2;

import java.util.Scanner;

public class Sequence<E>{
    protected Object[] data;
    protected int size;

    public Sequence(int n) throws IllegalArgumentException{
        if(n<0){
            throw new IllegalArgumentException();}
        this.data=new Object[n];
        this.size=0;
    }

    public int size(){
        return this.size;
    }

    public void append(E element){            
        if(this.size<this.data.length){
            this.data[this.size]=element;
        }
        else{
            Object[] temp=new Object[this.size+1];
            System.arraycopy(this.data, 0, temp, 0, this.size);
            this.data=temp;
            this.data[this.size]=element;
        }
        this.size++;    
    }

    public Object get(int k) throws IndexOutOfBoundsException{
            if(k<0 || k>=this.size){
                throw new IndexOutOfBoundsException();}
            return this.data[k];
    }

	public void print(){
		System.out.print("\nCurrent Sequence: ");
		for(int i=0;i<this.size();i++){
            System.out.print(this.get(i)+" ");
        }
		System.out.println();
	}
	
    public void insert(int index, E newElement){
        if(index<0 || index>=this.size){
           throw new IndexOutOfBoundsException();
        }
        
        else{
            Object[] temp1 = new Object[this.size+1];
            System.arraycopy(this.data,0,temp1,0,index);
            temp1[index] = newElement;
            System.arraycopy(this.data,index,temp1,index+1,this.size-index);
            this.data = temp1;
        }
        
        this.size++;
    }

	public void delete(int index){
            if(index<0 || index>=this.size){
               throw new IndexOutOfBoundsException();
            }
            
            else{
                Object[] temp2 = new Object[this.size-1];
                System.arraycopy(this.data, 0, temp2, 0, index);
                System.arraycopy(this.data, index+1, temp2, index, this.size-index-1);
                this.data = temp2;
            }
            
            this.size--;
            
	}
	
    public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		Sequence<Integer> s = new Sequence<Integer>(5);
		s.append(1);
		s.append(2);
		s.append(3);
		s.append(4);
		s.append(5);
		s.print();
		
                //
                
                boolean x = true;
                
                while(x){
                    
                    System.out.println("Please enter 1 to insert, 2 to delete, 3 to exit");
                    int a = in.nextInt();
                    
                    if(a!=1 && a!=2 && a!=3){
                        System.out.println("Wrong Input");
                        s.print();
                    }
                                        
                    if(a==1){
                        System.out.println("Please enter a value to insert");
                        int v = in.nextInt();
                        System.out.println("Please enter the index");
                        int i = in.nextInt();
                        s.insert(i, v);
                        s.print();
                    }

                    if(a==2){
                        System.out.println("Enter an index to delete");
                        int d = in.nextInt();
                        s.delete(d);
                        s.print();
                    }
                    
                    if(a==3){
                        System.out.println("Goodbye");
                        x=false;
                    }
                      
                        
                }
                       
                
                
             	//INSERT CONTROL LOOP HERE
		
    }   //End main
}   //End class