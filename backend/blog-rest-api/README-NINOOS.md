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

![](C:\Users\ninoo\OneDrive\Desktop\images\authentication-manager.png)
<p>it will matches (username and password) That came from a client with  (username and password) from the Database</p>



<span style="color:#9932CC">2- configure(HttpSecurity http).</span>
<p>it will secure the URI and give specific permission for USER or ADMIN</p>




**<span style="color:#8B008B">csrf()</span>**
![](C:\Users\ninoo\OneDrive\Desktop\images\csrf.png)

<p>
we disable cross site request forgery(csrf) to allow a client
to access to server
</p>


# Create User and Authorities entity
![](C:\Users\ninoo\OneDrive\Desktop\images\aa.png)
![](C:\Users\ninoo\OneDrive\Desktop\images\bb.png)


