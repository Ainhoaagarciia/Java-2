package org.example;

public class Tipos {
        private int id;
        private String titulo;

        public Tipos(int id, String titulo) {
            this.id = id;
            this.titulo = titulo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        @Override
        public String toString() {
            return "Tipos{" +
                    "id=" + id +
                    ", titulo='" + titulo + '\'' +
                    '}';
        }
    }


