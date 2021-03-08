package com.google.sps.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/randmessage")
public class RandMessageServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
    ArrayList<String> messages = new ArrayList<String>();
    messages.add("I love playing soccer!");
    messages.add("Huge Juice WRLD fan!");
    messages.add("Suits is my favorite tv show！");
    messages.add("Pizza is my favorite food!");

    Gson gson = new Gson();
    String json = gson.toJson(messages);
    
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
}
