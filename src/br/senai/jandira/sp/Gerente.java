package br.senai.jandira.sp;

public class Gerente extends Funcionarios{

        private double bonus;

        public Gerente(String nome, double salarioFixo, int id, double bonus) {
            super(nome, salarioFixo, id);
            this.bonus = bonus;
        }
        @Override
        public double calcularSalario() {
            return getSalario() + bonus;
        }
    }


