package SlideViewer;

public class Slide<E> implements Printable{

    private Title title;
    private Style style;
    private SinglyLinkedList<E> elem = new SinglyLinkedList();

    public  E getElem(E element) {
        int i = elem.search(element);
        if(i > 0){
            return elem.get(i);
        }
        else{
            throw new NullPointerException();
        }
    }
    
    public SinglyLinkedList getElem(){
        return elem;
    }

    public void addElement(E texto) {
        elem.insertLast(texto);
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String print() {
        return "";
    }

}
