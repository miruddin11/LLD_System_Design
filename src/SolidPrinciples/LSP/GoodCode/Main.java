package SolidPrinciples.LSP.GoodCode;

public class Main {

    public static void readAnyFile(ReadableFile file) {
        file.read();
    }
    public static void main(String[] args) {
        ReadableFile readableFile = new ReadableFile();
        readableFile.read();

        WritableFile writableFile = new WritableFile();
        writableFile.read();
        writableFile.write();

        readAnyFile(readableFile);
        readAnyFile(writableFile);
    }
}
