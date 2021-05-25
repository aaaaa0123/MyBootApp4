package jp.te4a.spring.boot.myapp5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

	@RequestMapping("/")
	public String index(Model model) {
        //return "this is Spring Boot sample.";
    	model.addAttribute("msg", "this is a setting message");
    	return "index";
    }
	
    @RequestMapping(value="/post",method=RequestMethod.POST)
    public ModelAndView postForm(@RequstParam("text1")String text1) {
      ModelAndView mv = new ModelAndView("index");
      mv.addObject("msg","you write'" + text1 +"'!!!");
      return mv;
    }
    
    
}