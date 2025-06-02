//code for lecture number 8-ARRAY(PART 1)  AND ARRAY(II)

import java.util.Scanner;
public class array8{
    
    // public static void update(int marks[]){
    //     for(int i=0;i<marks.length;i++){
    //         //1.arrays are call by reference
    //         marks[i]=marks[i]+1;

    //     }
    // }
    // public static int linearsearch(int num[],int key){
    //     for(int i=0;i<num.length;i++){
    //     if(num[i] == key){
    //         return i;
    //     }
    //     }

    //     return -1;
        
    // }

    // public static int largest(int number[],int large,int small){
    //     for(int i=0;i<number.length;i++){
    //         if(large < number[i]){
    //             large=number[i];
    //         }
    //         if(small>number[i]){
    //             small=number[i];
    //         }
    //     }
    //     System.out.println("smallest value is:-"+ small);
    //     return large;
    // }



        // public static int binarysearch(int num[],int start,int end,int val){
        //   while(start<=end){
        //     int mid=(start+end)/2;

        //     if(num[mid] == val){
        //         return mid;
        //     }
        //     if(num[mid]> val){
        //         end=mid-1;
        //     }
        //     else{
        //         start=mid+1;
        //     }

        //   }
        //     return -1;

        // }


// public static void reverse(int num[]){
//     int start=0 ,end=num.length-1;

//     while(start<end){
//             //swap
//             int temp=num[end];
//             num[end]=num[start];
//             num[start]=temp;

//             start++;
//             end--;
//     }
// }


// public static void pairsofanarray(int num[]){
//     int totalpairs=0;
//     for(int i=0;i<num.length;i++){
//         int current=num[i];
//         for(int j=i+1;j<num.length;j++){
//             System.out.print("(" + current +"," + num[j] +") ");
//             totalpairs++;
//         }
//         System.out.println();
//     }
//     System.out.println("total no.of pairs:-"+totalpairs);  
// }//if n no.of elements in array the total no of pairs formed can be derived from the formula n(n-1)/2
//time complexity is o(n square) bcz nested loops are used in th code


// public static void printsubarrays(int num[]){
//     int totalsub=0;
//     for(int i=0;i<num.length;i++){  //start element
    
//         int start=i;
//         for(int j=i;j<num.length;j++){  // end element
//             int end = j;
        
//         for(int k=start; k<=end;k++){  //print all number in between start and end that is a subarray
//             System.out.print(num[k]+" ");

//         }
//         totalsub++;
//         System.out.println();
//     }
//     System.out.println();
// }
// System.out.println("total subarrays is:"+totalsub);
// }



//ARRAYS(I)
    //  public static void main(String[] args) {
    //     Scanner sc =new Scanner(System.in);
        //creating an array
        // int marks[]=new int[100];

        // //input in array
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();

        // System.out.println("phy:" + marks[0]);
        // System.out.println("chem:" + marks[1]);
        // System.out.println("bio:" + marks[2]);

        // //update in array
        // marks[1]=100;

        //  System.out.println("updated chem:" + marks[1]);

        // //caluclations in array
        // int percentage=(marks[0]+marks[1]+marks[2])/3 ;
        // System.out.println("percentge " +percentage+ "%");


        // //length of array
        // System.out.println("length of ARRAY IS:" + marks.length);  //100 as the size defined is 100 creation of array.


        //1.passing arrays as arguments
        // int marks[]={98,78,99,67};
    
        // update(marks);

    //      printing an array after update
    // for(int i=0;i<marks.length;i++){
    //     System.out.println(marks[i]+" ");
    // }
    //     System.out.println();

        //2.linear search
        // int num[]={2,4,6,8,10,12,14,16,18};
        // int key=9;

        // int index=linearsearch(num, key);
        // if(index == -1){
        //     System.out.println("key not found in the array num");
        // }else{
        // System.out.println("the index at which the key is found is:" + index);
        // }

        //3.largest and smallest number in array
        // int number[]={1,2,3,6,54};
        // int large=Integer.MIN_VALUE;   //-infinity
        // int small=Integer.MAX_VALUE;//+infinity

