# Spring Security JWT
1. Create a spring boot application using dependencies:-
	1. web.
	2. Security.

2. create Hello Api and test.It should not be accessable.

3. Create MyUserDetails class to get the user.

4. Create webSecurityConfig class to set the password should not be encrepted.

5. Add JWTUtil class to get the token

6 Add Request and Response Models.

7. update the /authencated API



// steps to implement JWT
1. api creations.(Hello Router)
2. generate and validate the token(Jwt Util)
3. type of request and response (Auth Request and Auth Response)
4. filter to check if the result is loaded(JwtRequest Filter)
5. WebSecurity Config(configer the security)


8. Make /auth api free from spring Security

9. add filter to get the token from the request.

10 run the application on postmen
 1. http://localhost:8080/authenticate
 	header[{"key":"Content-Type","value":"application/json","description":""}]
 	body :-
 	{
	"username":"foo",
	"password":"foo"
}

2. http://localhost:8080/hello
	header:[{"key":"Content-Type","value":"application/json","description":""},{"key":"Authorization","value":"Bearer <Your token>","description":""}]
 	