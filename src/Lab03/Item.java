package Lab03;

public class Item {
    private int content;

    public synchronized int getContent() {
        return content;
    }

    public synchronized void setContent(int content) {
        this.content = content;
    }
}
