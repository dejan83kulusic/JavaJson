package com.server;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/knjige")
public class RestServises {
	private KnjigaDAOS list = new KnjigaDAOS();

	{
		list.getKnjigaList().add(0, new KnjigaDAO(0, "Ana Galic", "dsadas", "dsadas", 2, "sda", "dd", 2, "dsadsa", "dsa"));
		list.getKnjigaList().add(1, new KnjigaDAO(1, "Marko Markovic", "dsadas", "dsadas", 2, "sda", "dd", 2, "dsadsa", "dsa"));
		list.getKnjigaList().add(2, new KnjigaDAO(2, "Pero Peric", "dsadas", "dsadas", 2, "sda", "dd", 2, "dsadsa", "dsa"));
		list.getKnjigaList().add(3, new KnjigaDAO(3, "Slavko Slavkovic", "dsadas", "dsadas", 2, "sda", "dd", 2, "dsadsa", "dsa"));
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public KnjigaDAOS getAllKnjige() {
		return list;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{knjige}")
	public KnjigaDAO getStudent(@PathParam("Knjige") int isbn) {
		if (isbn < list.getKnjigaList().size()) {
			return list.getKnjigaList().get(isbn);
		}
		return new KnjigaDAO();
	}
}
