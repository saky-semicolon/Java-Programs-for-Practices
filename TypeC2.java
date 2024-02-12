// Type C - Problem 2
// Write a Java program to store ten integer numbers in array variables and display the even index value.

class TypeC2 {
    public static void main(String[] args) {
    int[] numbers = {5, 12, 8, 33, 19, 7, 25, 14, 40, 3};
    for (int i=0; i<10 ; i++){
    if (numbers[i]%2==0){
    System.out.println(i + " ");
    }
    }
    }}