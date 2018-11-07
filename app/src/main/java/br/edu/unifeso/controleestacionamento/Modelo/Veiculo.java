package br.edu.unifeso.controleestacionamento.Modelo;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "Veiculo")
public class Veiculo {
    private String vVeic;
    public Veiculo(@NonNull String Veiculo) {this.vVeic = Veiculo;}
    public String getvVeic(){return this.vVeic;}

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Marca")
    private String Marca;

    @ColumnInfo(name = "Placa")
    private String Placa;

    public Veiculo(String Veiculo, String marca, String placa)  {
        switch (marca = marca){

        }
        this.vVeic = Veiculo;}
    public String getMarca(){return this.Placa;}
    }



