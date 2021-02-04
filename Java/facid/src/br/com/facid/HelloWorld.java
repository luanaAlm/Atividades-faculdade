package br.com.facid;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/login" })
public class HelloWorld extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String usuario = req.getParameter("usuario");
		String senha = req.getParameter("senha");

		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		if (usuario.equals("vinicius"))
			out.println("<h1>Login com sucesso!</h1>");
		else
			out.println("<h1>Usuário(" + usuario + ") e senha(" + senha + ") inválidas!</h1>");

		// Exibir a lista de pessoas
		out.println("<table border=\"1\" >");
		List<Pessoa> lista = BD.getPessoas();
		for (Pessoa p : lista) {
			out.println("<tr><td>" + p.getNome() + "</td><td>" + p.getIdade() + "</td><tr>");
		}
		out.println("</table>");

	}

}