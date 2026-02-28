package com.example.dogcare

data class DogTask(
    val id: Int,
    val title: String,
    val subtitle: String
)

val dogTasks = listOf(
    DogTask(1, "🐕‍🦺 Sortie", "30 minutes au parc"),
    DogTask(2, "💉 Vaccin", "Rappel annuel"),
    DogTask(3, "🧼 Bain", "Shampoing doux"),
    DogTask(4, "💅 Coupe des griffes", "Tous les 2 mois"),
    DogTask(5, "💊 Vermifuge", "Traitement antiparasitaire"),
    DogTask(6, "🪥 Nettoyage des dents", "Prévention du tartre")
)
