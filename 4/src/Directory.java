import java.util.ArrayList;
import java.util.Objects;

public class Directory {
    private String name;
    private ArrayList<File> files;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public void listFiles() {
        System.out.println("Файлы в каталоге '" + name + "':");
        for (File file : files) {
            System.out.println(file);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(name, directory.name) && Objects.equals(files, directory.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, files);
    }

    @Override
    public String toString() {
        return "Directory{name='" + name + '\'' + ", files=" + files + '}';
    }
}