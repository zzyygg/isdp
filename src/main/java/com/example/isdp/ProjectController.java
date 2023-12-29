package com.example.isdp;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProjectController {

    @PostMapping("/test")
    @ProjectNumber
    public ResponseEntity<Map<String, Object>> test(@RequestParam(value = "projectNumber", required = false)
                                        String projectNumber) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("projectNumber", projectNumber);
        return ResponseEntity.ok().body(map);
    }
}
