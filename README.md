# Java-REST-API
A java rest api for manipulating users and their projects 

## Features

- RESTful routing
- Models with proper relationships (a user model has one to many projects, a project matches one to one user, one project may have one to many files in it)
- Controllers/Models etc with proper separation of concerns

## Routes List:

### projects

| Method     | URI                               | Action                                                  |
|------------|-----------------------------------|---------------------------------------------------------|
| `POST`     | `projects`                        | `App\Http\Controllers\CommentsController@createProject` |
| `GET/`     | `projects`                        | `App\Http\Controllers\CommentsController@getProjects`   |
| `GET/`     | `projects/{id}`                   | `App\Http\Controllers\CommentsController@getProject`    |
| `DELETE`   | `projects/{id}`                   | `App\Http\Controllers\CommentsController@deleteProject` |
| `PUT`      | `projects/{id}`                   | `App\Http\Controllers\CommentsController@updateProject` |


### Users

| Method     | URI                               | Action                                                  |
|------------|-----------------------------------|---------------------------------------------------------|
| `GET`      | `users`                           | `App\Http\Controllers\UsersController@getUsers`         |
| `POST`     | `users`                           | `App\Http\Controllers\UsersController@createUser`       |
| `PUT`      | `users/{id}`                      | `App\Http\Controllers\UsersController@updateUser`       |
| `GET`      | `users/{id}`                      | `App\Http\Controllers\UsersController@getUser`          |
| `DELETE`   | `users/{id}`                      | `App\Http\Controllers\UsersController@deleteUser`       |


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
