package vttp_batchb_paf.day21.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import vttp_batchb_paf.day21.model.Room;
import vttp_batchb_paf.day21.utils.sql;

@Repository
public class RoomRepository {

    @Autowired
    JdbcTemplate template;

    // paf day21 - slide 26 / 27
    public List<Room> getRooms(){

        List<Room> rooms = new ArrayList<>();

        SqlRowSet sqlRowSet = template.queryForRowSet(sql.sql_getAllRooms);
        while (sqlRowSet.next()){
            Room room = new Room(sqlRowSet.getInt("id"), 
                        sqlRowSet.getString("roomtype"),
                        sqlRowSet.getFloat("price"));
            rooms.add(room);
        }
        return rooms;
    }

}
