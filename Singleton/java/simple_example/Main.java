package simple_example;

class Main {
  public static void main(String[] args) {
    MySingleton ms1 = MySingleton.getInstance();
    MySingleton ms2 = MySingleton.getInstance();
    System.out.println("First object address: " + ms1);
    System.out.println("Second object address: " + ms2);
    System.out.println("Are they equal? " + (ms1 == ms2));
  }
}
