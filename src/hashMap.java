import java.util.HashMap;
import java.util.Map;

public static void hashMapf(){
    HashMap<String,String> language= new HashMap<String,String>();

    //put()

    language.put("England","Australia");
    language.put("NewZealand","Australia");
    language.put("India","Bangladesh");
    language.put("West Indies","South Africa");
    language.put("England","Srilanka");

    System.out.println(language);

    HashMap<String,String> mapInsert= new HashMap<String,String>();
     mapInsert.put("India","New Delhi");
     mapInsert.put("Bangladesh","Dhaka");
     mapInsert.put("Srilanka","Sri jayewardenpura kotte");
     mapInsert.put("UK","London");


     //putAll()
    language.putAll(mapInsert);
    System.out.println(language);


    //merge()
    language.merge("England","null",(a,b)-> a+"->"+b);
    System.out.println("merge():"+language);

    //clone()
    HashMap cloned= (HashMap) language.clone();
    System.out.println("clone():"+cloned);

    //size()
    System.out.println(language.size());


    //putIfAbsent()
    language.putIfAbsent("Afganistan","Istambul");
    language.putIfAbsent("Afganistan","Istambul");
    System.out.println("putIfAbsent()"+language);


    //remove()
    language.remove("England");
    System.out.println("remove():"+language);

    //containValue()
    System.out.println("containsValue():"+language.containsValue("South Africa"));

    //get()
    System.out.println("get():"+language.get("West Indies"));

    System.out.println("getOrDefault():"+language.getOrDefault("England","NO VALUE"));

    //compute
    System.out.println("This Key contain null:"+language.get("England"));
    language.compute("England",(a,b)->"Australia");
    System.out.println("compute():"+language);
    System.out.println("This Key->Value Is :"+language.get("England"));

    for(Map.Entry<String,String> it : language.entrySet()){
        String key = it.getKey();
        String value =it.getValue();

        System.out.println("key::"+key+"::::value::"+value);
    }
    System.out.println("keyset");
  for(String languages : language.keySet()){
      String value= language.get(languages);
      System.out.println(value);
  }
}
public void main(){
 hashMapf();
}