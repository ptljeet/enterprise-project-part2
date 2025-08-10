package com.example.demo.controller;

import com.example.demo.dto.OrderDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/market")
public class MarketController {
    @PostMapping("/execute")
    public String execute(@Valid @RequestBody OrderDTO order){
        return "EXECUTED " + order.getOrderType() + " " + order.getQuantity() + " of " + order.getTickerSymbol();
    }
}
