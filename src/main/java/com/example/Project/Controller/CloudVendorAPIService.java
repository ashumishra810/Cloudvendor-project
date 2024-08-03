package com.example.Project.Controller;


import com.example.Project.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendotDetails(String vendorId) {

        return cloudVendor;

//                new CloudVendor("C1","Vendor 1",
//                "Address one","xxxxxx");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor Created Successfully";

    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor Update Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String DeleteCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = null;
        return "Cloud vendor Deleted Successfully";
    }
}