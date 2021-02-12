# vidyadisha-core
This Repository contains the core backend layer for the Vidyadisha Application

Start the project using **gradle bootRun**

# This Project Currently has 2 end points

**Health Check** - This will return OK if the application is working
http://localhost:8080/healthCheck

**Check User** - Check if the User is valid, currently admin is set a valid user
http://localhost:8080/checkUser/{user} 

Sample working -> http://localhost:8080/checkUser/admin


# This Project has been deployed to heroku cloud can be accessed directly via the end point

**Check User** - Check if the User is valid, currently admin is set a valid user
https://vidyadisha.herokuapp.com/checkUser/admin

**Login** - Performs a login returns 200 Success for a valid login, 403 Forbidden for failure
https://vidyadisha.herokuapp.com/login/admin/password
