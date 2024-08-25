package com.harsh.rps.settling_scores;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
public class bfController {
    @GetMapping("/bfhl")
    public Map<String,Integer> getData(){
        Map<String, Integer> response = new HashMap<>();
        response.put("operation_code", 1);
        return response;
    }

    @PostMapping("/bfhl")
    public ResponseDTO processData(@RequestBody RequestDTO request) {
        ResponseDTO response = new ResponseDTO();

        List<String> data = request.getData();
        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();

        // Separate numbers and alphabets
        for (String item : data) {
            if (item.matches("\\d+")) {
                numbers.add(item);
            } else if (item.matches("[a-zA-Z]")) {
                alphabets.add(item);
            }
        }

        // Find the highest lowercase alphabet
        String highestLowercase = alphabets.stream()
                .filter(s -> s.matches("[a-z]"))
                .max(Comparator.naturalOrder())
                .orElse("");

        // Set response fields
        response.setIs_success(true);
        response.setUser_id("harsh_sahu_04052003");
        response.setEmail("harsh.sahu2021@vitbhopal.ac.in");
        response.setRoll_number("21BSA10129");
        response.setNumbers(numbers);
        response.setAlphabets(alphabets);
        response.setHighest_lowercase_alphabet(highestLowercase);

        return response;
    }
}
