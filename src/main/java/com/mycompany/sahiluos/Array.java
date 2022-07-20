package com.mycompany.sahiluos;

public class Array {
    
    int max,len;
    int[] arr;
    
    public Array(int max){
        this.max = max;
        len = 0;
        arr = new int[max];
    }
     
    
    int add(int n){
        if(len<max){
            arr[len] = n;
            len++;
        }else{
            System.out.println("Array is full.");
        }
        return len;
    }
    
    void traverse(){
        if(len>0){
            for(int i=0;i<len;i++){
                System.out.print(""+arr[i]+" ");
            }
        }else{
            System.out.println("Empty array.");
        }
    }
    
    void findMax(){
        if(len>1){
            int n = arr[0];
            for(int i=1;i<len;i++){
                if(n < arr[i]){
                    n = arr[i];
                }
            }
            System.out.println(""+n);
        }else if(len == 1){
            System.out.println(""+arr[0]);
        }else{
            System.out.println("Empty array.");
        }
    }
    
    void findMin(){
        if(len>1){
            int n = arr[0];
            for(int i=1;i<len;i++){
                if(n > arr[i]){
                    n = arr[i];
                }
            }
            System.out.println(""+n);
        }else if(len == 1){
            System.out.println(""+arr[0]);
        }else{
            System.out.println("Empty array.");
        }
    }
    
    void remove(){
        if(len>0){
            arr[--len] = 0 ;
            System.out.println("Remove element from "+len+" index.");
        }else{
            System.out.println("Empty array - no item to delete.");
        }
            
    }
    
    int search(int n){
        
        if(len>0){
            for (int i = 0; i < len; i++) {
                if(n == arr[i]){
                    return i;
                }
            }
        }else{
            System.out.println("Empty array.");
        }
        
        return -1 ;
    }
    
    void insert(int index,int value){
        if(index<len){
            int temp = arr[index];
            arr[index] = value;
            System.out.println( temp+" : Element on this index : "+index+" Replace with your given index : "+value);
            traverse();
        }
        
    }
    
    void delete(int index){
        
        if(index<len){
            int temp = arr[index];
            arr[index] = arr[index+1];
            for (int i = (index+1); i < len; i++) {
                arr[i] = arr[i+1];
            }
            len--;
            System.out.println("Delete this element " + temp + " from this index "+index);
        }else if(index==(len-1)){
            int temp = arr[index];
            arr[index]=0;
            len--;
            System.out.println("Delete this element " + temp + " from this index "+index);
        }else{
            System.out.println("Nothing found");
        }
        traverse();
    }
    
}
