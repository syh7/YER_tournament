package YERgen2.demo.model;

import javax.persistence.*;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int playerLevel;
    private Discipline discipline;
    @ManyToOne
    private Game game;
    @ManyToOne
    private Tournament tournament;

    public long getId(){
        return id;
    }
    public int getPlayerLevel() {
        return playerLevel;
    }
    public Discipline getDiscipline() {
        return discipline;
    }
    public Game getGame() {
        return game;
    }
    public Tournament getTournament() {
        return tournament;
    }

    public void setId(long id){
        this.id = id;
    }
    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }
    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
    public void setGame(Game game) {
        this.game = game;
    }
    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

}
