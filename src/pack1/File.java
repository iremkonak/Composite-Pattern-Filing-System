package pack1;

public class File implements FileSystemItem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "- File: " + name);
    }
}
