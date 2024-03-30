package package1;

import java.time.Year;

public class Bmi {

    int id;
    String name;
    String yob;
    int height;
    int weight;

    double bmi;
    String category;
    String recommendation;
    int age;

    public Bmi(int id, String name, String yob, int height, int weight) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.height = height;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public String getCategory() {
        return category;
    }

    public int getAge() {
        age = Year.now().getValue() - Integer.parseInt(yob);
        return age;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void calculate() {
        this.bmi = this.weight / ((height / 100.0)*(height / 100.0));

    }

    public void display() {
        this.calculate();
        if (bmi < 16) {
            category = "Severe undernourishment";
            recommendation = "You require prompt medical care and assistance with nutrition without delay.";
        } else if (bmi > 16 && bmi < 16.9) {
            category = "Medium undernourishment";
            recommendation = "You require a well-rounded diet abundant in essential nutrients, complemented by consistent meals and adequate hydration.";
        } else if (bmi > 17 && bmi < 18.4) {
            category = "Slight undernourishment";
            recommendation = "Concentrate on incorporating more nutrient-rich foods into your diet.";
        } else if (bmi > 18.5 && bmi < 24.9) {
            category = "Normal nutrition state";
            recommendation = "Continue to emphasize the importance of maintaining a balanced diet.";
        } else if (bmi > 25 && bmi < 29.9) {
            category = "Overweight";
            recommendation = "Engage in regular physical activity and seek guidance and support from healthcare professionals. ";
        } else if (bmi > 30 && bmi < 39.9) {
            category = "Obesity";
            recommendation = "Incorporate regular exercise into your routine and implement behavioral changes as needed.";
        } else if (bmi > 40) {
            category = "Pathological obesity";
            recommendation = "Urgently seek medical attention and seek guidance from healthcare professionals without delay.";
        }

        System.out.println("User Id :" + this.id);
        System.out.println("User Name :" + this.name);
//        System.out.println(" , User Year Of Birth :"+this.yob);
//        System.out.println(" , User Height :"+this.height);
//        System.out.println(" , User weight :"+this.weight);

        System.out.println("User Age :" + this.getAge());
        System.out.println("User BMI :" + this.bmi);
        System.out.println("User  BMI category is :" + this.category);
        System.out.println("Recommendation :" + this.getRecommendation());

    }

}
