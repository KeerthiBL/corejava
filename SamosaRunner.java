class SamosaRunner{

public static void main(String[] sweet){


float cost=25.0f;
boolean flavour=false;
Samosa samosa=new Samosa(cost,flavour);
System.out.println(samosa.cost);
System.out.println(samosa.taste);
System.out.println(samosa.size);
System.out.println(samosa.ingredients);

String[] inc={"salt","onion","oil"}; 
 
Samosa samosa1=new Samosa(10.0f,false,Samosasize.MEDIUM,inc);
System.out.println(samosa1.cost);
System.out.println(samosa1.taste);
System.out.println(samosa1.size);
System.out.println(samosa1.ingredients);

}




}