package com.sbaldasso.library_store.controller;

import com.sbaldasso.library_store.dto.LoanHistoryDTO;
import com.sbaldasso.library_store.service.LoanHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/loanHistory")
public class LoanHistoryController {

    @Autowired
    private LoanHistoryService loanHistoryService;

    @GetMapping("/book/{bookId}")
    public ResponseEntity<List<LoanHistoryDTO>> getLoanHistoryByBook(@PathVariable Long bookId) throws Exception {
        List<LoanHistoryDTO> history = loanHistoryService.findLoanHistoryByBookId(bookId);
        return ResponseEntity.ok(history);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<LoanHistoryDTO>> getLoanHistoryByUser(@PathVariable Long userId) throws Exception {
        List<LoanHistoryDTO> history = loanHistoryService.findLoanHistoryByUserId(userId);
        return ResponseEntity.ok(history);
    }
}
