package activities;

public class Activity5 {
    public static void main(String []args) {
        String title = "Memories around US";
        Book newBook = new MyBook();
        newBook.setTitle(title);
        System.out.println("The title is: " + newBook.getTitle());
    }
}
