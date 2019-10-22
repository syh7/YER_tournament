package YERgen2.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Enrolment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long partnerLeagueNumber;
    @NotNull
    private int playerLevel;
    @NotNull
    private Discipline discipline;
    @NotNull
    @ManyToOne
    private Tournament tournament;

    public Enrolment() {}
    public Enrolment(@NotNull int playerLevel, @NotNull Discipline discipline, @NotNull Tournament tournament) {
        this.playerLevel = playerLevel;
        this.discipline = discipline;
        this.tournament = tournament;
    }
    public Enrolment(long id, long partnerLeagueNumber, @NotNull int playerLevel, @NotNull Discipline discipline, @NotNull Tournament tournament) {
        this.id = id;
        this.partnerLeagueNumber = partnerLeagueNumber;
        this.playerLevel = playerLevel;
        this.discipline = discipline;
        this.tournament = tournament;
    }

    public long getId() {
        return id;
    }
    public long getPartnerLeagueNumber() {
        return partnerLeagueNumber;
    }
    public int getPlayerLevel() {
        return playerLevel;
    }
    public Discipline getDiscipline() {
        return discipline;
    }
    public Tournament getTournament() {
        return tournament;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setPartnerLeagueNumber(long partnerLeagueNumber) {
        this.partnerLeagueNumber = partnerLeagueNumber;
    }
    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }
    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

}
