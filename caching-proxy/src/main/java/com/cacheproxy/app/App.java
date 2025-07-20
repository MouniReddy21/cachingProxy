package com.cacheproxy.app;

public class App 
{
    public static void main( String[] args )
    {
        if(args.length<1){
            System.out.println("No command provided");
            System.out.println("Usage: caching-proxy --port <number> --origin <url>");
            return;
        }
    }
}
