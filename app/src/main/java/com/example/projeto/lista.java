package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.projeto.model.ebooks;

import android.app.Activity;
import android.os.Bundle;

import com.example.projeto.adapter.EbookAdapter;
import com.example.projeto.databinding.ActivityListaBinding;

import java.util.ArrayList;

public class lista extends AppCompatActivity {

    private ActivityListaBinding binding;
    private EbookAdapter ebookAdapter;
    private ArrayList<ebooks> ebookList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewEbook = binding.RecyclerViewEbook;
        recyclerViewEbook.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewEbook.setHasFixedSize(true);
        ebookAdapter = new EbookAdapter(ebookList,this);
        recyclerViewEbook.setAdapter(ebookAdapter);
        getEbook();
    }

    private void getEbook(){
        ebooks ebook1 = new ebooks(
                R.drawable.ebook1,
                "Rumo à Liberdade Financeira",
                "Este e-book abrange estratégias práticas para criar um plano financeiro sólido, desde a gestão do orçamento até a construção de um fundo de emergência. Descubra como alcançar a liberdade financeira e tomar o controle de suas finanças.",
                "R$ 120,00"
        );
        ebookList.add(ebook1);

        ebooks ebook2 = new ebooks(
                R.drawable.ebook2,
                "Investindo com Inteligência",
                "Para aqueles que desejam iniciar no mundo dos investimentos, este e-book oferece conselhos claros e práticos. Aprenda sobre diferentes opções de investimento, como ações, títulos e fundos mútuos, e desenvolva uma abordagem inteligente para fazer seu dinheiro trabalhar por você.",
                "R$ 80,00"
        );
        ebookList.add(ebook2);

        ebooks ebook3 = new ebooks(
                R.drawable.ebook3,
                "Economize, Invista, Conquiste",
                "Descubra como equilibrar o presente e o futuro, aprendendo a economizar de forma eficiente, investir de maneira estratégica e conquistar seus objetivos financeiros a longo prazo. Este guia completo irá capacitá-lo a tomar decisões financeiras informadas.",
                "R$ 30,00"
        );
        ebookList.add(ebook3);

        ebooks ebook4 = new ebooks(
                R.drawable.ebook4,
                "Orçamento Descomplicado",
                "Este e-book desmistifica o processo de elaboração de orçamentos, tornando-o acessível a todos. Aprenda a criar e manter um orçamento eficaz, identificando áreas para economizar e priorizando gastos para alcançar seus objetivos financeiros de maneira realista e sustentável.",
                "R$ 70,00"
        );
        ebookList.add(ebook4);

        ebooks ebook5 = new ebooks(
                R.drawable.ebook5,
                "O Caminho da Riqueza",
                "Este e-book avançado explora estratégias de investimento mais complexas, desde a diversificação da carteira até a compreensão das tendências do mercado. Desenvolva habilidades avançadas para maximizar seus ganhos e construir riqueza ao longo do tempo.",
                "R$ 50,00"
        );
        ebookList.add(ebook5);
    }
}