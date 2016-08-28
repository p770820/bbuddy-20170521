package com.odde.bbuddy.budget.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "monthly_budgets")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class MonthlyBudget {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    @DateTimeFormat(pattern = "yyyy-MM")
    private Date month;

    @NonNull
    private Integer budget;
}
