# Spring Security

<h2 style="color:#8B008B">Add security dependency</h2>
when you add security dependency on a project it will secure all the paths(URI)
<pre>
    <span><</span>dependency>
      <span><</span>groupId>org.springframework.boot<span><</span>/groupId>
      <span><</span>artifactId>spring-boot-starter-security<span><</span>/artifactId>
    <span><</span>/dependency>
</pre>


<h2 style="color:#8B008B">WebSecurityConfigurerAdapter</h2>
it's a class that has methods used for security, the important two methods are:<br/>


<span style="color:#9932CC">1- configure(AuthenticationManagerBuilder auth).</span>
![](images\authentication-manager.png)

<p>it will matches (username and password) That came from a client with  (username and password) from the Database</p>



<span style="color:#9932CC">2- configure(HttpSecurity http).</span>
<p>it will secure the URI and give specific permission for USER or ADMIN</p>




**<span style="color:#8B008B">csrf()</span>**
![](images\csrf.png)

<p>
we disable cross site request forgery(csrf) to allow a client
to access to server
</p>


# Create User and Authorities entity
![](images\aa.png)
![](bb.png)


<h3>create UserRepository</h3>
<span>and</span>
<h3>AuthoritiesRepository</h3>


# Authentication Manager

![](images\springsecurity.png)

<h3>DaoAuthenticationProvider</h3>
<span>it does two things : </span> <br/>
1- encode a password in the database.<br/>
2- retrieve a data from the database by having a service.

<br/>


