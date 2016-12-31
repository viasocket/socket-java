#SocketApi Connect - JAVA SDK

This SDK allows you to connect to Socket API blocks from your java app. To start off, follow the following guide:

[![MIT Licence](https://badges.frapsoft.com/os/mit/mit.png?v=103)](https://opensource.org/licenses/mit-license.php)
[![forthebadge](http://forthebadge.com/images/badges/built-by-developers.svg)](http://forthebadge.com)

##Set-up:

First of all, grab latest sdk jar via Maven:

  	<dependency>
    	    <groupId>com.github.viasocket</groupId>
    	    <artifactId>socket-java</artifactId>
    	    <version>-SNAPSHOT</version>
    	</dependency>
Now add the repository to your pom.xml file

    	<repositories>
        		<repository>
        		    <id>jitpack.io</id>
        		    <url>https://jitpack.io</url>
        		</repository>
        	</repositories>


Then, import package in your code:

    import com.sokt.utils.SoktApiConect;
    import com.rapidapi.utils.Argument;
    import java.io.IOException;
    import java.util.HashMap;
    import java.util.Map;

Once imported, the last step is to initialize the SDK with your project name and project API Key:

    SoktApiConect connect = new SoktApiConect("PROJECT_NAME", "API_KEY");

That's all, your SDK is set up! You can now use any block by copying the code snippet from the marketplace.

##Usage:

First of all, we will prepare data, we will use HashMap You can add as many arguments, as api you will call need.

	Map<String, Argument> body = new HashMap<String, Argument>();
    
    body.put("num1", new Argument("data", "11"));
    body.put("num2", new Argument("data","2"));

Note: you should always use "data" key, unless files that will be streamming from you side, then key will be "files".

Than, just copy it's code snippet and paste it in your code.

```
    try{
     Map<String, Object> response = connect.call("flowidentifier", "flowname", body);

	    if(response.get("success") != null){
	    	System.out.println("success: " + response.get("success"));
			System.out.println("invocation_id: " + response.get("invocation_id"));
			System.out.println("response_url: " + response.get("response_url"));
	    }else{
      	System.out.println("error: " + response.get("error"));
      }
    }catch(Exception e){
	    	System.out.println("Error: " + e);
    }
    
```

The printed result will be:

```
  success: success
  invocation_id : flow invocation id
  response_url : response_url


```

**Notice** that the `error` event will also be called if you make an invalid  call (for example - the auth key is invalid).

