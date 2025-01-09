package vttp_batchb_paf.day21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp_batchb_paf.day21.model.Room;
import vttp_batchb_paf.day21.repository.RoomRepository;

@Service
public class RoomService {
    
    @Autowired
    private RoomRepository roomRepo;

    public List<Room> getAllRooms(){
        return roomRepo.getRooms();
    }
}
