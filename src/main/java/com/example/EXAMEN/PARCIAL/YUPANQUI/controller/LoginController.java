/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EXAMEN.PARCIAL.YUPANQUI.controller;

import org.springframework.ui.Model; // Correcto import de Model de Spring
import com.example.EXAMEN.PARCIAL.YUPANQUI.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    // Página de login
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    // Verificación de login
    @PostMapping("/login")
    public String checkLogin(User user, Model model) {
        // Validar usuario y contraseña
        if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {
            return "success";  // Redirigir a la página de éxito
        } else {
            model.addAttribute("error", "Credenciales incorrectas");
            return "login";  // Redirigir a la página de login con error
        }
    }
}
