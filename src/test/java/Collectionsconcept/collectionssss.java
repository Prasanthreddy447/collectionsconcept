package Collectionsconcept;

public class collectionssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//variables --> to store data 
//datatype is to tell which data type we can store
//primitive data type -->byte  -- 8 bits
//short  2 byte
//int   4 byte
//long  8 byte
//float 4 byte
//double 8 byte
//char 2 byte
//boolean  true false

//Arrays --> group of values store in single varaible with same data type
//int[] a = new int[]

//limitations of arrays
// fixed in size 
// only homogenous data we can store


// if we create only student variable we can store only student values
/*
 student[] s = new student[]
 s[0] = new student(10,"first")
 s[1] = new student(20,"second")
 s[2] = new employee(30,"third")  -> we cannot store this value why beacause it is not same type
 */

/*
 object array
 
 Object[] o = new Object[]
 o[0]= new student(10,"first")
 o[1]= new student(20,"second")
 o[2]= new employee(30,"third") 
 we can store hetrogenous data, but size is fixed , not growable array
 */

// no sorting, update,remove methods we need write our own logic
 
/*
 to over come pblms of array we are going for collections
 collections are used to store group of objects or values
 collections are growable in nature
 dynmically it can be increased or decreased
 store any type of data in collections
 providing pre defined methods to retrive, update and delete
 
 collection is entity or container to store object or value
 
 collections called framework y because it is providing pre defined interfces and classes
 and methods to perform operations on data.
 
 */

/*
 collection (I)
 list(I)
 Set(I)
 queue(I)
 Map(I)
 
                    Iterable(I)
                    
                    collection(I)
                    
            list(I)           set(I)                queue(I)             map(I)(it is not part of collection)        
            
            Array list(c)     hash set(c)                                  Hashtable
            Linked list(c)    linked hash set(c)                           Hashmap
                vector(c)        soreted set(I)                            Sortedmap(I)
      stack(c) (extends vector)            treeset(c)                           Treemap(c)
 */

/*
  List   -> allow duplicates
  Set    -> not allow duplicates
  Queue  -> fifo
  Map   --> key value pair
  
  
  List Interface
  --> child interface of collection
      4 implementation classes
       AL
       LL
       Vector 
       stack
       
     We cannot create objects for list interface
     for child classes which is implementing interface we can create objects  
       
   AL al = new AL();
   L l = new AL(); 
 */

/*
 Cursors
 -------
 Iterator
 ListIterator
 enumerator 
 
 collection framework related classes, interfaces, methods belong to java.util.package
 collection interface proving several methods 
 add(object o)  --> store one object
 get(index)     --> to retrive the object
 remove(index)  --> to delete the object
 set(index,value) --> to replace the object using index
 indexof(object o)   --> first occurance
 lastindexof(object o)  --> last occurance
 
 */

/* List Interface
 extending from collection interface
 allow duplicates
 allow insertion order
 4 clasess implement list
 AL
 LL
 Vector 
 stack
 
 AL
 --
 Implenting class of list
 Allow duplicactes
 Preserve insertion order
 null values accepted
 Internal structure of AL is growable array
 default capacity is 10
 if 10 capacity completed then again 10 capacity comes
 
 AL al = new AL();
 
 AL al = new AL(int capacity);  capacity initially allocated
 AL al = new AL(Collection c); one collection to another collection
 
 methods of array list
 ---------------------
 add(object o)
 addall(collection c)
 remove(object o)
 remove(index)
 contains(object o)
 clear()
 isEmpty()
 retainAll(collection c)  all common elements remove remaining
 indexof()
 lastIndexof()
 set(index, value)
 get(index)
 add(index, value)
 iterator()  only forward
 ListIterator() forward and backward
 
 
 
 AL is not recommended for insertion  -- lot of shifting
 AL is recommended for retrieving the data
 
 */

/*
 LL
 --
 Implementation class for list Interface
 internal data strucuture is Double linked list
 insertion order preserved
 duplicates are allowed
 null objects are allowed
 homogenous and hetrogenius we can store
 insertion easy
 retrieving is not easy  it take to much time first node to last node
 
 */

