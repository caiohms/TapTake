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
                    CafeFiltrado.Image = "@drawable/logo";
                    CafeFiltrado.Category = "Bebida";
                    CafeFiltrado.Price = 25;

                    Starbucks.Items.add(CafeFiltrado);
                }

                {
                    Item PrensaFrancesa = new Item();
                    PrensaFrancesa.Name = "Prensa Francesa";
                    PrensaFrancesa.Description = "Perfeito para degustar com amigos.";
                    PrensaFrancesa.Image = "@drawable/logo";
                    PrensaFrancesa.Category = "Bebida";
                    PrensaFrancesa.Price = 35;

                    Starbucks.Items.add(PrensaFrancesa);
                }

                {
                    Item ChocolateClassico = new Item();
                    ChocolateClassico.Name = "Chocolate Clássico";
                    ChocolateClassico.Description = "Café com Chocolate Cremoso.";
                    ChocolateClassico.Image = "@drawable/logo";
                    ChocolateClassico.Category = "Bebida";
                    ChocolateClassico.Price = 15;

                    Starbucks.Items.add(ChocolateClassico);
                }

                PUCPR.University.Restaurants.add(Starbucks);
            }

            {
                Restaurant BurgerKing = new Restaurant();
                BurgerKing.Name = "McDonald's";
                BurgerKing.Logo = "@drawable/logorestaurant2";
                BurgerKing.Banner = "@drawable/banner_mcdo";
                BurgerKing.Items = new ArrayList<>();

                {
                    // TODO: Add Items.
                }

                PUCPR.University.Restaurants.add(BurgerKing);
            }

            {
                Restaurant BurgerKing = new Restaurant();
                BurgerKing.Name = "SubWay";
                BurgerKing.Logo = "@drawable/logorestaurant3";
                BurgerKing.Banner = "@drawable/banner_sub_way";
                BurgerKing.Items = new ArrayList<>();

                {
                    // TODO: Add Items.
                }

                PUCPR.University.Restaurants.add(BurgerKing);
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

            {
                Restaurant BurgerKing = new Restaurant();
                BurgerKing.Name = "Habib's";
                BurgerKing.Logo = "@drawable/logorestaurant5";
                BurgerKing.Banner = "@drawable/banner_habibs";
                BurgerKing.Items = new ArrayList<>();

                {
                    // TODO: Add Items.
                }

                PUCPR.University.Restaurants.add(BurgerKing);
            }

            {
                Restaurant BurgerKing = new Restaurant();
                BurgerKing.Name = "Cacau Show";
                BurgerKing.Logo = "@drawable/logorestaurant6";
                BurgerKing.Banner = "@drawable/banner_cacau";
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
            UNICURITIBA.University.Description = "Endereço: R. Chile, 1678 - Rebouças, Curitiba - PR, 80220-181";
            UNICURITIBA.University.Image = "@drawable/logo_unicuritiba";
            UNICURITIBA.University.Restaurants = new ArrayList<>();

            // TODO: Create Restaurants.

            Universities.add(UNICURITIBA);
        }

        {
            UserUniversity UNICURITIBA = new UserUniversity();
            UNICURITIBA.University = new University();
            UNICURITIBA.University.Name = "Universidade Positivo";
            UNICURITIBA.University.Description = "Endereço: Cidade Industrial de Curitiba, Curitiba - PR, 81290-000";
            UNICURITIBA.University.Image = "@drawable/logo_up";
            UNICURITIBA.University.Restaurants = new ArrayList<>();

            // TODO: Create Restaurants.

            Universities.add(UNICURITIBA);
        }

        {
            UserUniversity UNICURITIBA = new UserUniversity();
            UNICURITIBA.University = new University();
            UNICURITIBA.University.Name = "Universidade Tuiuti do Paraná";
            UNICURITIBA.University.Description = "Endereço: Rua Sydnei Antonio Rangel Santos, 238 - Santo Inácio, Curitiba - PR, 82010-330";
            UNICURITIBA.University.Image = "@drawable/logo_utp";
            UNICURITIBA.University.Restaurants = new ArrayList<>();

            // TODO: Create Restaurants.

            Universities.add(UNICURITIBA);
        }

        CurrentUniversity = Universities.get(0);
    }
}
