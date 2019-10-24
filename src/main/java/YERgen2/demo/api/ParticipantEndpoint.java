package YERgen2.demo.api;

import YERgen2.demo.DTO.ParticipantDTO;
import YERgen2.demo.controller.AccountService;
import YERgen2.demo.model.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ParticipantEndpoint {

    @Autowired
    private AccountService accountService;

    @PostMapping("/participants")
    public Participant newParticipant(@RequestBody Participant newParticipant) {
        return accountService.saveParticipant(newParticipant);
    }

    @GetMapping(value="/participants")
    public List<ParticipantDTO> getAllParticipants(){
        return (List<ParticipantDTO>) accountService.findAllParticipant();
    }

    @GetMapping(value = "participants/{id}", produces = "application/json")
    public ParticipantDTO getParticipant(@PathVariable long id) {
        return accountService.findParticipantById(id);
    }

    @PutMapping("/participants/{id}")
    public ParticipantDTO updateParticipant(@RequestBody Participant newParticipant, @PathVariable long id) {
        return accountService.updateParticipant(id, newParticipant);
    }

    @DeleteMapping("/participants/{id}")
    public void deleteParticipant(@PathVariable long id) {
        accountService.deleteParticipantById(id);
    }

}
