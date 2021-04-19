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
10. traversal in set -1  - using iterators
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