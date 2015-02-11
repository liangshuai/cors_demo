package me.liangshuai.spark;
import static spark.Spark.post;
import static spark.SparkBase.port;
/**
 * Hello world!
 *
 */
public class CorsServer 
{
    public static void main( String[] args )
    {
        port(8080);
        post("/cors", (req, res) -> {
        	res.header("Access-Control-Allow-Origin", "*");
        	return "Response from cross domain";
        });
        
    }
}