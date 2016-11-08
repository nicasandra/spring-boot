package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Request;

/**
 * Created by nicasandra on 11/8/2016.
 */
@Controller
@RequestMapping("/posts")
public class PostController {

    @RequestMapping(value="", method = RequestMethod.GET)
    public String listPosts(Model model){
        return "posts/list";
    }
}
