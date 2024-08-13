# Django
Python fullstack framework, competitor to Flask.

Opinionated DB access, plugins(middleware), routing, authentication, API requests, page rendering and more!

Fullstack = backend + frontend, however it can be used as only backend or frontend with configuration.

THE FULL DOCS - [https://docs.djangoproject.com/en/5.1/](https://docs.djangoproject.com/en/5.1/)

## Templates
The way django generates pages, similar to a more dynamic html/markdown

[https://docs.djangoproject.com/en/5.1/topics/templates/](https://docs.djangoproject.com/en/5.1/topics/templates/)

## Models 
A way to map python as a source of truth to represent a database(I think postgresql in your case)

[https://docs.djangoproject.com/en/5.1/topics/db/models/](https://docs.djangoproject.com/en/5.1/topics/db/models/)

### SQL overview? if needed
[https://www.w3schools.com/sql/sql_intro.asp](https://www.w3schools.com/sql/sql_intro.asp)

## Views

The django way to handle requests to your server.

Can return data, errors, templates

[https://docs.djangoproject.com/en/5.0/topics/http/views/](https://docs.djangoproject.com/en/5.0/topics/http/views/)

example view:
```python
from django.http import HttpResponse
from django.views import View

class HelloWorldView(View):
    def get(self, request):
        return HttpResponse("Hello, World!")
```


```python
from rest_framework.views import APIView
from rest_framework.response import Response
from rest_framework import authentication, permissions
from django.contrib.auth.models import User

class ListUsers(APIView):
    """
    View to list all users in the system.

    * Requires token authentication.
    * Only admin users are able to access this view.
    """
    authentication_classes = [authentication.TokenAuthentication]
    permission_classes = [permissions.IsAdminUser]

    def get(self, request, format=None):
        """
        Return a list of all users.
        """
        usernames = [user.username for user in User.objects.all()]
        return Response(usernames)
```


Good small example of other view usage:

[https://docs.djangoproject.com/en/5.1/intro/tutorial03/#write-views-that-actually-do-something](https://docs.djangoproject.com/en/5.1/intro/tutorial03/#write-views-that-actually-do-something)

## Take a look at an example:
* [https://docs.djangoproject.com/en/5.1/intro/tutorial01/](https://docs.djangoproject.com/en/5.1/intro/tutorial01/)
* [https://docs.djangoproject.com/en/5.1/intro/tutorial02/](https://docs.djangoproject.com/en/5.1/intro/tutorial02/)
* [https://docs.djangoproject.com/en/5.1/intro/tutorial03/](https://docs.djangoproject.com/en/5.1/intro/tutorial03/)

## The django admin site:
* Havent really looked at but I remember seeing this on your project
[https://docs.djangoproject.com/en/5.1/ref/contrib/admin/#module-django.contrib.admin](https://docs.djangoproject.com/en/5.1/ref/contrib/admin/#module-django.contrib.admin)
## Auth middlware and other auth:
[https://docs.djangoproject.com/en/5.0/ref/middleware/#django.contrib.auth.middleware.AuthenticationMiddleware](https://docs.djangoproject.com/en/5.0/ref/middleware/#django.contrib.auth.middleware.AuthenticationMiddleware)
[https://docs.djangoproject.com/en/5.0/topics/auth/default/](https://docs.djangoproject.com/en/5.0/topics/auth/default/)
