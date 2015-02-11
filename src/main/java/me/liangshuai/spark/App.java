package me.liangshuai.spark;
import static spark.Spark.get;
import static spark.SparkBase.port;
import static spark.Spark.staticFileLocation;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	port(80);
    	staticFileLocation("/public");
    	get("/", (req, res) -> {
    		Map<String,Object> attributes = new HashMap<>();
    		attributes.put("message", "Spark World");
    		attributes.put("templateName", "index.vm");
    		return new ModelAndView(attributes, "layout.vm");
    	},new VelocityTemplateEngine());
    	
    }
}
