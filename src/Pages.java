void main() {
    Scanner scanner = new Scanner(System.in);

// Store your age as an integer in a variable named age
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

// Compute the minimal number of pages using the formula: 100 - age
    int minPages = 100 - age;

// Display the result
    System.out.println(age + "-year olds should read at least " + minPages + " pages before giving up on a book.");

    scanner.close();
}
