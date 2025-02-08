import java.util.Objects;

public class TextFile extends File {
    private String content;

    public TextFile(String name) {
        super(name);
        this.content = "";
    }

    public void addContent(String content) {
        this.content += content;
    }

    public void clearContent() {
        this.content = "";
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(content, textFile.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), content);
    }

    @Override
    public String toString() {
        return "TextFile{name='" + name + "', content='" + content + "'}";
    }

    public void printContent() {
        if (content.isEmpty()) {
            System.out.println("Файл пуст.");
        } else {
            System.out.println(content);
        }
    }
}
