package com.cydeo.service;

import com.cydeo.dto.TaskDTO;

import java.util.List;

public interface TaskService {

    List<TaskDTO> listAllTasks(); //serviste hep dto kullanilir entity degil
    void save(TaskDTO dto);

    void update(TaskDTO dto);

    void delete(Long id);//unique oldugu icin id kullandik

    TaskDTO findById(Long id);
    int totalNonCompletedTask(String projectCode);

    int totalCompletedTask(String projectCode);


}
