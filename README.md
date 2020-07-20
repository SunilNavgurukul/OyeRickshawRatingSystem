# OyeRickshawRatingSystem
This is the task give by oyeRickshaw. I just have to implement rating system for driver and passenger.

### Task
1. The passenger should be able to rate a given ride.
2. The driver should be able to see aggregated rating of his all rides
3. The driver should be able to rate the passenger after ride
4. The passenger should be able to see his aggregated rating based on all the rides he has
taken.

### assumptions made by me

1. User can have only one role either driver or passenger.
2. Both can give rewiew to each other.
3. when user logins he/she can see his/her ratings.
4. While submitting review we need to track who is the reviewer and reviewee.


### Approach to my solution

1. First I analysed the problem and tried to connect it to with real world.
2. note down the use cases
3. According to problem I designed the schema and model stucture.
4. Mantaining Repositorya and service.
5. Api creation.

### DB schema or setup scripts if used

1. You have to Create schema name as oyeRickshaw_db.
2. When you will run your code it will create tables automatically.
but if you want to add some data for testing.
Just Follow.
      - 1) I have add oye_db.sql file in my project for testing porpuse.
      - 2) You can import that sql data base using this commond.
          mysql -u username -p database_name < file.sql.


You have to set up root password and schema name in propert file.



### Steps to run your application

1. their should jdk in your local machin.
2. Import your application in STS or eclips as a maven project.
3. Run your application as a spring boot app.

      - For Testing API 
            http://localhost:8080/all --- for getting all data.

            http://localhost:8080/review/:id  --- There should be reviewee id.

            http://localhost:8080/review-post  --- for posting review.
                    the formate will ----->
                    {
                        "id":1,
                        "rating":4,
                        "reviewer":{
                           "id":3,
                           "name":"aadil",
                           "role":{
                              "id":2,
                              "name":"Passanger"
                           }
                        },
                        "reviewee":{
                           "id":1,
                           "name":"sunil",
                           "role":{
                              "id":1,
                              "name":"Driver"
                           }
                        }
                      }


