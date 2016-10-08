package com.ubr.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public class JaxRsTest {
    @GET
    @Path("/test")
    public Response getMsg() {
//        @RequestParam("param") String msg
//        String output = "Jersey say : " + msg;

        return Response.status(200).entity("lallalalala").build();

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
