package pl.restful;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Path("/users")
public class UserController {
	
	@Path("all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getUsers() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		
		return mapper.writeValueAsString(UserDAO.getUsers());
	}
 
}
