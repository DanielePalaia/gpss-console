package com.vmware.gpssconsolle;

import io.grpc.Status;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import java.io.*;
import java.util.*;

@RestController
public class Controller {

    GpssWrapper gpssWrapper = null;

    @RequestMapping(value = "/console", method = RequestMethod.PUT,  params = {"JobName"})
    public ResponseEntity<Object>  submitJob(@RequestParam(value="JobName") String JobName, @RequestParam(value="YamlFilePath") String YamlFilePath) {


        buildGpssInstance();
        String success = gpssWrapper.submitJob(YamlFilePath, JobName);

        if(success == "")
            return ResponseEntity.ok("Job " + JobName + " correctly submitted!");
        else
            return ResponseEntity.ok("Job " + JobName + " Not correctlu submitted \n" + success);

    }



    @RequestMapping(value = "/console", method = RequestMethod.GET)
    public ResponseEntity<Object>  getJobs() {


        buildGpssInstance();
        String response = gpssWrapper.listJobs("name");

        return ResponseEntity.ok(response);

    }

    @RequestMapping(value = "/console", method = RequestMethod.POST,  params = {"JobName"})
    public ResponseEntity<Object>  startJob(@RequestParam(value="JobName") String JobName) {

        buildGpssInstance();
        String success = gpssWrapper.startJob(JobName);

        if(success == "")
            return ResponseEntity.ok("Job " + JobName + " correctly started!");
        else
            return ResponseEntity.ok("Job " + JobName + " not correctly started \n" + success);

    }

    @RequestMapping(value = "/console", method = RequestMethod.PATCH,  params = {"JobName"})
    public ResponseEntity<Object>  stopJob(@RequestParam(value="JobName") String JobName) {

        buildGpssInstance();
        String success = gpssWrapper.stopJob(JobName);

        if(success == "")
            return ResponseEntity.ok("Job " + JobName + " correctly stopped!");
        else
            return ResponseEntity.ok("Job " + JobName + " not correctly stopped\n" + success);

    }

    @RequestMapping(value = "/console", method = RequestMethod.DELETE,  params = {"JobName"})
    public ResponseEntity<Object>  deleteJob(@RequestParam(value="JobName") String JobName) {

        buildGpssInstance();
        String success = gpssWrapper.deleteJob(JobName);

        if(success == "")
            return ResponseEntity.ok("Job " + JobName + " correctly stopped!");
        else
            return ResponseEntity.ok("Job " + JobName + " not correcty deleted: \n" + success);

    }

    private void buildGpssInstance()   {
        if (gpssWrapper == null) {
            FileInputStream in;
            Properties gpssProperties = new Properties();

            try {
                in = new FileInputStream("./properties.ini");
                gpssProperties.load(in);
            }
            catch(Exception e)    {
                e.printStackTrace();
            }
            gpssWrapper = new GpssWrapper(gpssProperties.getProperty("gpssHost"), Integer.parseInt(gpssProperties.getProperty("gpssPort")));
            gpssWrapper.connectToGrpc();
        }


    }
}
