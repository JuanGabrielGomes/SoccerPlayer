package jogador;
import java.time.LocalDate;
import java.time.Period;

public class SoccerPlayer {
    private String name;
    private String position;
    private LocalDate dateOfBirth;
    private String nationality;
    private double height; // in metros
    private double weight; // in kilos

    // Constructor
    public SoccerPlayer(String name, String position, LocalDate dateOfBirth,
                         String nationality, double height, double weight) {
        this.name = name;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Print all player information
    public void printInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Posição: " + position);
        System.out.println("Aniversário: " + dateOfBirth);
        System.out.println("Nacionalidade: " + nationality);
        System.out.println("Altura: " + height + " meters");
        System.out.println("Peso: " + weight + " kg");
    }

    // Calculate the age of the player
    public int calculateAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    // Calculate the years left for retirement
    public int AnosQueFaltam() {
        int age = calculateAge();
        int aposentAge = 0;

        switch (position.toUpperCase()) {
            case "DEFESA":
                aposentAge = 40;
                break;
            case "MEIOCAMPO":
                aposentAge = 38;
                break;
            case "ATAQUE":
                aposentAge = 35;
                break;
            default:
                aposentAge = 35; // Default to Attacker's retirement age
        }

        return aposentAge - age;
    }
}