void main() {
    Scanner scanner = new Scanner(System.in);

    // Store your age as an integer in a variable named age
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    // Compute the youngest age using the formula: 7 + (age / 2)
    int youngestAge = 7 + (age / 2);

    // Display the result
    System.out.println(age + "-year olds should date somebody who is at least " + youngestAge + " years old.");

    scanner.close();
}
