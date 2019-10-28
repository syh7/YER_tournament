package YERgen2.demo.DTO;

import YERgen2.demo.model.Discipline;
import YERgen2.demo.model.Game;
import YERgen2.demo.model.Stage;
import YERgen2.demo.model.Team;

import java.time.LocalTime;
import java.util.List;

public class GameDTO {
    private long id;
    private Stage stage;
    private int[][] result;
    private Discipline discipline;
    private LocalTime startTime;
    private LocalTime endTime;
    private String location;
    private String judge;
    private long tournamentId;
    private long[] teamIds;

    public long getId() {
        return id;
    }
    public Stage getStage() {
        return stage;
    }
    public int[][] getResult() {
        return result;
    }
    public Discipline getDiscipline() {
        return discipline;
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public String getLocation() {
        return location;
    }
    public String getJudge() {
        return judge;
    }
    public long getTournamentId() {
        return tournamentId;
    }
    public long[] getTeamIds() {
        return teamIds;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setResult(int[][] result) {
        this.result = result;
    }
    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setJudge(String judge) {
        this.judge = judge;
    }
    public void setTournamentId(long tournamentId) {
        this.tournamentId = tournamentId;
    }
    public void setTeamIds(long[] teamIds) {
        this.teamIds = teamIds;
    }

    public GameDTO(){
        result = new int[3][2];
    }
    public GameDTO(Game game){
        id = game.getId();
        stage = game.getStage();
        result = game.getResult();
        discipline = game.getDiscipline();
        startTime = game.getStartTime();
        endTime = game.getEndTime();
        location = game.getLocation();
        judge = game.getJudge();
        tournamentId = game.getTournament().getId();
        List<Team> teams = game.getTeams();
        teamIds = new long[teams.size()];
        for(int i = 0; i < teams.size(); i++){
            teamIds[i] = teams.get(i).getId();
        }
    }

}