package com.sankarshan.backend;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction
{
    private Long id;
    private LocalDate date;
    private String description;
    private double amount ;
    private String category;
    

}