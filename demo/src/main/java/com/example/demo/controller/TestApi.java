package com.example.demo.controller;

import com.example.demo.business.TestapiBusiness;
import com.example.demo.exception.BaseException;
import com.example.demo.exception.FileException;
import com.example.demo.model.JsonResponse;
import com.example.demo.model.MRegisterResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    public ResponseEntity<String> register(@RequestBody MRegisterResponse mRegisterResponseRequest)  throws BaseException {

            String response = business.register(mRegisterResponseRequest);
            return ResponseEntity.ok(response);


    }

    @PostMapping("/uploadfile")
    public ResponseEntity<String> uploadProfilePicture(@RequestPart MultipartFile file) throws FileException {
        String response =  business.uploadProfilePicture(file);

        return ResponseEntity.ok(response);

    }


}
