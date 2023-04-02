package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@MultipartConfig
@WebServlet("/upload")
public class Fileupload extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	Part p=req.getPart("pdf");
	String s=p.getSubmittedFileName();
    System.out.println(s);
	
	//
	String path=getServletContext().getRealPath("")+"files";
	System.out.println(path);
	File f=new File(path);
	p.write(path+File.separator+s);
}
}
