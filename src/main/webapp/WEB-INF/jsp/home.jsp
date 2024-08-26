<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>AppLivraria: gestão de vendas</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active" href="/">AppLivraria</a></li>
				<li class="nav-item"><a class="nav-link" href="/carrinho/listar">Carrinhos</a></li>
				<li class="nav-item"><a class="nav-link" href="/produto/listar">Produtos</a></li>
				<li class="nav-item"><a class="nav-link" href="/revista/listar">Revistas</a></li>
				<li class="nav-item"><a class="nav-link" href="/livro/listar">livros</a></li>
			</ul>
		</div>
	</nav>

	<div class="container mt-3">

		<span class="badge rounded-pill bg-primary">Carrinhos:${qtdeCarrinhos}</span>
		<span class="badge rounded-pill bg-secondary">Produtos:${qtdeProdutos}</span>
		<span class="badge rounded-pill bg-success">Revistas:${qtdeRevistas}</span>
		<span class="badge rounded-pill bg-danger">Livros:${qtdeLivros}</span>

		<c:if test="${not empty listagem}">
			<h2>AppLivraria</h2>
			<p>Gestão de vendas de produtos:</p>
			<table class="table">
				<thead class="table-dark">
					<tr>
						<th>${titulo}</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${listagem}">
						<tr>
							<td>${item}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/js/bootstrap.min.js"></script>
</body>
</html>