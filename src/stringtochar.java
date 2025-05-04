import java.util.Arrays;
//CHAR TO STRING
static void charString(){
    char [] ch={'a','e','i','o','u'};
    String st = new String(ch);
    System.out.println("Char to String:"+st);
}
//STRING TO CHAR
static void stringChar(){
    String st= "   This is my World    ";
    //trim() method used
    String tst= st.trim();


    //Format method
    System.out.println("format():"+String.format("Hello added to fomat in string %s!",st));


    char [] ch= st.toCharArray();
    System.out.println("Char Array:"+Arrays.toString(ch));

    char[] tch=tst.toCharArray();

   //How to print char Array
    System.out.println("trim():"+Arrays.toString(tch));

}

static void trialMethods(){

    //join() Methods
    String st= String.join("-","heelo","world");
    System.out.println("join():"+st);


    //Split () Methods
    String str="This,is,how,we,get,the,splits";
    String []stre =str.split(",");
    System.out.println("split():"+Arrays.toString(stre));

    //compareTo()
    String st1="ashish first string";
    String st2="This second String";
    System.out.println("compareTo():"+st1.compareTo(st2));
    System.out.println("compareToIgnoreCase():"+st1.compareToIgnoreCase(st2));

    //replace()
  String st3="This is replace method";
    System.out.println("replace():"+st3.replace('a','A'));

    String st4="This is about the replace all method";
    System.out.println("repalceAll():"+st4.replaceAll("This","All"));


    //substring()
    System.out.println("substring():"+st4.substring(0,5));

    //contains()
    System.out.println("contain():"+st4.contains("This"));

    //equal()
    String st5="This is about the replace all method";
    System.out.println("equal():"+st4.equals(st5));

    //equalIgnoreCase()
    String st6="This is about the replace ALL METHOD";
    System.out.println("equalsIgnoreCase():"+st6.equalsIgnoreCase(st5));

    //indexOf()
    System.out.println("indexof():"+st6.indexOf("ALL"));

    //valueOf()
    System.out.println("valueOf:"+String.valueOf(st6));

    //matches()
    System.out.println("matches():"+st6.matches("This is about the replace ALL METHOD"));

    //intern()
    String st7= new String("Me the savier");
    String st8= st7.intern();
    System.out.println("intern():"+st8);

    //getByte()
    System.out.println("getByte():"+st7.getBytes());

    //hashCode()
    System.out.println("hashCode():"+st7.hashCode());
}
public void main() {
    charString();
    stringChar();
    trialMethods();
}


