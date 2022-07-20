package com.mycompany.sahiluos;

import java.util.*;

public class MyMain {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Array arrObj = new Array(10);
        
        boolean runProgram = true;
        int command = 0;
        
        do{
            System.out.println("--***********************************--");
            System.out.println("\tWelcome to Array DS App");
            System.out.println("Note :- This app only take Integers\n");
            System.out.println("1. Add Element in Array");
            System.out.println("2. Remove Element in Array");
            System.out.println("3. Traverse Element in Array");
            System.out.println("4. Find Minimum Element from Array");
            System.out.println("5. Find Maximum Element from Array");
            System.out.println("6. Search Any Element from Array");
            System.out.println("7. Insert Element in Array");
            System.out.println("8. Delete Element from Array");
            System.out.println("9. Exit Array App");
            System.out.println("--***********************************--");
            
            System.out.println("\nEnter Command : ");
            command = sc.nextInt();
            
            switch(command){
                case 1:
                    System.out.println("\n********************************");
                    //adding element in array
                    System.out.println("\nEnter number for add : ");
                    int n = sc.nextInt();
                    arrObj.add(n);
                    System.out.println("********************************");
                    break;
                case 2:
                    //remove element
                    arrObj.remove();
                    System.out.println("********************************");
                    break;
                case 3:
                    //traversal of array
                    System.out.println("\n********************************");
                    System.out.print("Traversal Elements are : ");
                    arrObj.traverse();
                    System.out.println("\n********************************");
                    break;
                case 4:
                    //find minimum element from array
                    System.out.println("\n********************************");
                    System.out.print("Minimum value found : ");
                    arrObj.findMin();
                    System.out.println("\n********************************");
                    break;
                case 5:
                    //find maximum element from array
                    System.out.println("\n********************************");
                    System.out.print("Maximum value found : ");
                    arrObj.findMax();
                    System.out.println("********************************");
                    break;
                case 6:
                    //search element from array
                    System.out.println("\n********************************");
                    System.out.println("Enter number for find: ");
                    int val = sc.nextInt();
                    int res = arrObj.search(val);
                    if(res >= 0){
                        System.out.println(val+" Element found at index : "+res);
                    }else{
                        System.out.println("Your element not available in array.");
                    }
                    System.out.println("********************************");
                    break;
                case 7:
                    //insert element - at specific position
                    System.out.println("\n********************************");
                    System.out.println("Enter index : ");
                    int index = sc.nextInt();
                    if(index<arrObj.len){
                        System.out.println("Enter number to insert on your given index : ");
                        int num = sc.nextInt(); 
                        arrObj.insert(index, num);
                    }else{
                        System.out.println("You aare not replacing anything bcause the array is empty.");
                    }
                    System.out.println("********************************");
                    break;
                case 8:
                    //delete element - from specific position
                    System.out.println("\n********************************");
                    System.out.println("Enter index for delete item : ");
                    int ind = sc.nextInt();
                    arrObj.delete(ind);
                    System.out.println("********************************");
                    break;
                case 9:
                    runProgram = false ;
                    System.out.println("**********************The End**********");
                    break;


                default:
                    System.out.println("nothing found");
                    break;
            }
            
            
            
        }while(runProgram);
        
    }
    
}
