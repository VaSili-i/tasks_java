import java.util.Objects;

public class TextFile extends File {
    private StringBuilder content;

    public TextFile(String name) {
        super(name);
        this.content = new StringBuilder();
    }

    public void addContent(String text) {
        content.append(text);
    }

    public void printContent() {
        System.out.println(content);
    }

    public void clearContent() {
        content = new StringBuilder();
    }

    @Override
    public String toString() {
        return "TextFile{name='" + name + '\'' + ", content='" + content + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(content.toString(), textFile.content.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), content.toString());
    }
}