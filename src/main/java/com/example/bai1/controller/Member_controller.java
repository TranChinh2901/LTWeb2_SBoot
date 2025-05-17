package com.example.bai1.controller;

import com.example.bai1.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@Controller
public class Member_controller {
    List<Member> members = Arrays.asList(
            new Member("Trần Viết Chính",1,21,"chinh99078@donga.edu.vn"),
            new Member("Thái Nguyễn Văn Ngocj",2,21,"Ngoc98400@donga.edu.vn"),
            new Member("Phạm Minh Vũ",3,21,"vu98447@donga.edu.vn"),
            new Member("Ngô Bá Quang", 4, 21,"quang98261@donga.edu.vn")
    );
    @GetMapping("/members")
    public String showMembers(Model model) {
        model.addAttribute("members", members);
        return "show_members";
    }

    @GetMapping("/members/{id}")
    public String showMember(@PathVariable int id, Model model) {
        Member found = members.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
        model.addAttribute("member", found);
        return "detail_member";
    }
}