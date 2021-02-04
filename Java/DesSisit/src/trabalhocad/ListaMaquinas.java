package trabalhocad;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/maquinas" })
public class ListaMaquinas extends HttpServlet {
	


	private static final long serialVersionUID = 1L;
BD bd = new BD();
 
 public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String marca = req.getParameter("marca");
	 String processador = req.getParameter("processador");
	 
	 bd.setLista(marca, processador);
	 
	 
		 resp.setContentType("text/html");

	 PrintWriter out = resp.getWriter();

	 // Exibir a lista de pessoas
	 out.println("<table border=\"1\" >");
	 List<Maquinas> lista = bd.getLista();
	 for (Maquinas m : lista) {
	 out.println("<tr><td>" + m.getMarca() + "</td><td>" + m.getProcessador() + "</td><tr>");
	 }
	 out.println("</table>");

	 }
	 //resp.setContentType("")
	
 }
 
		

