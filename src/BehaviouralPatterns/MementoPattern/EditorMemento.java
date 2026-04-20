package BehaviouralPatterns.MementoPattern;

// Mementor class : Stores the internal state of the text Editor
public class EditorMemento {
    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
