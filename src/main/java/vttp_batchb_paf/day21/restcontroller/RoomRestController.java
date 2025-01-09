package vttp_batchb_paf.day21.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vttp_batchb_paf.day21.model.Room;
import vttp_batchb_paf.day21.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
    
    @Autowired
    private RoomService roomSvc;

    @GetMapping
    public ResponseEntity<List<Room>> getAllRooms(){
        List<Room> rooms = roomSvc.getAllRooms();
        
        return ResponseEntity.ok(rooms);
    }
}
