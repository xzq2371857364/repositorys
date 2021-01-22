package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;
import service.Impl.ServiceImpl;
import service.Service;

@Controller
public class UserController {
    @Autowired
    private Service service;
    //显示所有的数据
    @RequestMapping("list")
    public String findAll(Model model){
        model.addAttribute("user",service.findAll());
        return "list";
    }

    @RequestMapping("toadd")
    public String toadd(){
        return "add";
    }
    //添加
    @RequestMapping("add")
    public String add(User user){

        service.add(user);
        return "redirect:list.action";
    }

    @RequestMapping("toedit")
    public String toedit(User user,Model model){
        User user1 = service.findById(user.getId());
        model.addAttribute("user",user1);
        return "edit";
    }

    @RequestMapping("edit")
    public String edit(User user){
        service.edit(user);
        return "redirect:list.action";
    }

    @RequestMapping("delete")
    public String delete(User user){

        service.delete(user.getId());
        return "redirect:list.action";
    }
}
