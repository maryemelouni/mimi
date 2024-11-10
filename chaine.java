package serie2;
    public class chaine
    {
    public static int nbrMot(String ch)
    {
    ch=ch.trim();
    int l=ch.length();
    if (l==0)
    return 0 ;
    else
    {
    int n=1;
    for(int i=0;i<l;i++)
    {
    if (ch.charAt(i)==' ' && ch.charAt(i+1)!=' ')
    n++;
    }
    return n ;
    }
    }
    public static void ConsVoyNum (String ch)
    {
    ch=ch.trim();
    int l=ch.length();
    int vo=0,con=0;
    char[] cons=new char[l];
    char[] voy=new char[l];
    ch.toLowerCase();
    System.out.println(" affichage des caractéres numériques ");
    for(int i=0;i<l;i++)
    {
    char c =ch.charAt(i);
    switch (c)
    {
        case "0", "1", "2", "3", "4", "5" ,"6", "7", "8", "9" :System.out.print(c+"");
        break;
        case 'a', 'e', 'y' ,'i', 'o' ,'u' : { voy[vo]=c; vo++; } break;
        case 'z','r','t' ,'p', 'q' ,'s', 'd', 'f', 'g' ,'h' ,'j' ,'k', 'l', 'm','w' ,'x', 'c', 'v' ,'b', 'n' :{cons[con]=c ; con++;}break;
    }
    }
    
    6
    
    System.out.println("\n affichage des consonnes " + cons.toString());
    System.out.println("\n affichage des voyelles" + voy.toString());
    }
    /*public static String codage(String ch)
    {
    ch=ch.trim();
    //String s=ch.charAt(0);
    int n =ch.length();
    for(int i=2;i<n;i+=2)
    s=s+ch.charAt(i)+ch.charAt(i+1);
    return s ;
    }*/
    public static void main(String[]args)
    {
    Chaine s=new Chaine();
    Chaine.nbrMot("ines02362");
    Chaine.ConsVoyNum("ines02362");
    //Chaine.codage("ines");
    }
    }
}
