/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Carlos Coves Prieto <carlos.coves.prieto@gmail.com>
 */
@ManagedBean(name = "contacto")
@RequestScoped
public class Contacto implements Serializable {

    private static List<String> sexes;
    private static List<String> groupList;
    private int id;
    private String nombre;
    private String descripcion;
    private String sex;
    private Integer edad;
    private Date fechaNacimeto;
    private String direccion;
    private String telefono;
    private String email;
    private String url;
    private List<String> groups;
    private Boolean gamer;
    private Boolean editable;
    private String password;

    static {
        groupList = new ArrayList<>();
        groupList.add("Family");
        groupList.add("Friends");

        sexes = new ArrayList<>();
        sexes.add("H");
        sexes.add("M");
    }

    public Contacto() {
        editable = false;
        groups = new ArrayList<>();
    }

    public List<String> getGroupList() {
        return groupList;
    }

    public List<String> getSexes() {
        return sexes;
    }

    public void addContactoToAgenda() {
        Agenda.addContacto(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFechaNacimeto() {
        return fechaNacimeto;
    }

    public void setFechaNacimeto(Date fechaNacimeto) {
        this.fechaNacimeto = fechaNacimeto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public String groupsString() {
        StringBuilder sb = new StringBuilder();
        for (String group : groups) {
            sb.append(group);
            if (groups.lastIndexOf(group) != groups.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getGamer() {
        return gamer;
    }

    public void setGamer(Boolean gamer) {
        this.gamer = gamer;
    }
}
