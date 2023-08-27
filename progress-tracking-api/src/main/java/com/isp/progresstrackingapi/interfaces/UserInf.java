package com.isp.progresstrackingapi.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

@FeignClient("USER-MANAGEMENT-API")
public interface UserInf {

	//@GetMapping("/r/insert")
    //public ResponseEntity<Patient> refmethod (Patient p) ;

}
