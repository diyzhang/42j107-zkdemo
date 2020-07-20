package cn.toj.consumerdemo.reposity;

import cn.toj.consumerdemo.dao.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "producer-demo")
public interface ConsumerClient {

    @PostMapping("/findByUsername")
    public User getUser(@RequestBody String username);


}
