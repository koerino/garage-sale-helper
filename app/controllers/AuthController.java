package controllers;

import play.mvc.*;

import models.User;

import views.html.*;

public class AuthController extends Controller {
    public Result index() {
        return ok(login.render());
    }
}