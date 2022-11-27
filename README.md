# Software_Testing_Project
This Repository consists the client side testing code as part of the Software Testing projectwork.<br>
The source code on which testing is carried out in this repo is the **_eVoting System_** developed by Chetan Kandpal , Sarthak Dandriyal and Shubham Verma of IIITB as part of their Software Production Engineering Coursework at IIITB.<br>
The source code repositories are - https://github.com/SarthakDandriyal/evoting_backend.git and https://github.com/chetankandpal/evoting_frontend.git
<br>
This Software Testing project is a group project by Chetan Kandpal (MT2021035) and Sarthak Dandriyal (MT2021119) of IIITB.<br>
The testing code was developed using Selenium .<br>
We have tried to automate the client side testing process.<br>
The project was divided into 2 parts . Sarthak Dandriyal worked on designing test cases that bypass client-side validation and Chetan Kandpal worked on  sending changed/corrupt input to the server.  

The login process of the webapp is comprised of 2 factor authentication .<br>
The authentication is a knowledge based authentication followed by an OTP based authentication.

![Screenshot 2022-11-27 at 11 37 47 PM](https://user-images.githubusercontent.com/22930165/204152292-7901474b-b691-41ee-83db-21cbdf685956.png)

![Screenshot 2022-11-27 at 11 39 04 PM](https://user-images.githubusercontent.com/22930165/204152340-176f44f1-3b70-4583-a85a-66fb68649535.png)

The login page expects the person to enter voterid and email.

Firstly a testcase was generated with "User1" as the username and "12345" as the password . This test could not pass the valid email constraint. 
![Screenshot 2022-11-28 at 12 20 52 AM](https://user-images.githubusercontent.com/22930165/204154064-08d98f83-ca10-49b8-97e4-b3462d50ba78.png)
The prompt asks for a '@' in the email section .

Secondly a testcase was generated with "User1" as the username and "12345@" as the password . This test could not pass the valid email constraint. 
![Screenshot 2022-11-28 at 12 25 57 AM](https://user-images.githubusercontent.com/22930165/204154290-f5a4d45e-4d7b-4bba-a84c-3d17154a1e5a.png)
