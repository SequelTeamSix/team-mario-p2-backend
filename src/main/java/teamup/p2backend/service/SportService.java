package teamup.p2backend.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import teamup.p2backend.model.Sport;
import teamup.p2backend.repository.SportRepository;

import java.lang.annotation.*;
import java.util.List;

@Component
public class SportService {

    SportRepository sportRepository;

    public SportService(SportRepository sportRepository){
        this.sportRepository = sportRepository;
    }

    public List<Sport> findAllSports() {
        return sportRepository.findAll();
    }

    public Sport saveSport(Sport sport) {
        return sportRepository.save(sport);
    }

    public void deleteSport(int sport_id) {
        sportRepository.deleteById(sport_id);
    }

    //public Sport findSportByType(String sport_name) {
    //   return sportRepository.findByType(sport_name);
    // }

    public Sport findSportById(int sport_id) {
        return sportRepository.findById(sport_id);
    }

    //update(patch/put) method
}
