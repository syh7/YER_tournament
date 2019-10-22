package YERgen2.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@DiscriminatorValue("2")
public class Participant extends Account {

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private int playerLevel;
    private int leagueNumber;
    @NotNull
    private LocalDate dateOfBirth;
    @ManyToMany
    private List<Enrolment> enrolment;
    @ManyToMany
    private List<Team> team;

    public Participant(){
    }

    public Participant(String firstName, String lastName, int playerLevel, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerLevel = playerLevel;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getPlayerLevel(){
        return playerLevel;
    }
    public int getLeagueNumber() {
        return leagueNumber;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public List<Enrolment> getEnrolment() {
        return enrolment;
    }
    public List<Team> getTeam() {
        return team;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setPlayerLevel(int playerLevel){
        this.playerLevel = playerLevel;
    }
    public void setLeagueNumber(int leagueNumber) {
        this.leagueNumber = leagueNumber;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setEnrolment(List<Enrolment> enrolment) {
        this.enrolment = enrolment;
    }
    public void setTeam(List<Team> team) {
        this.team = team;
    }

    @Override
    public String toString(){
        String str = "ID: " + getId() + "\n";
        str += "Name: " + firstName + " " + lastName + "\n";
        str += "Born on: " + dateOfBirth.toString() + "\n";
        str += "Playerlevel: " + playerLevel + "\n";
        str += "Email: " + getEmail();
        str += "Password: " + getPassword();
        return str;
    }

}
