// Type B - Problem 2
// The tuition fee for a university is $10,000 this year. It increases by 5% every year. Write a program that computes the tuition fees in ten years.

class TypeB2{
    int fee =10000;
    public double increasementByYear(){
    for (int i=0 ; i<10 ;i++){
    fee+=fee*0.05;
    }
    return fee;
    }
    public static void main(String[] args) {
    TypeB2 tf = new TypeB2();
    double finalFee = tf.increasementByYear();
    System.out.println("The tuition fees in ten years: $" + finalFee);
    }
    }