        // int l=largest(number,large,small);
        // System.out.println("the largest number in array is:-"+ l);


        //binary search
        // int num[]={2,4,6,8,10,12,14};
        //   int start=0;
        //     int end=num.length-1;
        //     int val=10;

        //     int index=binarysearch(num, start, end, val);
        //     if(index == -1){
        //         System.out.println("val not  found in array.");
        //     }else{
        //     System.out.println("val is found at index:" + index);
    //         }




    //reverse an array
        // int num[]={2,4,6,8,10};
        // reverse(num);
        // for(int i=0;i<num.length;i++){
        //     System.out.print(num[i]+" ");
        // }
        // System.out.println();




        //pairs in an array
        // int num[]={2,4,6,8,10};
        // pairsofanarray(num);




        //print sub arrays
        //n(n+1)/2 
        // int num[]={2,4,6,8,10};

        // printsubarrays(num);
        //end











// arrays  - II
// public static void maxsubarraysum(int num[]){
//     int currsum=0;
//     int maxsum=Integer.MIN_VALUE;

//     for(int i=0;i<num.length;i++){  //start element
    
//         int start=i;
//         for(int j=i;j<num.length;j++){  // end element
//             int end = j;
//             currsum=0;
        
//         for(int k=start; k<=end;k++){  //print sum of subarray
//             currsum +=num[k];

//         }
//         System.out.println(currsum);
//         if(maxsum < currsum){
//             maxsum=currsum;
//         }
       
        
//     }
    
// }
// //time complexity is big oh of n cube bcz of use of 3 nested loops

// System.out.println("max sum is" + maxsum);

// }



//prefix sum approach to find the max subarray(optimiazed)

// public static void prefixsummaxsubarray(int num[]){
//     int currsum=0;
//     int maxsum=Integer.MIN_VALUE;
//     int prefix[]=new int[num.length];


//     prefix[0]=num[0];
//     //calc prefix array
//     for(int i =1;i<prefix.length;i++){
//         prefix[i]=prefix[i-1]+num[i];
//     }



//     for(int i=0;i<num.length;i++){  //start element
    
//         int start=i;
//         for(int j=i;j<num.length;j++){  // end element
//             int end = j;

//             currsum= start ==0 ?prefix[end]:prefix[end]-prefix[start-1];

//         if(maxsum < currsum){
//             maxsum=currsum;
//         }
       
        
//     }
    
// }
// //time complexity is nsquare bcz of omly two loops there.


// System.out.println("max sum is" + maxsum);

// }



//max subarraysun kadane algorithm(most optmized approach)

// public static void kadanemaxsubarraysum(int num[]){
//     int currsum=0;
//     int maxsum=Integer.MIN_VALUE;
   


//     for(int i=0;i<num.length;i++){  
//         currsum +=num[i];
//         if(currsum<0){
//             currsum=0;
//         }
//         maxsum=Math.max(currsum,maxsum);    //comapring maxsum and curr sum
    
//     }
    
// System.out.println("max subarray sum is:" + maxsum);
//  //time complexity is bid oh of n
   
// }




//trapping rain water(medium)
// public static int trapwater(int height[]){
//     int n=height.length;
//     //left max boundary array
//     int leftmax[]=new int[n];
//     leftmax[0]=height[0];
//     for(int i=1;i<n;i++){
//         leftmax[i]=Math.max(height[i],leftmax[i-1]);
//     }

//     //right max boundary array
//   int rightmax[]=new int[height.length];
//     rightmax[n-1]=height[n-1];    //last right bar
//     for(int i=n-2;i>=0;i--){
//         rightmax[i]=Math.max(height[i],rightmax[i+1]);
//     }

// int trappedwater=0;
//     //loop
//     //waterlevel=min(left max boundary,right max baoundary)
//     for(int i=0;i<n;i++){
//       int  waterlevel=Math.min(leftmax[i],rightmax[i]);
//          //trap water=(waterlevel -height)*width of bar
//       trappedwater += waterlevel-height[i];
//     }
//     return trappedwater;
//     //time complexity is big oh of n times
 
// }



// public static int buyandsellstocks(int price[]){
//     int buyprice =Integer.MAX_VALUE;
//     int maxprofit=0;

//     for(int i=0;i<price.length;i++){
//         if(buyprice<price[i]){
//             int profit=price[i]-buyprice;
//             maxprofit=Math.max(maxprofit,profit);
//         }else{
//             buyprice=price[i];
//         }
//     }
//     return maxprofit;
//     //time complexity is big oh of n
// }



  






