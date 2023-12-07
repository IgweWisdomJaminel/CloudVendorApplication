package com.cloud.cloudvendor.Controller;


import com.cloud.cloudvendor.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorApiService {

    CloudVendor cloudVendor;
     @GetMapping("{vendorId}")
    public CloudVendor cloudVendor(String Vendorid){


         //new CloudVendor("c1","vendorOne","NO 1 vendor road","07089832337");
        return cloudVendor;

    }
    @PostMapping
    public String createVendorObject(@RequestBody CloudVendor cloudVendor){
         this.cloudVendor=cloudVendor;
         return "The Object has been saved";

    }

    @PutMapping
    public String updateVendorObject(@RequestBody CloudVendor cloudVendor){
         this.cloudVendor=cloudVendor;
         return "The Object has been Updated";

    }  @DeleteMapping("{vendorId}")
    public String DeleteVendorObject( CloudVendor cloudVendor){
         this.cloudVendor=null;
         return "The Object has been Deleted";

    }
}
