import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	 
	 //parametros do request
	 String marca = req.getParameter("marca");
	 String processador = req.getParameter("processador");
	 String nomeResp = req.getParameter("nomeResp");
	 int numSerie = Integer.parseInt(req.getParameter("numSerie"));
	//string de Entrega em data
	
	 String entregaEmTexto = req.getParameter("entrega");
	try {
		Date entrega = new SimpleDateFormat("dd-MM-yyyy").parse(entregaEmTexto);
		
		bd.setLista(marca, processador, nomeResp, numSerie , entrega );
	} catch (ParseException e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	 
	 
		 resp.setContentType("text/html");

	 PrintWriter out = resp.getWriter();

	 // Exibir a lista de pessoas
	 out.print("<div>");
	 out.print("<center>");
	 out.println("<table border=\"1\" >");
	 List<Maquinas> lista = bd.getLista();
	 for (Maquinas m : lista) {
	 out.println("<tr>"
	 		+ "<td>" + m.getMarca() + "</td>"
	 				+ "<td>" + m.getProcessador() + "</td>"
	 						+ "<td>" + m.getNomeResp() + "</td>"
	 								+ "<td>" + m.getNumSerie() + "</td>"
	 										+ "<td>" + DateFormat.getDateInstance().format(m.getEntrega()) + "</td>"
	 								+ "<tr>");
	 }
	 out.println("</table>");
	 out.print("<br>");
	 out.print("<a href=\"Index.jsp\"><input type=\"button\"value=\"Novo Cadastro\"></a>");
	 out.print("<center>");
	 out.print("</div>");
	 }
 }
 
		


