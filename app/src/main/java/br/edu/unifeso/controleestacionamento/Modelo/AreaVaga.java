package br.edu.unifeso.controleestacionamento.Modelo;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "AreaVaga")
public class AreaVaga {
        private String aVaga;
        public AreaVaga(@NonNull String AreaVaga) {this.aVaga = AreaVaga;}
        public String getaVaga() {return this.aVaga;}

        @PrimaryKey
        @NonNull
        @ColumnInfo(name = "IdVaga")
        private String IdArea;

        @ColumnInfo(name = "NomeArea")
        private String NomeArea;


        public AreaVaga(String Vaga, String aVaga) {
            switch (IdArea = NomeArea){

            }
            this.aVaga = NomeArea;}
            public String getIdArea (){return this.aVaga;}
        }


