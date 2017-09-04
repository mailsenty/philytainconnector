package org.mule.modules.philytrain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.philytrain.config.ConnectorConfig;

@Connector(name="phily-train", friendlyName="PhilyTrain")
public class PhilyTrainConnector {

	 @Config
	    ConnectorConfig config;

	private final String FINDBYNO  = "https://www.septastats.com/api/current/train/";
		
		private  URL url;


		HttpURLConnection con ;
		
		   

	    @Processor
	    public String findbyTrainNo(String trainNo) {
	        String response;
	    	try {
	    		url  = new URL(FINDBYNO+trainNo);
				response=processConnection(url);
			} catch (MalformedURLException e) {
				response="Error connecting to endpoint Please retry";
				e.printStackTrace();
			}
	    	catch (Exception e) {
	    		response="Error connecting to endpoint Please retry" ;  				
				e.printStackTrace();
			}
	    	return response;
	  

	    }
	    
	    public ConnectorConfig getConfig() {
	        return config;
	    }

	    public void setConfig(ConnectorConfig config) {
	        this.config = config;
	    }
	   
	    private String processConnection(URL url){
	    	
	    	StringBuffer response = new StringBuffer();
	    	
	    	try {
				con = (HttpURLConnection) url.openConnection();
				
				con.setRequestMethod("GET");

				// add request header
				int responseCode = con.getResponseCode();
				System.out.println("\nSending 'GET' request to URL : " + url);
				System.out.println("Response Code : " + responseCode);

				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();
			}  catch (Exception e) {
				response=new StringBuffer("Error getting Train Info");
				e.printStackTrace();
			}

			// print result
			return response.toString();
	    }

}