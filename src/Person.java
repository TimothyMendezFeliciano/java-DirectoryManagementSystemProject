public class Person {

    public enum NameOrder {
        FirstMiddleLast, FirstLastMiddle, LastFirstMiddle
    }

    private String last;
    private String first;
    private String middle;
    private NameOrder printOrder;


    public Person(String last, String first, String middle) {
        this.last = last;
        this.first = first;
        this.middle = middle;
        this.printOrder = NameOrder.FirstMiddleLast;
    }


    public void printName() {

        if (printOrder == NameOrder.FirstMiddleLast) {
            System.out.println(first + "  " + middle + "  " + last);

        } else if (printOrder == NameOrder.FirstLastMiddle) {

            System.out.println(first + " ," + last + " " + middle);

        } else if (printOrder == NameOrder.LastFirstMiddle) {

            System.out.println(last + " ," + first + " " + middle);

        }
    }

    public NameOrder getPrintOrder() {
        return this.printOrder;
    }
    public void setPrintOrder(NameOrder printOrder) {
        this.printOrder = printOrder;
    }

    public String getLast() {
        return this.last;
    }

    public void setLast(String last) {
        this.last = last;
    }


    public String getMiddle() {
        return this.middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getFirst() {
        return this.first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

}