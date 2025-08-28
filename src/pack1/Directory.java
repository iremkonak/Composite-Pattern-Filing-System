package pack1;
import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem {
    private String name;
    private List<FileSystemItem> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ Directory: " + name);
        for (FileSystemItem item : children) {
            item.print(indent + "  ");
        }
    }

	public void addFilee(File file1) {
	
		
		
	}

	public void addDirectoryy(Directory documents) {
		
		
	}

	
	}




