/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isd.room.booking;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author user
 */
public class Booking {
    static int req_id = 1;
    String room_id;
    String uid;
    String date;
    String from_time;
    String to_time;

    public Booking(String room_id, String uid, String date, String from_time, String to_time) {
        this.room_id = room_id;
        this.uid = uid;
        this.date = date;
        this.from_time = from_time;
        this.to_time = to_time;
    }
    public int getReq_id() {
        return req_id;
    }
}
