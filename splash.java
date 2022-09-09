/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author HP
 */
public class splash 
{
    public static void main(String args[])
    {
        splashscreen s1=new splashscreen();
        s1.setVisible(true);
        Dashboard s2=new Dashboard();
        try
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(40);
                s1.loadingnum.setText(Integer.toString(i)+"%");
                s1.loadingbar.setValue(i);
                if(i==100)
                {
                    s1.setVisible(false);
                    s2.setVisible(true);
                }
            }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
