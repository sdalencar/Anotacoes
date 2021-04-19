package com.sdainfo.anotaes.pref;

import android.content.Context;
import android.content.SharedPreferences;

public class Anotacao {

    private Context context;
    private SharedPreferences sharedPreferences;

    private final String NOME_ARQUIVO = "configuracao";
    private final String CHAVE_NOME = "nome";

    private SharedPreferences.Editor editor;

    public Anotacao(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = sharedPreferences.edit();
    }

    public void salvarAnotacao(String anotacao) {
        editor.putString(CHAVE_NOME, anotacao);
        editor.commit();

    }

    public String lerAnotacao() {
        return sharedPreferences.getString(CHAVE_NOME, "sem anotações");
    }
}
