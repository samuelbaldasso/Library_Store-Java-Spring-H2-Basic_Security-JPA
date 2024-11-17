package com.sbaldasso.library_store.dto;

import com.sbaldasso.library_store.domain.LoanStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoanDTO {
    private Long id;
    private Long bookId;
    private Long userId;
    private LocalDate startDate;
    private LocalDate endDate;
    private LoanStatus status;
}
