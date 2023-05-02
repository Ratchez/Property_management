package com.mycompany.controller;

import com.mycompany.dto.CalculatorDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")//class level mapping of url to a controller class
public class CalculatorController {
   @GetMapping("/add/{num3}")//method level mapping of a url to a controller function
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2, @RequestParam("num3") Double num3){
        return num1 + num2;
    }

    @GetMapping("/sub/{num1}/{num2}")//Map the values of url to java variables by path variable method
    public Double substract(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2){
       Double result = null;
       if(num1 > num2){
           result = num1 - num2;
       }else{
           result = num2 - num1;
       }
       return result;
    }

    @PostMapping("/mul")
    public Double multiply(@RequestBody CalculatorDTO calculatorDTO){
       Double result = null;
       result = calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3() * calculatorDTO.getNum4();
       return result;
    }
}
