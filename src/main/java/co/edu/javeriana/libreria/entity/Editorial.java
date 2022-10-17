package co.edu.javeriana.libreria.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Editorial
{
    private int id;
    private String name;
    private String web_site;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeb_site()
    {
        return web_site;
    }

    public void setWeb_site(String web_site)
    {
        this.web_site = web_site;
    }
}
