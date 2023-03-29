package br.com.fiap;

import br.com.fiap.model.Atleta;
import br.com.fiap.model.Fundamento;
import br.com.fiap.model.Preparador;
import br.com.fiap.model.Treino;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
        EntityManager manager = factory.createEntityManager();

        //salvar(manager);

        //findById(manager);

        //findAll(manager);

    }

    private static void findAll(EntityManager manager) {
        String jpql = "FROM Treino";
        List<Treino> resultList = manager.createQuery(jpql).getResultList();

        resultList.stream().forEach(System.out::println);
    }

    private static void findById(EntityManager manager) {
        Treino treino = manager.find(Treino.class, 1L);

        System.out.println(treino);
    }

    private static void salvar(EntityManager manager) {
        Atleta atleta = new Atleta();
        atleta.setNome("João").setAltura(185).setCPF("41628357495").setNascimento(LocalDate.of(2005, 03, 22)).setPeso(80);

        Fundamento fundamento = new Fundamento();
        fundamento.setNome("chutar a bola");

        Preparador prep = new Preparador();
        prep.setCREF("12345").setNome("Ronaldo");

        Treino treino = new Treino();
        treino.setAtleta(atleta).setDescricao("Treino de Chute").setInicio(LocalDateTime.now()).
                setFim(LocalDateTime.now().plusHours(1)).setFundamento(fundamento).setNome("Treino de futebol").setPreparador(prep);

        manager.getTransaction().begin();
        manager.persist(atleta);
        manager.persist(fundamento);
        manager.persist(prep);
        manager.persist(treino);
        manager.getTransaction().commit();
    }
}