# Java-REST-API
It is a Java API that allows you to manipulate two entities: Project and User.

Here is the structure of the two entities and the relationship between them.

![alt text](https://github.com/kamelromdhani/Java-REST-API/blob/master/ekhdemliDrousi/src/main/resources/entitiesAssociation.png).
## Features

- RESTful routing
- Models with proper relationships (a user model has one to many projects, a project matches one to one user, one project may have one to many files in it)
- Controllers/Models etc with proper separation of concerns

## Routes List:

### projects

| Method     | URI                               | Action                                                       |
|------------|-----------------------------------|--------------------------------------------------------------|
| `POST`     | `projects`                        |`ekhdemliDrousi\controllers\ProjectController@createProject`  |          
| `GET`      | `projects`                        | `ekhdemliDrousi\controllers\ProjectController@getProjects`   |
| `GET`      | `projects/{id}`                   | `ekhdemliDrousi\controllers\ProjectController@getProject`    |
| `DELETE`   | `projects/{id}`                   | `ekhdemliDrousi\controllers\ProjectController@deleteProject` |
| `PUT`      | `projects/{id}`                   | `ekhdemliDrousi\controllers\ProjectController@updateProject` |


### Users

| Method     | URI                               | Action                                                        |
|------------|-----------------------------------|---------------------------------------------------------------|
| `GET`      | `users`                           | `ekhdemliDrousi\controllers\UserController@getUsers`          |
| `POST`     | `users`                           | `ekhdemliDrousi\controllers\UserController@createUser`        |
| `PUT`      | `users/{id}`                      | `ekhdemliDrousi\controllers\UserController@updateUser`        |
| `GET`      | `users/{id}`                      | `ekhdemliDrousi\controllers\UserController@getUser`           |
| `DELETE`   | `users/{id}`                      | `ekhdemliDrousi\controllers\UserController@deleteUser`        |


### user response example
{
    "_id": "5bfecf07fa8cd5189412f485",
    "first_name": "romdhani",
    "last_name": "kamel",
    "email": "romdhanikamel30@gmail.com",
    "password": "admin",
    "phone": "94428870",
    "projctsID": []
}

### project response example
{
        "_id" : ObjectId("5bfc5b5da551e11c8c7cdcad"),
        "name" : "project3",
        "description" : "description3",
        "date_limite" : ISODate("2019-01-09T23:00:00Z"),
        "post_date" : ISODate("2018-11-24T23:00:00Z"),
        "etat" : "not solved",
        "categorie" : "computer science",
        "files" : [
                {
                        "url" : "urlFile3",
                        "name" : "file3"
                }
        ],
}

### prerequisites

#### MongoDB
create a mongodb ekhdemliDrousi : `use ekhdemliDrousi` .

create collection project : `db.createCollection("project")`.

create collection user : `db.createCollection("user")`.

#### Maven
