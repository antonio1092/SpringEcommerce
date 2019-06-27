package com.ecommerce.webapp.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.webapp.entity.Articolo;
import com.ecommerce.webapp.entity.Categoria;
import com.ecommerce.webapp.entity.Iva;
import com.ecommerce.webapp.service.IArticoloService;
import com.ecommerce.webapp.service.ICategoriaService;
import com.ecommerce.webapp.service.IIvaService;

@Controller
@RequestMapping(value="/articolo")
public class ArticoloController {

	@Autowired
	private IArticoloService articoloService;
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@Autowired
	private IIvaService ivaService;
	
	@RequestMapping(value="/aggiungi", method= RequestMethod.GET)
	public String insArticolo(Model model, HttpServletRequest request)
	{

		ArrayList<Categoria> categorie = new ArrayList<Categoria>();
		ArrayList<Iva> ive = new ArrayList<Iva>();
		
		Articolo articolo = new Articolo();
        Categoria categoria = new Categoria();
        Iva iva = new Iva();
        
        categorie = categoriaService.viaualizza();
        ive = ivaService.visualizza();
        
		model.addAttribute("newArticolo", articolo);
		model.addAttribute("newCategoria", categoria);
		model.addAttribute("newIva", iva);
		model.addAttribute("ive", ive);
		request.setAttribute("categorie", categorie);
		
		return "inserimentoarticolo";
	}
	
	
	@RequestMapping(value="/aggiungi", method=RequestMethod.POST)
	public String inserimentoarticolo(@ModelAttribute("newArticolo") Articolo a, @ModelAttribute("newCategoria") Categoria c, 
			@ModelAttribute("newIva") Iva i, HttpServletRequest request, HttpServletResponse response, Model model) throws ServletException, IOException {
		
		c=categoriaService.selectById(Integer.parseInt(request.getParameter("categorie")));
		i=ivaService.selectById(Integer.parseInt(request.getParameter("ive")));
		
		a.setCodArticolo(Integer.parseInt(request.getParameter("codArticolo")));
		a.setDescrizione(request.getParameter("descrizione"));
		//	a.setDataCreazione(request.getParameter("dataCreazione"));
		a.setCategoria(c);
		a.setIva(i);
		
		
		articoloService.insArticolo(a);
			
		return "index";
	}
	
}
