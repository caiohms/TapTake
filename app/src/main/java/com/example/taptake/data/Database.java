package com.example.taptake.data;

import java.util.ArrayList;

public class Database {

    public static ArrayList<UserUniversity> Universities = new ArrayList<>();
    public static UserUniversity CurrentUniversity = null;
    public static ArrayList<Order> OrderHistory = new ArrayList<>();
    public static Order CurrentOrder = null;

    public static Restaurant CurrentRestaurant = null;

    public static void LoadDatabase() {
        {
            UserUniversity PUCPR = new UserUniversity();
            PUCPR.Favorite = true;
            PUCPR.University = new University();
            PUCPR.University.Name = "Pontifícia Universidade Católica do Paraná";
            PUCPR.University.Description = "Endereço: R. Imac. Conceição, 1155 - Prado Velho, Curitiba - PR, 80215-901";
            PUCPR.University.Image = "@drawable/logo_puc";
            PUCPR.University.Restaurants = new ArrayList<>();


            {
                Restaurant Starbucks = new Restaurant();
                Starbucks.Name = "StarBucks";
                Starbucks.Logo = "@drawable/logorestaurant1";
                Starbucks.Banner = "@drawable/banner_starbucks";
                Starbucks.Items = new ArrayList<>();

                {
                    Item CafeFiltrado = new Item();
                    CafeFiltrado.Name = "Café Filtrado";
                    CafeFiltrado.Description = "Preparado no método tradicional.";
                    CafeFiltrado.Image = "@drawable/starbucks_cafe_filtrado";
                    CafeFiltrado.Category = "Bebida";
                    CafeFiltrado.Price = 25;

                    Starbucks.Items.add(CafeFiltrado);
                }

                {
                    Item PrensaFrancesa = new Item();
                    PrensaFrancesa.Name = "Prensa Francesa";
                    PrensaFrancesa.Description = "Perfeito para degustar com amigos.";
                    PrensaFrancesa.Image = "@drawable/starbucks_prensa_francesa";
                    PrensaFrancesa.Category = "Bebida";
                    PrensaFrancesa.Price = 35;

                    Starbucks.Items.add(PrensaFrancesa);
                }

                {
                    Item ChocolateClassico = new Item();
                    ChocolateClassico.Name = "Chocolate Clássico";
                    ChocolateClassico.Description = "Café com Chocolate Cremoso.";
                    ChocolateClassico.Image = "@drawable/starbucks_chocolate_classico";
                    ChocolateClassico.Category = "Bebida";
                    ChocolateClassico.Price = 15;

                    Starbucks.Items.add(ChocolateClassico);
                }

                PUCPR.University.Restaurants.add(Starbucks);
            }

            {
                Restaurant BurgerKing = new Restaurant();
                BurgerKing.Name = "Burger King";
                BurgerKing.Logo = "@drawable/logorestaurant4";
                BurgerKing.Banner = "@drawable/banner_burger_king";
                BurgerKing.Items = new ArrayList<>();

                {
                    // TODO: Add Items.
                }

                PUCPR.University.Restaurants.add(BurgerKing);
            }

            Universities.add(PUCPR);
        }

        {
            UserUniversity UNICURITIBA = new UserUniversity();
            UNICURITIBA.University = new University();
            UNICURITIBA.University.Name = "UNICURITIBA";
            UNICURITIBA.University.Description = "123";
            UNICURITIBA.University.Image = "@drawable/logo_unicuritiba";
            UNICURITIBA.University.Restaurants = new ArrayList<>();

            // TODO: Create Restaurants.

            Universities.add(UNICURITIBA);
        }

        CurrentUniversity = Universities.get(0);
    }
}
