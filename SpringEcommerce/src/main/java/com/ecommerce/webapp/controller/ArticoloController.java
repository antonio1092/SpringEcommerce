package com.ecommerce.webapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.webapp.entity.Articolo;
import com.ecommerce.webapp.service.IArticoloService;

@Controller
@RequestMapping(value="/inserimentoarticolo")
public class ArticoloController {

	@Autowired
	IArticoloService articolo;
	
	@RequestMapping(value="aggiungi", method=RequestMethod.POST)
	public String inserimentoarticolo(HttpServletRequest request, HttpServletResponse response, Model model) throws ServletException, IOException {
		Articolo a = new Articolo();
		
		a.setCodArticolo(Integer.parseInt(request.getParameter("CODARTICOLO")));
		a.setDescrizione(request.getParameter("DESCRIZIONE"));
		a.setPrezzo(Double.parseDouble(request.getParameter("Prezzo")));
		
		articolo.insArticolo(a);
		
//		RequestDispatcher rd;
//		rd = request.getRequestDispatcher("index.jsp");
//		rd.forward(request, response);
		
		System.out.println(a.getCodArticolo());
		
		return "/";
	}
	
}
