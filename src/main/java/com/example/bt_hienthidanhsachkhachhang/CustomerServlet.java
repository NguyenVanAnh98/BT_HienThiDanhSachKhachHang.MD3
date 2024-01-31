package com.example.bt_hienthidanhsachkhachhang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        customers.add(new Customer(1, "Bui Van Truong", "Da Nang", LocalDate.parse("2004-10-13"), "https://media1.nguoiduatin.vn/media/le-manh-quoc/2024/01/13/dai-noi.jpeg"));
        customers.add(new Customer(2, "Nguyen Van Anh", "Quang Nam", LocalDate.parse("1998-12-01"), "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0LcUKSfouZ5tCRqV_CcFuZcA6a3mLtukQJA&usqp=CAU"));
        customers.add(new Customer(3, "Truong Van Phap", "Hue", LocalDate.parse("2002-08-15"), "https://media1.nguoiduatin.vn/media/le-manh-quoc/2024/01/13/dai-noi.jpeg"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("customers", customers);
        req.getRequestDispatcher("/WEB-INF/customers.jsp")
                .forward(req, resp);
    }
}