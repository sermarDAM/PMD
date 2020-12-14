package com.example.personleads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeadsRepository {
        private static LeadsRepository repository = new LeadsRepository();
        private HashMap<String, leads> leads = new HashMap<>();

        public static LeadsRepository getInstance() {
            return repository;
        }

        private LeadsRepository() {
            saveLead(new leads("Alexander Pierrot", "CEO", "Insures S.O.", R.drawable.usuariopng));
            saveLead(new leads("Carlos Lopez", "Asistente", "Hospital Blue", R.drawable.usuario));
            saveLead(new leads("Sara Bonz", "Directora de Marketing", "Electrical Parts ltd", R.drawable.usuariopng));
            saveLead(new leads("Liliana Clarence", "Diseñadora de Producto", "Creativa App", R.drawable.usuario));
            saveLead(new leads("Benito Peralta", "Supervisor de Ventas", "Neumáticos Press", R.drawable.usuariopng));
            saveLead(new leads("Juan Jaramillo", "CEO", "Banco Nacional", R.drawable.usuario));
            saveLead(new leads("Christian Steps", "CTO", "Cooperativa Verde", R.drawable.usuariopng));
            saveLead(new leads("Alexa Giraldo", "Lead Programmer", "Frutisofy", R.drawable.usuario));
            saveLead(new leads("Linda Murillo", "Directora de Marketing", "Seguros Boliver", R.drawable.usuariopng));
            saveLead(new leads("Lizeth Astrada", "CEO", "Concesionario Motolox", R.drawable.usuario));
        }

        private void saveLead(leads lead) {
            leads.put(lead.getId(), lead);
        }

        public List<leads> getLeads() {
            return new ArrayList<>(leads.values());
        }
    }


