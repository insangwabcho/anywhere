package com.anywhere.anywhere.insang.models.dao.manager;

import com.anywhere.anywhere.insang.models.dto.api.ObjectDTO;

import java.util.List;

public class DayScheduleManager {

    private List<ObjectDTO> daySchedule;

    public DayScheduleManager(List<ObjectDTO> daySchedule) {
        this.daySchedule = daySchedule;
    }

    public void insertSchedule(ObjectDTO dto) {
        daySchedule.add(dto);
    }

    public void removeSchedule(ObjectDTO dto) {
        daySchedule.remove(dto);
    }

    public ObjectDTO getSchedule(int sort){
        return daySchedule.get(sort);
    }

}
