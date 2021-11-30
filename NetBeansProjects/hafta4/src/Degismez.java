/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student99
 */
public  class Degismez {
    public static void  main(String[] args)
    {
        final int a = 5;
        final int b = 3;
        System.out.println("a = :" + a +"br" + "b = :" + b);
        
        ft_final();
    }
    void parametre (final byte c) 
    {
        
    }
    public static void ft_final() 
    {
        System.out.println("Final method miraz alinamaz ve overide yapilamaz ");
    }
    
}

class method extends Degismez
{
    Degismez lol = new Degismez();
    
}

class ornek extends Degismez
{

}
