package Utility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UtilityFiles {
	 static List<String> files = new ArrayList<String>();
	public static List<String> GetFilesInDir(String path){
        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null) return null;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
            	GetFilesInDir( f.getAbsolutePath() );
                System.out.println( "Dir:" + f.getAbsoluteFile() );
            }
            else {
            	 files.add(f.getAbsolutePath());
                System.out.println( "File:" + f.getAbsoluteFile() );
            }
        }
		return null;
	}

}
