package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "tasks")
@NoArgsConstructor
@Where(clause = "is_deleted=false")
public class Task extends BaseEntity{

    private String taskSubject;
    private String taskDetail;
    @Enumerated(value = EnumType.STRING)
    private Status taskStatus;
    @Column(columnDefinition = "DATE")
    private LocalDate assignedDate;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="assigned_employee_id")
    private User assignedEmployee;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="project_id")
    private Project project;
}
