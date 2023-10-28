
<%--<%@page import="java.util.*"%>--%>
<%--<%@ page import="com.example.week6.model.User" %>--%>
<%--<%@ page import="com.example.week6.dao.ProductDao" %>--%>
<%--<%@ page import="com.example.week6.model.Cart" %>--%>
<%--<%@ page import="com.example.week6.model.Product" %>--%>
<%--<%@ page import="com.example.week6.connections.DbCon" %>--%>
<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"--%>
<%--         pageEncoding="ISO-8859-1"%>--%>

<%--<%--%>
<%--    User auth = (User) request.getSession().getAttribute("auth");--%>
<%--    if (auth != null) {--%>
<%--        request.setAttribute("person", auth);--%>
<%--    }--%>
<%--    ProductDao pd = new ProductDao(DbCon.getConnection());--%>
<%--    List<Product> products = pd.getAllProducts();--%>
<%--    ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");--%>
<%--    if (cart_list != null) {--%>
<%--        request.setAttribute("cart_list", cart_list);--%>
<%--    }--%>
<%--%>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <%@include file="/includes/head.jsp"%>--%>
<%--    <title>E-Commerce Cart</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<%@include file="/includes/navbar.jsp"%>--%>

<%--<div class="container">--%>
<%--    <div class="card-header my-3">All Products</div>--%>
<%--    <div class="row">--%>
<%--        <%--%>
<%--            if (!products.isEmpty()) {--%>
<%--                for (Product p : products) {--%>
<%--        %>--%>
<%--        <div class="col-md-3 my-3">--%>
<%--            <div class="card w-100">--%>
<%--                <img class="card-img-top" src="product-Image/<%=p.getImage()%>" alt="Card image cap">--%>
<%--                <div class="card-body">--%>
<%--                    <h5 class="card-title"><%=p.getName() %></h5>--%>
<%--                    <h6 class="price">Price: $<%=p.getPrice() %></h6>--%>
<%--                    <h6 class="category">Category: <%=p.getCategory() %></h6>--%>
<%--                    <div class="mt-3 d-flex justify-content-between">--%>
<%--                        <a class="btn btn-dark" href="add-to-cart?id=<%=p.getId()%>">Add to Cart</a> <a--%>
<%--                            class="btn btn-primary" href="order-now?quantity=1&id=<%=p.getId()%>">Buy Now</a>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <%--%>
<%--                }--%>
<%--            } else {--%>
<%--                System.out.println("There is no products");--%>
<%--            }--%>
<%--        %>--%>

<%--    </div>--%>
<%--</div>--%>

<%--<%@include file="/includes/footer.jsp"%>--%>
<%--</body>--%>
<%--</html>--%>

<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>WELCOME TO SHOPPING CART</title>--%>
<%--    <%@include file="includes/head.jsp"%>--%>
<%--</head>--%>
<%--<body>--%>
<%--<nav class="navbar navbar-expand-lg bg-body-tertiary">--%>
<%--    <div class="container-fluid">--%>
<%--        <a class="navbar-brand" href="#">Navbar</a>--%>
<%--        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">--%>
<%--            <span class="navbar-toggler-icon"></span>--%>
<%--        </button>--%>
<%--        <div class="collapse navbar-collapse" id="navbarNav">--%>
<%--            <ul class="navbar-nav">--%>
<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link active" aria-current="page" href="#">Home</a>--%>
<%--                </li>--%>
<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link" href="#">Features</a>--%>
<%--                </li>--%>
<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link" href="#">Pricing</a>--%>
<%--                </li>--%>
<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link disabled" aria-disabled="true">Disabled</a>--%>
<%--                </li>--%>
<%--            </ul>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</nav>--%>
<%--<%@include file="includes/footer.jsp"%>--%>
<%--</body>--%>
<%--</html>--%>