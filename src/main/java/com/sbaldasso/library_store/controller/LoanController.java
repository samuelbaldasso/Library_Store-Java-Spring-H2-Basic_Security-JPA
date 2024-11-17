package com.sbaldasso.library_store.controller;

import com.sbaldasso.library_store.dto.LoanDTO;
import com.sbaldasso.library_store.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public ResponseEntity<LoanDTO> createLoan(@RequestBody LoanDTO loanDTO) throws Exception {
        LoanDTO newLoan = loanService.loanBook(loanDTO);
        return ResponseEntity.ok(newLoan);
    }

    @PutMapping("/{loanId}/return")
    public ResponseEntity<LoanDTO> returnBook(@PathVariable Long loanId) throws Exception {
        LoanDTO returnedLoan = loanService.returnBook(loanId);
        return ResponseEntity.ok(returnedLoan);
    }

    @GetMapping
    public ResponseEntity<List<LoanDTO>> returnBooks() throws Exception {
        List<LoanDTO> returnedLoan = loanService.getAllLoans();
        return ResponseEntity.ok(returnedLoan);
    }

}
