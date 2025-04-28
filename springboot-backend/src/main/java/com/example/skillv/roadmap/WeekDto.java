package com.example.skillv.roadmap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// get the public class 
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeekDto {
    private int weekNumber;
    private String title;
    private String content;
}