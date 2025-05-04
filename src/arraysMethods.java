
import java.util. ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public static void arraysMethods(){


    ArrayList <Integer> array1=new ArrayList<Integer>();

    //add()
    array1.add(10);
    array1.add(100);
    array1.add(101);
    array1.add(11);
    array1.add(1);
    Collections.sort(array1.reversed());
    System.out.println("add():"+array1);
    System.out.println("size():"+array1.size());

    //addAll()
    ArrayList<Integer> array2=new ArrayList<Integer>();
    array2.add(12);
    array2.add(102);
    array2.add(20);
    array2.add(201);
    array2.add(2001);
    array1.addAll(array2);
    System.out.println("array2:"+array2);
    System.out.println("addAll():"+array1);

    //contains()
    System.out.println("contains(10):"+array1.contains(10));

    //get()
    System.out.println("get(9):"+array1.get(9));

    //indexOf()
    System.out.println("indexOf(2001):"+array1.indexOf(2001));


    //clone()
    ArrayList arrayClone = (ArrayList) array1.clone();
    System.out.println("clone():"+arrayClone);

    //subList()
    System.out.println("subList():"+array1.subList(0,5));

    //set()
    array1.set(0,50);
    System.out.println("set(0,50):"+array1);


    //Collections and sort()
    Collections.sort(array1);
    System.out.println("sort():"+array1);



   //forEach()
    array1.forEach((n)-> System.out.println(n));


    Iterator<Integer> it= array1.iterator();
  //iterator()
    while(it.hasNext()) {
        System.out.println(it.next());
    }
    System.out.println("nnnnnnnnnnnnnnnnn");
    for(Integer its: array1){
        System.out.println(its);

    }
}


public void main(){
    arraysMethods();
}
