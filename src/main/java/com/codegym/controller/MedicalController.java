package com.codegym.controller;

import com.codegym.model.MedicalDeclaration;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/medical")
public class MedicalController {

    private static MedicalDeclaration savedDeclaration = new MedicalDeclaration();

    private void prepareFormData(Model model) {
        List<Integer> years = new ArrayList<>();
        for (int i = 1900; i <= 2024; i++) years.add(i);
        model.addAttribute("years", years);
        model.addAttribute("genders", new String[]{"Nam", "Nữ", "Khác"});
        model.addAttribute("nationalities", new String[]{"Việt Nam", "Trung Quốc", "Mỹ", "Nhật Bản", "Hàn Quốc"});
        model.addAttribute("travelTypes", new String[]{"Tàu bay", "Tàu thuyền", "Ô tô", "Khác (Ghi rõ)"});
        model.addAttribute("provinces", new String[]{"Hà Nội", "TP. Hồ Chí Minh", "Đà Nẵng", "Hải Phòng"});
        model.addAttribute("districts", new String[]{"Quận Ba Đình", "Quận Cầu Giấy", "Quận 1", "Quận Hải Châu"});
        model.addAttribute("wards", new String[]{"Phường Cống Vị", "Phường Dịch Vọng", "Phường Bến Nghé"});
    }

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("declaration", savedDeclaration);
        prepareFormData(model);
        return "medical-form";
    }

    @PostMapping("/save")
    public String saveDeclaration(
            @Valid @ModelAttribute("declaration") MedicalDeclaration declaration,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            prepareFormData(model);
            return "medical-form";
        }

        savedDeclaration = declaration;
        return "redirect:/medical/info";
    }

    @GetMapping("/info")
    public String showInfo(Model model) {
        model.addAttribute("declaration", savedDeclaration);
        return "medical-info";
    }
}