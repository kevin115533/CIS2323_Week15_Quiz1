import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class FileStatistics {
	public static void main (String args[]){
	Path userFile = Paths.get("SomeFolder/sample.txt");
	
	try{
	BasicFileAttributes attr = Files.readAttributes(userFile, BasicFileAttributes.class);
	
	System.out.println("Files name: " + userFile.getFileName());
	System.out.println("Files containing folder: " + userFile.toString());
	System.out.println("Files size: " + attr.size());
	System.out.println("Files time of modification: " + attr.lastModifiedTime());
	}
	catch(IOException e)
	{
	System.out.println("Something went wrong");
	}
	
	}
}