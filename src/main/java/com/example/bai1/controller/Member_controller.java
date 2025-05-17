package com.example.bai1.controller;

import com.example.bai1.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class Member_controller {
    @GetMapping("/members")
    public String showMembers(Model model) {
        List<Member> members = Arrays.asList(
                new Member("Trần Viết Chính"),
                new Member("Thái Nguyễn Văn Ngọc "),
                new Member("Ngô Bá Quang"),
                new Member("Phạm Minh Vũ")
        );
        model.addAttribute("members", members);
        return "show_members"; // Trả về file templates/printMember.html
    }
}
