
package com.practica01.controller;

import com.practica01.domain.Estado;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author joses
 */
@Controller
@Slf4j
public class IndexController {
    
    
    @GetMapping("/")
    public String inicio(Model model){
        Estado estado = new Estado("Peru", 3500000, "Si", "Lima","Sol");
        model.addAttribute("estado",estado);
        return "index";
    }
}