/*Vector
 class implements list
 internal data structure is Growable array
 duplicates allowed
 insetion order preserved
 synchronized **
 vector is legacy class
 to traverse vector we use enumerator(legacy) as cursor
 null value allowed
 
   
   Enumeration<Integer> elements = i.elements();
   while(elements.hasmoreElements())
   {
   elements.hasElement();
   }
   
 */

/*
 stack
 ------
 class which implements list interface
 extends vector class
 data structure LIFO
 PUSH() -- to insert element
 Pop()  to remove last element
 peek()  -- to get last element
 
 enumeration is applicable legacay
 
 
 */



/*
 Set
 ----
 set is interface availabale in java util package
 extending from collection interface
 set is used to strore grp objects
 duplicates are not allowed
 supports homo and hetro
 
 implenetation classes
 Hashset
 linked hash set
 tree set
 
 */

/*
 Hashset
 -------
 implementation class set interface
 duplicates are not allowed
 insertion not preserved
 null value allowed
 intial capcity 16
 inernal data structure is hashtable
 load factor 0.75
 
 HashSet hs = new HashSet();
 HashSet hs = new HashSet(int capacity, Loadfactor)
 
 Iterator<String> it = v.iterator();
 while(it.hasNext())
 {
   s.o.p(it.next());
 }
 */

/*
 Linked hashset
 --------------
 implementing class for set interface
 duplicates are not allowed
 one null value
 insertion order preserved
 data structure is double linked list + hashtable
 intial cpacity 16
 load factor 0.75
 
 */

/*
 Treeset
 --------
 imlementing class for set interface
 it will mantain natural sorting order 
 duplicates are not allowed
 null values not allowed
 data structure binary tree
 supports homogenous data
  note: it should be homogenous why? if we add other data type it should compare then we will get class caste exception
  note: if we add null value it compare with null value then we will get nullpointer exception
 */

/*
 Map
 ----
 Map interface available in java util package
 map is used to store data in key value pair
 one key value pair is entity
 one map object can have multiple enteries
 im map key value should be unique and value should be duplicate
 
  Map<KEY, Value> m = new Map<Key,value>();
  if we try to duplicate key then it will replace old key with new key value
  
  Implementation classes
  Hashmap
  linked hash map
  treemap
  hashtable
  identity hashmap
  weaked hash map
  concurrent hasmap
  
  Methods
  -------
  put(k,v)   --> to store one entry into map object
  get(k)     --> to get value based on key
  remove(k)  --> to remove one entry based on key
  containskey(k)  --> to check presence of key
  keyset()   --> to get all keysof map
  values()   ->to get all values of map
  entryset()  --> to get all enteries
  clear()  --> to make map object empty
  isEmpty()  --> to check map is empty or not
  
 */

/*
 Set<Integer> s = map.keyset();
 
  for(Integer g:s)
  {
       map.get(g)  --> to get value
  }
  
  
  map.containskey(101)
  map.isempty()
  map.clear()
  
 collection<String> c= map.values()
 
 for(String s:c)
 {
    s.o.p(s)  --> print all values
 }
  
  set<Entry<String,integer>> e =map.EntrySet()
  
  Iterator i = e.iterator();
  while(i.hasNext())
  {
     Entry<String,integer> entry =i.next();
     s.o.p(entry.getkey() +   + entry.getvalue());
  }
  
  
 */

/*hashmap
  -------
  It is implementation class for map interface
  used to store in key value pair
  default capaity 16
  load factor 0.75
  data structure hash table
  insertion order will not be maintained
 
 */

/*
 Linked hasmap
 -------------
 Implenetataion class for map interface
 maintains insertion order
 data structure is hashtable + double linked list
 */


/*
 TreeMap
 ------
 extedns map interface
 natural sorting order for keys
 data structure is binary tree
  
 */

/*
 Queue
 ------
 extends properties of collection interface
 used store group of objects
 internal data structure is FIFO
 Insertion order happends at end
 remove will happen at begin
 */











