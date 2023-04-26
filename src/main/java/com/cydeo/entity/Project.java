package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="projects")
@Where(clause="is_deleted=false")
public class Project extends BaseEntity{

    @Column(unique = true)
    private String projectCode;
    private String projectName;
    @Column(columnDefinition = "DATE")
    private LocalDate startDate;
    @Column(columnDefinition = "DATE")
    private LocalDate endDate;
    @Enumerated(EnumType.STRING)
    private Status projectStatus;

    private String projectDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="manager_id")
    private User assignedManager;


}
