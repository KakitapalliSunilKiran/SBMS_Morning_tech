//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.service.AccountService;
//
//@RestController
//@RequestMapping("/api1")
//public class AccountController {
//	
//
//    @Autowired
//    private AccountService accountService;
//
//    @PostMapping("/transact/save")
//    public String save() {
//        accountService.saveAccounts();
//        return "Saved Successfully";
//    }
////    
////    @GetMapping("/admin/getmsg")
////    public String getMessage() {
////    	return "Happy New Year";
////    }
////    
////    @GetMapping("user/getmsg")
////    public String getMessage1() {
////    	return "Happy Christmas";
////    }
//
//
//}
