/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carworkshop.mob;

/**
 *
 * @author bhayu
 */
public class test {
    public static void main(String [] args)
    {
//        if(true)
//            System.out.println("pahla");
//         if(true)
//            System.out.println("pahla");
        int y=0;
        while(y<1000)
        {
            y++;
            System.out.println((char)y+"   ====== "+y);
        }
        System.out.println(checkExp("%$^#"));
        
    }
    public static boolean checkExp(String str)
        {
            int a;
            str=str.toUpperCase();
         for(int j=1;j<=str.length();j++)
        {
                                    a=(int)str.charAt(j-1);
              if(a>=65&&a<=90||a==45||a==32&&a>=97&&a<=122&&a>=48&&a<=57){}
                    else
                    {   
                            return !(a<65||a>90);
                    }
        } 
              return true; 
        }
}
