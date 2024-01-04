package com.Vendor.restdemo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIServices {
	
	CloudVendor cloudVendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudDetails(String vendorID) {
		
		return cloudVendor;
	}
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor=cloudVendor;
		return "Cloud Vendor Created Successfully";
		 
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor=cloudVendor;
		return "Cloud Vendor updated Successfully";
		 
	}
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId)
	{
		this.cloudVendor=null;
		return "Cloud Vendor deleted Successfully";
		 
	}
	

}
