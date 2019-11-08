package com.example.navegationview;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


import java.util.ArrayList;
import java.util.List;

public class TabPageAdapterProduto extends FragmentStatePagerAdapter {
    private List<Fragment> fragmentos = new ArrayList<Fragment>();
    private List<String> titulos = new ArrayList<String>();

    public TabPageAdapterProduto(FragmentManager fm) {
        super(fm,  BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        fragmentos.add(new TelaProduto());
        titulos.add("Cadastrar");
        fragmentos.add(new ListaProdutos());
        titulos.add("Listar");
        fragmentos.add(new Usuario());
        titulos.add("Usuários");
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentos.get(position);
    }

    @Override
    public int getCount() {
        return fragmentos.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titulos.get(position);
    }

}
