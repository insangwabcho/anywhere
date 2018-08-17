package com.anywhere.anywhere.insang.models.dao.manager;

import com.anywhere.anywhere.insang.models.dto.api.DayScheduleDTO;
import com.anywhere.anywhere.insang.models.dto.api.ObjectDTO;

import java.util.List;

public class ScheduleManager {

    private List<ObjectDTO> schedule;

    public ScheduleManager(ObjectDTO day){
        schedule= (List<ObjectDTO>) day;
    }

    public void insertSchedule(ObjectDTO dto, int sort) {
        schedule.add(dto);
    }

    public void removeSchedule(ObjectDTO dto) {
//        schedule.remove(dto);
    }

    public ObjectDTO getSchedule(int sort){
//        return schedule.get(sort);
        return null;
    }

}
