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

![Screenshot 2022-11-27 at 11 37 47 PM](https://user-images.githubusercontent.com/22930165/204152292-7901474b-b691-41ee-83db-21cbdf685956.png)![Screenshot 2022-11-28 at 8 25 29 AM](https://user-images.githubusercontent.com/22930165/204181686-f5779e1a-f318-4a04-98f9-53967d803b08.png)


![Screenshot 2022-11-27 at 11 39 04 PM](https://user-images.githubusercontent.com/22930165/204152340-176f44f1-3b70-4583-a85a-66fb68649535.png)

The login page expects the person to enter voterid(atleast 5 characters long)and email.

As the first test , we try we bypass the login page by sending random queries to the election page. Bypassing the loginpage takes us to a blockpage. Thus we cannot bypass the login page by sending random queries.
![Screenshot 2022-11-28 at 1 29 58 AM](https://user-images.githubusercontent.com/22930165/204156978-b8345f88-776d-4439-88f1-0e3d73d02df1.png)
But for one particular query (?admin=true) we were able to bypass the login page and directly go to the admin page.

A testcase was generated with "User1" as the voterid and "12345" as the email . This testcase could not pass the valid email constraint. 
![Screenshot 2022-11-28 at 12 20 52 AM](https://user-images.githubusercontent.com/22930165/204154064-08d98f83-ca10-49b8-97e4-b3462d50ba78.png)
The prompt asks for a '@' in the email section .

A testcase was generated with "User1" as the voterid and "12345@" as the email . This testcase could not pass the valid email constraint. 
![Screenshot 2022-11-28 at 12 25 57 AM](https://user-images.githubusercontent.com/22930165/204154290-f5a4d45e-4d7b-4bba-a84c-3d17154a1e5a.png)

We create a testcase with "Usr1" as the voterid and "abc@def" as the email . This testcase could not pass the valid voterid constraint.
![Screenshot 2022-11-28 at 1 19 33 AM](https://user-images.githubusercontent.com/22930165/204156641-51498820-d86b-45d0-b034-10757ff108a7.png)

Next we generate 10 testcases randomly where the voterid is a randomly generated 5 digit combination of alphabets and the email is of the format XXX@XX . 
These test cases are able to pass client side validation . These test cases fail on server side validation.
![Screenshot 2022-11-28 at 12 54 55 AM](https://user-images.githubusercontent.com/22930165/204155845-df801829-6681-463d-af5c-597a5113818a.png)

Then the OTP functionality was tested by entering the ADMIN credentials . On entering the wrong OTP we are directed back to the initial login page whereas on entering the correct OTP we are directed to the ADMIN priviledge pages of the application.
![Screenshot 2022-11-28 at 8 26 03 AM](https://user-images.githubusercontent.com/22930165/204181737-303200f7-5829-4a2b-a106-ae9417774f9c.png)

![Screenshot 2022-11-28 at 8 26 51 AM](https://user-images.githubusercontent.com/22930165/204181826-12176c4a-fff6-45d8-b927-d3046bb29b15.png)

![Screenshot 2022-11-28 at 8 27 59 AM](https://user-images.githubusercontent.com/22930165/204181960-48b48c05-5c3b-417b-969a-7604ce2ca62f.png)

![Screenshot 2022-11-28 at 8 28 23 AM](https://user-images.githubusercontent.com/22930165/204182008-9c2851df-43c0-4323-9351-e99fc7a6d8ba.png)

![Screenshot 2022-11-28 at 8 28 47 AM](https://user-images.githubusercontent.com/22930165/204182062-1cc8b65c-43e0-4dc1-af2c-44e172a8b8d8.png)

Database Connectivity Testing

The database connectivity was evaluated on two different browsers - Chrome and Edge.

A. Election Registration Testing on Election Database
    
    • In this part we generated random election name ,time period and voters count for the election.
    • Since none of  election name , time period and voters count is not our primary key therefore we are having duplicate values .
    
   ![image](https://user-images.githubusercontent.com/29448961/204195140-9b58e775-0c41-4440-803a-9df4d7e0f52a.png)

B. Candidate Registration Testing on Candidate Database

    • Generation for candidate names randomly and constructing a candidate Id array of length 10.
    • The candidate Id array contains some duplicate values. 
    • The system does not accept the duplicate “Ids” values as they are primary key for our Candidate database.
    
   ![image](https://user-images.githubusercontent.com/29448961/204195186-8dc7c517-92c8-4029-b2a4-7a952ce84202.png)

C. Voter Registration Testing on Voters Database

    • Similar to Candidate database , this database has voter Id as primary key ,so no accepting of  duplicate values 
    • Generation of different voter data such as Name, Address,Email is done randomly. 
    
   ![image](https://user-images.githubusercontent.com/29448961/204195224-49d35b05-e5f9-42d9-8e03-d7c11f6830bd.png)

    
