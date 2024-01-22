public class BMICalculator extends Person {
    private double height;
    private double weight;
    public BMICalculator(String name, double age, double height, double weight) {
    super(name, age);
    this.height = height;
    this.weight = weight;
    }
    public double calculateBmi() {
    double bmi = weight / (height * height);
    return bmi;
    }
    public void showInfo() {
    double bmi = calculateBmi();
    if (bmi > 25) {
    System.out.println("Height: " + height + " m., " + "Weight: " + weight + " kg., " + "BMI: " + bmi + ", You're overweight.");
    } else if (bmi > 18.5) {
    System.out.println("Height: " + height + " m., " + "Weight: " + weight + " kg., " + "BMI: " + bmi + ", You're normal weight.");
    } else {
    System.out.println("Height: " + height + " m., " + "Weight: " + weight + " kg., " + "BMI: " + bmi + ", You're underweight.");
    }
    }
   }