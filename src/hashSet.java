import java.util.*;
public void main(){
    hashSet();
}
void hashSet(){
    HashSet<Integer> iNt= new HashSet<>();
    iNt.add(5);
    iNt.add(100);
    iNt.add(500);
    iNt.add(1000);
    iNt.add(10);
    iNt.add(1);
    iNt.add(5);

    //For Iterator of hash set
    Iterator<Integer> it= iNt.iterator();
    while(it.hasNext()){
        System.out.print(it.next()+" ");
    }
    System.out.println("\n");
    System.out.println("nnnnnnnnnn");
    for(Integer its: iNt){
        System.out.println(its);
    }

    //Size of hashset
    System.out.println(iNt.size());
  //2nd Hashset
    HashSet<Integer> iNt1= new HashSet<>();
    iNt1.add(5);
    iNt1.add(11);
    iNt1.add(502);
    iNt1.add(1024);
    iNt1.add(10);
    iNt1.add(1);
    iNt1.add(5);

   for (Integer element : iNt){
       System.out.println(iNt1.contains(element)?"Yes":"NO");
   }
    System.out.println(iNt1.size());
    System.out.println(iNt.size());

    HashSet<Integer> cLone=new HashSet<>();
    cLone=(HashSet)iNt.clone();
    System.out.println(cLone);


    //hash map to array
    Integer  arrayList[]= new Integer[iNt.size()];
     iNt.toArray(arrayList);
     for (Integer element : arrayList){

        System.out.println("toArray():"+element);
    }

     //hashset to treeset
    Set<Integer> treeSet= new TreeSet<>(iNt);
     for (Integer element : treeSet){
         System.out.println("TreeSet<>():"+element);
     }
    System.out.println("\n");
    for (Integer element : treeSet){
        if(element<7)
        System.out.println("TreeSet<>():"+element);
    }

iNt.removeAll(iNt);
    System.out.println("Removed:"+iNt.size());
}