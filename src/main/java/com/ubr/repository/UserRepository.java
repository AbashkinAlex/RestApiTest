package com.ubr.repository;

import com.ubr.demo.HelloWorld;
import com.ubr.demo.NashornDemo;
import com.ubr.model.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

@Path("/hello")
public class UserRepository {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Jersey say : " + msg;

        return Response.status(200).entity(output).build();

    }



//    @GET
//    @Produces("text/html")
//    public String getUser() throws Exception {
//        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
//        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");
//
////        if (scriptEngine == null) {
////        throw new Exception("No Nashorn!");
////    }
//
//        InputStream scriptFile = NashornDemo.class.getResourceAsStream("/js/helloWorld.js");
//
////        if (scriptFile == null) {
////        throw new Exception("No Script File!");
////    }
//
//        HelloWorld helloWorld = (HelloWorld) scriptEngine.eval(new InputStreamReader(scriptFile));
//        String hello = helloWorld.sayHello("Nashorn");
//        return hello;
//    }

}


//@RepositoryRestResource(collectionResourceRel = "admin", path = "admins")
//public interface UserRepository extends PagingAndSortingRepository<Admin, Long>{
//
//    List<Admin> findByName(@Param("name") String name);
//
//    @Query("SELECT a.name from Admin a where a.id = :id")
//    Admin findNameById(@Param("id") Long id);
//
//
//}
