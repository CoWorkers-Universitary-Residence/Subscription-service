package com.example.subscriptionservice.domain.model.entity;


import com.example.subscriptionservice.domain.model.enums.Type;
import com.example.subscriptionservice.shared.domain.AuditModel;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.xml.transform.Source;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@With
@Entity
@Table(name = "subscriptions")
@Inheritance(strategy = InheritanceType.JOINED)
public class Subscription extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    private Type type;

    @NotNull
    private Date start_date;

    @NotNull
    private Date finish_date;

    @NotNull
    private Long price;
}
