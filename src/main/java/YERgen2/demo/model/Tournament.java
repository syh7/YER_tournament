package YERgen2.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;
    private String referee;
    private String location;
    @NotNull
    private LocalDate startDate;
    @NotNull
    private LocalDate endDate;
    private LocalDate enrolDate;
    private int maxDisciplines;
    private int[] categories;
    @NotNull
    @ManyToOne
    private Admin admin;

    public Tournament(){

    }

    public Tournament(String name, String referee, String location, LocalDate startDate, LocalDate endDate, LocalDate enrolDate, int maxDisciplines, int[] categories, Admin admin) {
        this.name = name;
        this.referee = referee;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.enrolDate = enrolDate;
        this.maxDisciplines = maxDisciplines;
        this.categories = categories;
        this.admin = admin;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getReferee() {
        return referee;
    }
    public String getLocation() {
        return location;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public LocalDate getEnrolDate() {
        return enrolDate;
    }
    public int getMaxDisciplines() {
        return maxDisciplines;
    }
    public int[] getCategories() {
        return categories;
    }
    public Admin getAdmin() {
        return admin;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setReferee(String referee) {
        this.referee = referee;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public void setEnrolDate(LocalDate enrolDate) {
        this.enrolDate = enrolDate;
    }
    public void setMaxDisciplines(int maxDisciplines) {
        this.maxDisciplines = maxDisciplines;
    }
    public void setCategories(int[] categories) {
        this.categories = categories;
    }
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

}
