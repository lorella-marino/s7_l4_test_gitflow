package it.epicode.s7_l4.libri;

import it.epicode.s7_l4.autori.Autore;
import it.epicode.s7_l4.case_editrici.CasaEditrice;
import it.epicode.s7_l4.categorie.Categoria;
import lombok.Data;

@Data
public class Libro {
    private String titolo;
    private Autore autore;
    private String isbn;
    private String genere;
    private int annoPubblicazione;
    private CasaEditrice casaEditrice;
    private int numeroPagine;
    private Categoria categoria;
}
