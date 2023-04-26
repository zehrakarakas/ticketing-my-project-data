package com.cydeo.repository;

import com.cydeo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TaskRepository extends JpaRepository<Task,Long> {

    //native or jpql query we dont create a delivered query
    //JPQL
    @Query("SELECT COUNT(t) FROM Task t WHERE t.project.projectCode = ?1 AND t.taskStatus<>'COMPLATE'")
    int totalNonCompletedTasks(String projectCode);
    //Native Query
    @Query(value = "SELECT COUNT(*) FROM tasks t JOIN projects p ON t.project_id=p.id WHERE p.project_code=?1 AND t.task_status='COMPLETE'",nativeQuery = true)
    int totalCompletedTasks(String projectCode);

}
