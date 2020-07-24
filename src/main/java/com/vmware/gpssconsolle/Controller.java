package com.vmware.gpssconsolle;

import io.grpc.Status;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    GpssWrapper gpssWrapper = null;

    @RequestMapping(value = "/console", method = RequestMethod.GET)
    public ResponseEntity<Object>  getJobs() {

        if (gpssWrapper == null) {
            gpssWrapper = new GpssWrapper("172.16.125.163", 50009);
            gpssWrapper.connectToGrpc();
        }
            String response = gpssWrapper.listJobs("name");

            return ResponseEntity.ok(response);

    }

    @RequestMapping(value = "/console", method = RequestMethod.POST,  params = {"JobName"})
    public ResponseEntity<Object>  createJob(@RequestParam(value="JobName") String JobName) {

        if (gpssWrapper == null) {
            gpssWrapper = new GpssWrapper("172.16.125.163", 50009);
            gpssWrapper.connectToGrpc();
        }
        Boolean success = gpssWrapper.startJob(JobName);

        if(success == true)
            return ResponseEntity.ok("Job " + JobName + " correctly started!");
        else
            return ResponseEntity.ok("Job " + JobName + " not started: Not found or already running");

    }

    @RequestMapping(value = "/console", method = RequestMethod.DELETE,  params = {"JobName"})
    public ResponseEntity<Object>  stopJob(@RequestParam(value="JobName") String JobName) {

        if (gpssWrapper == null) {
            gpssWrapper = new GpssWrapper("172.16.125.163", 50009);
            gpssWrapper.connectToGrpc();
        }
        Boolean success = gpssWrapper.stopJob(JobName);

        if(success == true)
            return ResponseEntity.ok("Job " + JobName + " correctly stopped!");
        else
            return ResponseEntity.ok("Job " + JobName + " not stopped: Not found or already stopped");

    }
}
