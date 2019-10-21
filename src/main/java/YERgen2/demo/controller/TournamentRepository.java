package YERgen2.demo.controller;

import YERgen2.demo.model.Tournament;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TournamentRepository extends CrudRepository<Tournament, Long> {
}