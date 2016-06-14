package controllers;

import play.mvc.*;

import models.User;

import views.html.auth.*;

public class AuthController extends Controller {
    public Result index() {
        return ok(login.render());
    }
    public Result signup() {
        return ok(signup.render());
    }
    public Result success() {
        return ok(success.render());
    }
}