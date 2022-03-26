# backendIntro
The backend entrance course codes we explained for tübit.

# # Examples of data structures

# InsertionSort

[22,27,16,2,18,6] -> Insertion Sort<br/>

1-Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.<br/>
2-Big-O gösterimini yazınız.<br/>
3-Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.<br/>
4-Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? <br/>

1.Yukarı verilen dizinin sort türüne göre aşamalarını yazınız. <br/>

1-[2,27,16,22,18,6]<br/>
2-[2,6,16,22,18,27]<br/>
3-[2,6,16,22,18,27]<br/>
4-[2,6,16,18,22,27]<br/>
5-[2,6,16,18,22,27] <br/>


2.Big-O gösterimini yazınız.<br/>

n+(n-1)+(n-2)+...+1 -> Big-O gösterimi O(n^2) olur.<br/>

3.Time Complexity:<br/>

Average case:n/2 işlem(3-4)<br/>
Worst Case:n tane işlem(6)<br/>
Best Case:1 işlem<br/>
4.Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.<br/>

Avarage case kapsamında olur.<br/>

[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.<br/>


[7, 3, 5, 8, 2, 9, 4, 15, 6]<br/>
[2, 3, 5, 8, 7, 9, 4, 15, 6]<br/>
[2, 3, 4, 8, 7, 9, 5, 15, 6]<br/>
[2, 3, 4, 5, 7, 9, 8, 15, 6]<br/>
[2, 3, 4, 5, 6, 9, 8, 15, 7]<br/>


# Merge Sort Project <br/>

Input => [16, 21, 11, 8, 12, 22]<br/>

First half	Second half<br/>

[16, 21, 11]	[8, 12, 22]<br/>
[16], [21, 11]	[8, 12], [22]<br/>
[16], [21], [11]	[8], [12], [22]<br/>
[16], [11, 21]	[8, 12], [22]<br/>
[11, 16, 21]	[8, 12, 22]<br/>

Output => [8, 11, 12, 16, 21, 22]<br/>

Second Part => Big O Notation<br/>
n element => O(n) <br/>
Because it's divided by 2 => 2^x = n => log(n) = x => O(log(n))<br/>
O(n), O(log(n)) => O(nlogn)


# Binary Search Tree<br/>

[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] -> Binary-Search-Tree <br/>


              7
             / \
           5     8 
         /   \    \
        1     6    9
        /     /
       0     3
        /  \
      2     4 

