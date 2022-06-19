package com.example.demo.controller;

import com.example.demo.business.TestapiBusiness;
import com.example.demo.exception.BaseException;
import com.example.demo.exception.UserException;
import com.example.demo.model.JsonResponse;
import com.example.demo.model.MRegister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/testapi")
public class TestApi {

    //1field injection
//    @Autowired
//    public TestapiBusiness business;
    //2 Constructor injection
    private final TestapiBusiness business;

    public TestApi(TestapiBusiness business) {
        this.business = business;
    }


    @GetMapping("/view")
    public JsonResponse viewData() {
        JsonResponse response = new JsonResponse();
        //set data init
        response.setName("aom");
        response.setFood("padthai");
        return response;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody MRegister mRegisterRequest)  throws BaseException {

            String response = business.register(mRegisterRequest);
            return ResponseEntity.ok(response);


    }


}
