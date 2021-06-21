Hello, and welcome to my Sheridan Grade Calculator web program!

This is a program I made in Java using the Netbeans IDE to program and set up the file structure and Apache Tomcat 10 to 
launch the program as a localhost web app. The program is a multi-apge web app coded in Java
in which the user can submit different entries of grades by interacting with the selection menu present
on one of the pages. After a chosen number of grades are selected, the user can then confirm the entries and travel
to a result page that shows the academic standing calculated by the program. The program is based on the academioc guidelines
set forth by Sheridan College. The first page of the program provides a clickable link that will take you to Sheridan's grading
calculations page for more specified details.

Though I am sure there are ways to make use of this file structure without Netbeans and
Apache Tomcat, this is the way I am familiar with and would be happy to answer any questions if you need my help.

In order to get this program running as a web app, I set up a private Apache Tomcat 10 server. To do this:

1. Go to the Apache Tomcat website (or search it on Google) and download the Apache Tomcat 10 installer (.exe option) for your OS. Follow instructions
as specified during the installation process.

2. In Netbeans, right-click Tools ---> Servers ---> Add Server... and type in the corresponding credentials for the fields asked (Server Location, Username, Password)

3. If you get an error saying localhost:8080 is in use, open up your command terminal and use the following commands:

netstat -ano | findstr 8080 -- views the list of all the processes running on the 8080 port with each one represented by an ID number on the very right side
taskkill /F /pid x -- with x representing the corresponding ID number of the process you want to end

---

You may also get another error where the GradesServlet file may throw a RuntimeException (represented by an HTTP 500 Internal Server Error). When using Netbeans, make 
sure you have the nb=javac plugin installed in Netbeans to avoid this happening. To do this, right-click on Tools, go to Plugins, and you should be able to install it there.

Here are some important files for reference:


//-----index.jsp-----//

This is the first page of the Java web program.



//-----courses.jsp-----//

This is the second page of the Java web program. This page refreshes every time a new grade entry is selected and confirmed.


//-----grades.jsp-----//

This is the third and final page of the Java web program that displays the calculated academic standing based on the selected grades.


//-----Grade.java-----//

This is the Java class file that sets up the data structure for each new grade added in the program.


//-----GradesServlet.java-----//

This is the Java class file that sets up the server redirects between the different web pages as needed. Every Java web app needs a servlet file to handle the data
managed and transferred in the web app.


Enjoy!