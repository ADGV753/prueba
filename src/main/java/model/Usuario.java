package model;
import jakarta.persistence.*;
@Entity
@Table (name= "usuario")
    public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long ID_Usuario;

        @Column(nullable = false, unique = true)
        private int CC;

        @Column(nullable = false)
        private String Nombre;

        @Column(nullable = false, unique = true)
        private String Email;

        @Column(nullable = false, unique = true)
        private String Contraseña;

        public Usuario() {
        }

    public Usuario(int CC, String nombre, String email, String contraseña) {
        this.CC = CC;
        Nombre = nombre;
        Email = email;
        Contraseña = contraseña;
    }

    public Long getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(Long ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}
