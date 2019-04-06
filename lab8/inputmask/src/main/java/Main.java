/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */


/*
    Sample Program Demonstrating the use of Patterns for an Input Mask
    Uses java.io.Console for Screen output and input.

    ref: https://docs.oracle.com/javase/7/docs/api/java/io/Console.html

*/


import java.io.Console;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main
{
    public static void main(String args[])
    {
        App app = new App() ;
        Console c = System.console() ;
        BufferedReader br;
        try {
            InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
            br = new BufferedReader(isr);
        } catch (Exception ex) {
            System.err.println(ex);
            return;
        }
        for (;;) {
            System.out.print("\033[H\033[2J") ; // clear the screen
            System.out.flush() ;
            System.out.println( app.display() ) ;
            System.out.print( "Key (Digit or X or Delete) => " ) ;
            try{
                String ch = br.readLine();
                app.key( ch ) ;
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}