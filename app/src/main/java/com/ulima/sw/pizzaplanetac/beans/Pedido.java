package com.ulima.sw.pizzaplanetac.beans;

import java.util.List;

/**
 * Created by Admin on 9/05/2016.
 */
public class Pedido {
    private int id;
    private Estado estado;
    private String usuario;
    private String direccion;
    private float monto;
    private List<Pizza> pizzas;
    private List<Producto> productos;

    public Pedido() {
    }

    public Pedido(int id, Estado estado, String usuario, String direccion, float monto, List<Pizza> pizzas) {
        this.id = id;
        this.estado = estado;
        this.usuario = usuario;
        this.direccion = direccion;
        this.monto = monto;
        this.pizzas = pizzas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
