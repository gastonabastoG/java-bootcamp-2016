package com.tom.bootcamp;



import java.util.List;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
	private static List<String> files = new ArrayList<String>();
	public static List<String> listRecentFiles(){

		return files;
	}
	
	public static void openFile(String file){
		
		if(files.contains(file)){
			files.remove(file);
			files.add(0, file);
		}
		else{
			files.add(0, file);
		}
		
		//System.out.print("adding "+file);
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
