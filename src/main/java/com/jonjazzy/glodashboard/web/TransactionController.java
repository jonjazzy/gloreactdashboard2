package com.jonjazzy.glodashboard.web;


import com.jonjazzy.glodashboard.model.R1TransactionDAO;
import com.jonjazzy.glodashboard.model.R1TransactionDAORepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
public class TransactionController
{
    private final Logger log = LoggerFactory.getLogger(TransactionController.class);
    private R1TransactionDAORepository r1TransactionDAORepository;

    public TransactionController(R1TransactionDAORepository r1TransactionDAORepository)
    {
        this.r1TransactionDAORepository = r1TransactionDAORepository;
    }

    @GetMapping("/r1transactions")
    Collection<R1TransactionDAO> getAllR1Transactions() {
        return r1TransactionDAORepository.findAll();
    }

    @GetMapping("/r1transactions/{id}")
    ResponseEntity<?> getR1TransactionById(@PathVariable Integer id) {
        Optional<R1TransactionDAO> group = r1TransactionDAORepository.findById(id);
        return group.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/r1transactions/r1/{requestreference}")
    ResponseEntity<?> getR1TransactionByRef(@PathVariable String requestreference) {
        Optional<R1TransactionDAO> group = r1TransactionDAORepository.findByR1ref(requestreference);
        return group.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
