package br.edu.unifeso.controleestacionamento.Modelo;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "Vaga")
public class Vaga {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "vaga")
    private String idVaga;

    @NonNull
    @ColumnInfo(name = "numero")
    private int numero;

    public Vaga(String idVaga,int numero) {
        this.idVaga = idVaga;
        this.numero = numero;
    }





}