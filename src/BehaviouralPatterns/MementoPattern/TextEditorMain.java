package BehaviouralPatterns.MementoPattern;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.write("A");
        caretaker.saveState(editor);

        editor.write("B");
        caretaker.saveState(editor);

        //Problem -> Undo the last write !

        editor.write("C");
        caretaker.saveState(editor);

        //Caretaker Undo
        caretaker.undo(editor);

        System.out.println(editor.getContent());
    }
}
