package com.challegerAPI.APIchallenger.model;

import jakarta.persistence.*;

@Entity
@Table(name="frases")
public class Frase {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String frase;
        private String poster;
        private String titulo;
        private String personaje;




        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public String getFrase() {
                return frase;
        }

        public void setFrase(String frase) {
                this.frase = frase;
        }

        public String getPoster() {
                return poster;
        }

        public void setPoster(String poster) {
                this.poster = poster;
        }

        public String getPersonaje() {
                return personaje;
        }

        public void setPersonaje(String personaje) {
                this.personaje = personaje;
        }

        @Override
        public String toString() {
                return "Frase{" +
                        "id=" + id +
                        ", titulo='" + titulo + '\'' +
                        ", frase='" + frase + '\'' +
                        ", poster='" + poster + '\'' +
                        ", persona='" + personaje + '\'' +
                        '}';
        }
}
