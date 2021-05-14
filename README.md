# DS-Algo
Implementation of Data structures And ALgorithms.

### HashSet  - to store only Keys
	Syntax - Set<String> h  = new HashSet<>(); // only non primitive data types Integer, String, Character,...
	Use -  to preform search,insert, delete or subset of search,insert,delete on collection of items - use HashSet.
	1. add()
	2. set1.addALL(set2) -   union if two sets
	3. set1.retainALl(set2) -  intersection of two sets
	4. set1.containsAll(set2) - boolean type - if set2 is subset of set1
	5. size()
	6. remove()
	7. contains() 
	8. clear()
	9. isEmpty()
	10.traversal in set -1  - using iterators
    	while(i.hasNext())
		System.out.print(i.next()+ " ")

   	traversal in set - 2 - using for loop
   	for( String s :  h)
		System.out.print(s+ " ");

### HashMap - to store key-value  pair
	Syntax  - HashMap<K, V> m  = new HashMap<>();  // K for Key , V for Value
	Functions in HashMap
	1. put(K,V)
	2. putAll()
	3. putIfAbsent()
	4. get(K)
	5. containsValue(V) - containsKey(K)
	6. replace(K,v)  - replace(K,Old_V,New_V)
	7. remove(K) - remove(K,V)
	8. keySet() -  values()   - entrySet()
	9. traversal in map 
   	for( Entry<String, Integer> e :  m.entrySet())
		System.out.println(e.getKey() +  " " +  e.getValue());

#### COUNT DISTINCT ELEMENTS
	NaiveM1 - TC:O(n^2) , ASC:O(1)
	1. run two nested loops i, j : i from [0,n) - j from [0,i)
	2. for each i, if arr[i] is not found again in range[0,i) - break jth loop and increment count for vice versa. 
	3. return the count
	EffecientM2 -  TC:O(n) , ASC:O(n)
	1. Put all elements in HashSet and print the size.

### Strings
	String s1 ="Akshay"  - by literals -  just creates in string pool area
	String s2 = "Akshay"
	String s2 = new String("Akshay")  - by new object -  creates in both String pool and heap area
	Functions :
	1. s1.length()
	2. s1.charAt(index)
	3  s1.substring(k) - prints from [k,last]
	4. s1.substring(int beginIndex, Int lastIndex) -  prints from [beginIndex,lastIndex)
	5. s1.contains(s2) - boolean - if s2 is substring of s1
	6. s1==s2 -  references are compared not the content  - true	
	Eg . s1==s2 true - > s1==s3 - false;
	6. s1.equals(s2) - comapre the content use equalsTo() or compare() - true
	Eg . s1.equls(s2) - true - > s1.equals(s3) - true;
	7. res = s1.compareTo(s2)  - if s1 lexographically greater then s2 , returns greater value else smaller value. If same returns 0.
	Eg: a<b<c<d<e<.....lexographical order. Eg s1="geeks" , s2 ="for" returns +ve value;
	8. s1.indexOf(s2,k)  - returns the 1st index of 1st kth occurence of s2 in s1
	Eg. s1="richdadpoordad" , s2="dad" -> s1.indexOf(s2,2) -> 11.

### Queue - 
	Interface implemented by following classes - LinkedList and ArrayDeque(one of the way is using circular Array)
	1. enqueue()
	2. dequeue()
	3. size()
	4. getFront()
	5. getRear()
	6. isFull()
	7. isEmpty()
	Functions that returns null v/s throws exception
	8. peek()	-	element()
	9. offer()	- 	add()
	10. poll()	- 	remove()

### Array Deque: 
	Time complexity if each operation is O(1) - beacause using Circular Array implementation - Amortized(on Average) 
	It is a Queue specific class and do not have list functions
	It is faster then LL as Array implementation is used. - Cache friendly.
	Use AD as Stack : AD is faster then Standard Stack Class - because stack uses vector which is threadsafe and issue of overhead occurs.
	Use AD as Queue : Queue used LL implementation where AD uses array implementation (faster)
	Use AD as Deque : Deque implementaion - LL and AD(preferred and faster)
	Methods : 
	Throws exception	v/s	return false/null
	addFirst()		-	offerFirst()
	addLast()		-	offerLast()
	removeFirst()		-	pollFirst()
	removeLast()		-	pollLast()
	getFirst()		-	peekFirst()
	getLast()		-	peekLast()

	Redundant functions - AD implements Queue Interface, Deque interface, and provides main finctionalities of Stack class.
	Queue: it is a interface - insert at rear, delete from front - FIFO
	add()  same as addLast()		-	offer() same as offerLast()
	remove() same as removeFirst()		- 	poll()  same as pollFirst()
	element() same asgetFirst		-	peek()  same as peekFirst()
	
	Stack : LIFO - it is not an interface- its a legacy class inherits vectors.
	push() same as addFirst()
	pop() same as removeFirst()
	peek() same as peekFirst()


### Tree:
	AVL Tree
	A self-balancing Binary Search Tree (BST) where the difference between heights of left and right subtrees cannot be more than one for all nodes.
	
	Red Black Tree
	This is a self-balancing Binary Search Tree (BST) where every node follows the following rules:
	1. Every node has a color either red or black.
	2. The root of tree is always black.
	3. There are no two adjacent red nodes (A red node cannot have a red parent or red child).
	4.  Every path from a node (including root) to any of its descendant NULL node has the same number of black nodes.