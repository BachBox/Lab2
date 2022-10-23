package Lab2;

public class Student {
    private int id;
    private String name;
    private double mathScore;
    private double physicscore;
    private double chemistryScore;
    private double averageScore;
    private char classify;

    public Student(int id, String name, double mathScore, double physicscore, double chemistryScore) {
        this.id = id;
        this.name = name;
        this.mathScore = mathScore;
        this.physicscore = physicscore;
        this.chemistryScore = chemistryScore;
    }

    


    public Student(String name, double averageScore, char classify) {
        this.name = name;
        this.averageScore = averageScore;
        this.classify = classify;
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

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicscore() {
        return physicscore;
    }

    public void setPhysicscore(double physicscore) {
        this.physicscore = physicscore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", averageScore=" + averageScore + ", classify=" + classify + "]";
    }




    public double getAverageScore() {
        return averageScore;
    }




    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }




    public char getClassify() {
        return classify;
    }




    public void setClassify(char classify) {
        this.classify = classify;
    }

    

    

}
