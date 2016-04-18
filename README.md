#livecoding.tv Java API
This is an unofficial wrapper for the livecoding.tv REST api. This was created to potentially aid developers that are working towards the app creation competition which will end on May 15th, 2016. 

##Notes##
* As of right now (4.17.16) the API is using a "hack" to log into livecoding.tv by sending the requests necessary to get the session cookies. However, there are parts of the API that cannot be interfaced with, without access to the API. Therefore, parts of the API are missing currently and will be implemented in the future.
* As stated above, because this is working on a hack, when I receive API access, I will need to rewrite the login system to pass all the OAuth data


##Crash Course##
So I imagine that people looking at this section want to use the API now, in it's sadden state. The basic principles that you will need to follow are detailed below...

When interfacing with the API, you will need to (for now) use the `LoginHack` class to get the session cookies. The function `getSessionCookies` will take your username and password respectively (plain-text)

	String sessionCookie = LoginHack.getSessionCookies(args[0], args[1]);
    Livecoding api = new Livecoding(sessionCookie);

To make requests with the API you can look at the various tests which contain some of the basic stuff on interfacing with the implemented parts of the **public** API. The basic idea is as follows.

	api.request(RequestType, HashMap<String, String>);

You will send your API object the request function with the parameters of the type of request you want to make and then the arguments associated with that request. The arguments that you can pass to each request type can be found in the API documentation and then applied to this wrapper with the same naming convention. An example of sending arguments along with processing the request to a class

	HashMap<String, String> arg = new HashMap<String, String>();
    arg.put("limit", "10"); //how much data you want back
    arg.put("offset", "0"); //offset the return results
    Livestreams languages = (Livestreams) api.request(RequestType.LIVESTREAMS, arg);

Easiest way to decipher all the available classes is to go through the test cases. Each class has its own test case. Please put an issue asking for more detailed explanations on anything that I made weird.

**NOTE**: One big thing that will be done either soon or at the end of interfacing with the public API is writing a series of helper functions that will make it easier to send your requests with all the necessary arguments given in a function form. Example of what I'm describing if my words are convoluted or hard to follow.

	RequestHelper.Livestream.requestLivestreams(limit, offset)