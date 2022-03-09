package indi.com.pconf;

import indi.com.pconf.service.IPConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config/")
public class PConfigController {
    @Autowired
    IPConfigService configService;

    @GetMapping("try-to-get-value/{path}")
    public String tryToGetValue(@PathVariable("path") String path) {
        return configService.tryToGetValue(path);
    }
}