       //ARRAYS (II)
    //  public static void main(String[] args) {
    //     Scanner sc =new Scanner(System.in);

        //MAX SUBARRAY SUM
        // int num[]={2,4,6,8,10};

        // maxsubarraysum(num);


        //prefix sum
        // prefixsummaxsubarray(num);

        //kadane algo
        // int num[]={-2,-3,4,-1,-2,1,5,-3};
        // kadanemaxsubarraysum(num);



        //trapping rainwater
        // int height[]={ 4,2,0,6,3,2,5};

        // int rain_water=trapwater(height);
        // System.out.println("the total trapped rain water is:" + rain_water);

        // //buy and sell stocks
        //  int price[]={7,1,5,3,6,4};

        // int maxprofit=buyandsellstocks(price);
        // System.out.println("the maxprofit of the stocks is:" + maxprofit);
        //END



        








    // public static boolean  search(int matrix[][],int key){
    //     for(int i=0;i<matrix.length;i++){    //rowise
    //         for(int j=0;j<matrix[0].length;j++){  //columnswise
    //             if(matrix[i][j] == key){
    //                 System.out.println("found at cell (" + i +","+j+")");
    //                 return true;
    //             }
         
    //         }
           
    //     }
    //     System.out.println("key not found.");   
    //     return false;

    // }




//sprial matrix

        // public static void printspiralmatrix(int matrix[][]){
        //     int startrow=0;
        //     int startcol=0;
        //     int endrow=matrix.length-1;  // n-1
        //     int endcol=matrix[0].length-1; //n-1






        //     while(startrow <= startcol && endrow<=endcol){
        //         //top
        //         for(int j=startcol; j<=endcol; j++){    // j variable is for column
        //             System.out.print(matrix[startrow][j]+" ");
        //         }

        //         //right
        //         for(int i=startrow+1; i<=endrow;i++){
        //             System.out.print(matrix[i][endcol]+" ");

        //         }

        //         //bottom
        //         for(int j=endcol-1; j>=startcol;j--){
                   
        //             if(startrow == endrow){
        //                 break;
        //             }
        //              System.out.print(matrix[endrow][j]+" ");
        //         }

        //         //left
        //         for(int i=endrow-1;i>=startrow+1;i--){
                  
        //             if(startcol == endcol){
        //                 break;
        //             }
        //               System.out.print(matrix[i][startcol]+" ");
        //         }
        //         startcol++;
        //         startrow++;
        //         endcol--;
        //         endrow--;
              
        //     }
        //       System.out.println();

        // }


//diagonal sum
// public static int diagonalsum(int matrix[][]){
//     //brute force code big oh of nsqyare
//     int sum=0;

    // for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix[0].length;j++){
    //         if(i==j){
    //             sum += matrix[i][j];
    //         }
    //         else if((i+j) == matrix.length-1){
    //             sum += matrix[i][j];
    //         }
    //     }
    // }


