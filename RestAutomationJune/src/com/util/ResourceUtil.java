package com.util;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;

public class ResourceUtil {

	
	public static <X>X retrieveResource(HttpResponse response,Class<X> cl){
		{
			String json;
			
			try {
				json = EntityUtils.toString(response.getEntity());
				
				ObjectMapper mapper = new ObjectMapper();
				
				return mapper.readValue(json, cl);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
		}
		
		
	}
}
