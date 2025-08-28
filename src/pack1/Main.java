package pack1;

public class Main {

	public static void main(String[] args) {
		
		
		    File file1 = new File("resume.pdf");
	        File file2 = new File("photo.jpg");
	        File file3 = new File("song.mp3");

	        
	        Directory documents = new Directory("Documents");
	        Directory media = new Directory("Media");
	        Directory root = new Directory("Root");

	       
	        documents.add(file1);
	        media.add(file2);
	        media.add(file3);
	        root.add(documents);
	        root.add(media);

	     
	        root.print("");	
	
		
	}

}