    //optimised code
//     for(int i=0;i<matrix.length;i++){           //O(n)
//         //primary diagonal
//         sum += matrix[i][i];
//         //secondary diagonal
//         if(i != matrix.length-1-i){   //avoid adding of same number in middle when there is odd*odd matrix 
//         sum += matrix[i][matrix.length-i-1];
//         }
        
//     }
//         return sum;
// }



// public static boolean searchinssortedmatrix(int matrix[][], int key){    //STAIRCASE SEARCH O(n+m)     ifn>>>m o(n)  if m>>>>>n O(m))
//         int row=0, col=matrix[0].length-1;

//         while(row<matrix.length && col >= 0){
//             if(matrix[row][col] == key){
//                 System.out.println("found key at (" + row +","+col +")");
//                 return true;
//             }
//             else if(key < matrix[row][col]){
//                 col--;    //move towards left
//             }else{    //when key > matrix[row][col]
//                 row++;    //move towards bottom
//             }
//         }
//         System.out.println("key not found.");
//         return false;
// }



//practice questions
//1.
// public static int searchcountofnum(int arr[][], int key){
//     int count =0;
//     for(int i=0;i<arr.length;i++){
//         for(int j=0;j<arr[0].length;j++){
//             if(key == arr[i][j]){
//                 count++;
//             }
//         }
//     }
//    return count;
// }

// 2.
// public static int sumofsecondrow(int nums[][]){    //mycode o(n^2)
//     int sum=0;
//     // for(int i=0;i<nums.length;i++){
//     //     for(int j=0;j<nums[0].length;j++){
//     //         if(i == nums.length-2){
//     //             sum=sum+nums[i][j];
//     //         }
//     //     }
//     // }


//     //optimized code
//     //sum of 2nd row
//     for(int j=0;j<nums[0].length;j++){        //o(n)
//         sum += nums[1][j];  
//     }
//     return sum;
// }


//transpose of a mtarix

// public static void printmatrix(int [][] matrix){        //this function will print both matrix as well as the transpose depending on the matrix that we pass in the bracket of the function
//     System.out.println("the matrix is:-");
//     for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             System.out.print(matrix[i][j]+"  ");
//         }
//         System.out.println();
    
//     }    

// }



          // 2D arrays
         public static void main(String[] args) {     
        Scanner sc =new Scanner(System.in);
        // //CREATION OF 2D ARRAYS
        
        // int matrix[][]=new int[3][3];           //total no.of cells=rows*columns
        // int n=matrix.length, m=matrix[0].length;
        // for(int i=0;i<n;i++){    //rowise travel
        //     for(int j=0;j<m;j++){    //columnwise travel
        //         matrix[i][j]=sc.nextInt();

        //     }
        // }
        // //output
        // for(int i=0;i<n;i++){    //rowise
        //     for(int j=0;j<m;j++){  //columnswise
                
        //     System.out.print( matrix[i][j]+" ");   //printing the data
        //     }
        //     System.out.println();
        // }
        // System.out.println("enter key:");
        // int key=sc.nextInt();
        // // search(matrix, key);



    //sprial matrix
    // int matrix[][]={{1,2,3,4},
    //                 {5,6,7,8},
    //                 {9,10,11,12},
    //                 {13,14,15,16} };



    //     // printspiralmatrix(matrix);
    //     int dsum=diagonalsum(matrix);
    //     System.out.println("the diagonal sum is:"+ dsum);



     //search in a sorted matrix
    //  int matrix[][]={{10,20,30,40},
    //                 {15,25,35,45},
    //                 {27,29,37,48},
    //                 {32,33,39,50}};   
    // int key=100;
    // searchinssortedmatrix(matrix, key);





    //practice questions
    //1.
    // int arr[][]={{4,7,8},{8,8,7}};
    // int key=7;
    // int count=searchcountofnum(arr,key);
    //  System.out.println("the count of 7 is:" + count);



    //2.
    // int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
    // int sum=sumofsecondrow(nums);
    // System.out.println("the sum of 2nd row is:" + sum);





    //3.
    // int matrix[][]={{11,12,13},{21,22,23}};
    //  int row=2  ,col=3;

     //print matrix 
    //  printmatrix(matrix);


     //transpose of matrix
    // int [][] transpose=new int [col][row];
    // for(int i=0;i<row;i++){
    //     for(int j=0;j<col;j++){
    //         transpose[j][i]=matrix[i][j];
    //     }
    // }
    //print transpose
    //  printmatrix(transpose);
    
    // System.out.println("the transpose of matrix is"+ trans);
  

     }}