package controllers;

import play.mvc.*;

import models.User;

import views.html.user.*;

public class UserController extends Controller {
    
    public Result profile() {
        return ok(profile.render());
    }
    
}