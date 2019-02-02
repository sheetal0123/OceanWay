#Sorting Algos:

#For interviews:
coding practice for Bubble, selection etc
algo for all specially Heap Sort


#Ranking of Algos (http://bigocheatsheet.com/)
Cond: If array length is long and space is limited + element value is large 
HeapSort is best then MergeSort

Cond: If array elements values are smaller e.g. 0 to 999 numbers to be sorted  + array length can be small or large
Counting/Radix Sort is best bet
For big digits elements counting/radix algo are very bad as it create a array space in 
memory depending upon max value present in array


counting/radix sort | [1,5,2,7,10]     |   short array with low element  | space O(k)
counting/radix sort | [1,1,1,5,4,4,4,4,6,6,6,6,5,2,8,8,..........n]   | long array but low value elements 
heap sort           | [800,600,1000,400,9000]    |   short array with high value element  |  space O(1) 
heap sort           | [1600,600,1000,............................n]   | long array but high value elements




#Basic information:
1. Binary Tree : A Tree structure where there is one root (top element) and max two children i.e. left & right; 
   one children is allowed called leaves
   
2. Binary Heap : Binary heap is a binary tree such that every node is greater/smaller than its children
	max heap : nodes is greater than its children    
    min heap : nodes is smaller than its children
   Binary Heap can be easily represented in Array form which gives space advantage of array
   
   
   
--------------------------------------------------------------------------------
new data:


Static Array(Arrays):  Fixed in size, cannot grow automatically, defined while compile time e.g. Arrays
Dynamic Array(ArrayList):  Can grow at runtime, Element store continuously in memory, To resize complete set copied to new location(heavy operation), element insertion/deletion in middle is very costly as all other need to move right/left
Dynamic Linked Array(LinkedList) : Can grow at runtime, element store randomly in memory, can easily resize, easily to insert/delete element in middle

#To access any element i.e. get() operation
Arrays + ArrayList  = O(1), as it directly fetch from index e.g. ls.get(10);
LinkedList = O(n) , as it start from first element and go one by one to reach particular element ll.get(10)

#To Insert/Delete element at beginning/middle
Arrays : Not possible
ArrayList : O(n) as we need to move all other element
LinkedList : O(1) as only pointer need to change

#To Insert/Delete element in middle
Arrays : Not possible
ArrayList : O(n) as we need to move all other element
LinkedList : O(1) as only pointer need to change

#To Insert/Delete element at last
Arrays : Not possible
ArrayList : O(1) as we need to simply add in the end
LinkedList : O(1) as only pointer need to change



  