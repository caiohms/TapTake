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

            // TODO: Add Items.

            {
                Restaurant Starbucks = new Restaurant();
                Starbucks.Name = "StarBucks";
                Starbucks.Logo = "@drawable/logorestaurant_starbucks";
                Starbucks.Banner = "@drawable/banner_starbucks";
                Starbucks.Items = new ArrayList<>();

                {
                    Item CafeMocha = new Item();
                    CafeMocha.Name = "Café Mocha";
                    CafeMocha.Description = "Preparado no método tradicional.";
                    CafeMocha.Image = "@drawable/image_cafe_mocha";
                    CafeMocha.Category = "Bebida";
                    CafeMocha.Price = 16;

                    Starbucks.Items.add(CafeMocha);
                }
                {
                    Item DarkChocolate = new Item();
                    DarkChocolate.Name = "Dark Chocolate Mocha";
                    DarkChocolate.Description = "Perfeito para degustar com amigos.";
                    DarkChocolate.Image = "@drawable/image_darkchocolate";
                    DarkChocolate.Category = "Bebida";
                    DarkChocolate.Price = 20;

                    Starbucks.Items.add(DarkChocolate);
                }
                {
                    Item CafeAmericano = new Item();
                    CafeAmericano.Name = "Café Americano";
                    CafeAmericano.Description = "Café com Chocolate Cremoso.";
                    CafeAmericano.Image = "@drawable/image_cafeamericano";
                    CafeAmericano.Category = "Bebida";
                    CafeAmericano.Price = 14;

                    Starbucks.Items.add(CafeAmericano);
                }
                {
                    Item Cappuccino = new Item();
                    Cappuccino.Name = "Cappuccino";
                    Cappuccino.Description = "Café com Chocolate Cremoso.";
                    Cappuccino.Image = "@drawable/image_cappuccino";
                    Cappuccino.Category = "Bebida";
                    Cappuccino.Price = 17;

                    Starbucks.Items.add(Cappuccino);
                }

                PUCPR.University.Restaurants.add(Starbucks);
            }

            {
                Restaurant McDonalds = new Restaurant();
                McDonalds.Name = "McDonald's";
                McDonalds.Logo = "@drawable/logorestaurant_mcdonalds";
                McDonalds.Banner = "@drawable/banner_mcdo";
                McDonalds.Items = new ArrayList<>();

                // TODO: Add Items.

                {
                    Item BigMac = new Item();
                    BigMac.Name = "Big Mac";
                    BigMac.Description = "Dois hambúrgueres (100% carne bovina), alface americana, queijo cheddar, maionese Big Mac, cebola, picles e pão com gergelim.";
                    BigMac.Image = "@drawable/image_bigmac";
                    BigMac.Category = "Hamburger Clássicos";
                    BigMac.Price = 30;

                    McDonalds.Items.add(BigMac);
                }
                {
                    Item Cheeseburger = new Item();
                    Cheeseburger.Name = "Cheeseburger";
                    Cheeseburger.Description = "Um hamburguer (100% carne bovina), queijo cheddar, cebola, picles, ketchup, mostarda e pão sem gergelim.";
                    Cheeseburger.Image = "@drawable/image_cheesebuguer";
                    Cheeseburger.Category = "Hamburger Clássicos";
                    Cheeseburger.Price = 15;

                    McDonalds.Items.add(Cheeseburger);
                }
                {
                    Item DuploCheddarMcMelt = new Item();
                    DuploCheddarMcMelt.Name = "Duplo Cheddar McMelt";
                    DuploCheddarMcMelt.Description = "Dois hambúrgueres (100% carne bovina), molho sabor cheddar, cebola ao molho shoyu e pão escuro com gergelim.";
                    DuploCheddarMcMelt.Image = "@drawable/image_duplo_cheddar_mcmelt";
                    DuploCheddarMcMelt.Category = "Hamburger Clássicos";
                    DuploCheddarMcMelt.Price = 40;

                    McDonalds.Items.add(DuploCheddarMcMelt);
                }
                {
                    Item BigTasty = new Item();
                    BigTasty.Name = "Big Tasty";
                    BigTasty.Description = "Um hambúrguer (100% carne bovina), queijo, tomate, alface americana, cebola e molho Tasty.";
                    BigTasty.Image = "@drawable/image_big_tasty";
                    BigTasty.Category = "Família Tasty";
                    BigTasty.Price = 24;

                    McDonalds.Items.add(BigTasty);
                }
                {
                    Item BigTastyTurboBacon = new Item();
                    BigTastyTurboBacon.Name = "Big Tasty Turbo Bacon";
                    BigTastyTurboBacon.Description = "Dois Hamburgueres (100% carne bovina), bacon, queijo emental, bacon crispy, tomate, alface americana, cebola, maionese Tasty e pão com gergelim.";
                    BigTastyTurboBacon.Image = "@drawable/image_big_tasty_turbo";
                    BigTastyTurboBacon.Category = "Família Tasty";
                    BigTastyTurboBacon.Price = 35;

                    McDonalds.Items.add(BigTastyTurboBacon);
                }


                PUCPR.University.Restaurants.add(McDonalds);
            }

            {
                Restaurant SubWay = new Restaurant();
                SubWay.Name = "SubWay";
                SubWay.Logo = "@drawable/logorestaurant_subway";
                SubWay.Banner = "@drawable/banner_sub_way";
                SubWay.Items = new ArrayList<>();

                // TODO: Add Items.
                {
                    Item FrangoAssado = new Item();
                    FrangoAssado.Name = "Frango Assado";
                    FrangoAssado.Description = "Acompanhado do delicioso molho Caipira. E claro, nosso pão sempre fresquinho, queijo e vegetais à sua escolha. Nos tamanhos de 15cm e 30cm!";
                    FrangoAssado.Image = "@drawable/image_frango_assado";
                    FrangoAssado.Category = "Sanduiches";
                    FrangoAssado.Price = 25;

                    SubWay.Items.add(FrangoAssado);
                }
                {
                    Item CarneDefumadacomCreamCheese = new Item();
                    CarneDefumadacomCreamCheese.Name = "Carne Defumada";
                    CarneDefumadacomCreamCheese.Description = "Deliciosas tiras de carne defumada misturadas com cream cheese. Uma delicia de dar água da boca. Nos tamanhos de 15cm e 30cm!";
                    CarneDefumadacomCreamCheese.Image = "@drawable/image_carne_defumada";
                    CarneDefumadacomCreamCheese.Category = "Sanduiches";
                    CarneDefumadacomCreamCheese.Price = 36;

                    SubWay.Items.add(CarneDefumadacomCreamCheese);
                }
                {
                    Item Italiano = new Item();
                    Italiano.Name = "B.M.T.® Italiano";
                    Italiano.Description = "Servido em pão fresquinho, com fatias de salame, peperoni, presunto, vegetais e condimentos à sua escolha. Nos tamanhos de 15cm e 30cm!";
                    Italiano.Image = "@drawable/image_italiano";
                    Italiano.Category = "Sanduiches";
                    Italiano.Price = 30;

                    SubWay.Items.add(Italiano);
                }
                {
                    Item CarneSupreme = new Item();
                    CarneSupreme.Name = "Carne Supreme";
                    CarneSupreme.Description = "Acompanhado do delicioso molho Supreme. E claro, nosso pão sempre fresquinho, queijo e vegetais à sua escolha. Nos tamanhos de 15cm e 30cm!";
                    CarneSupreme.Image = "@drawable/image_carne_supreme";
                    CarneSupreme.Category = "Sanduiches";
                    CarneSupreme.Price = 28;

                    SubWay.Items.add(CarneSupreme);
                }


                PUCPR.University.Restaurants.add(SubWay);
            }

            {
                Restaurant BurgerKing = new Restaurant();
                BurgerKing.Name = "Burger King";
                BurgerKing.Logo = "@drawable/logorestaurant_burguerking";
                BurgerKing.Banner = "@drawable/banner_burger_king";
                BurgerKing.Items = new ArrayList<>();

                {
                    // TODO: Add Items.
                }

                PUCPR.University.Restaurants.add(BurgerKing);
            }

            {
                Restaurant Habibs = new Restaurant();
                Habibs.Name = "Habib's";
                Habibs.Logo = "@drawable/logorestaurant_habibs";
                Habibs.Banner = "@drawable/banner_habibs";
                Habibs.Items = new ArrayList<>();

                {
                    // TODO: Add Items.
                }

                PUCPR.University.Restaurants.add(Habibs);
            }

            {
                Restaurant CacauShow = new Restaurant();
                CacauShow.Name = "Cacau Show";
                CacauShow.Logo = "@drawable/logorestaurant_cacaushow";
                CacauShow.Banner = "@drawable/banner_cacau";
                CacauShow.Items = new ArrayList<>();

                {
                    // TODO: Add Items.
                }

                PUCPR.University.Restaurants.add(CacauShow);
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
            UserUniversity POSITIVO = new UserUniversity();
            POSITIVO.University = new University();
            POSITIVO.University.Name = "Universidade Positivo";
            POSITIVO.University.Description = "Endereço: Cidade Industrial de Curitiba, Curitiba - PR, 81290-000";
            POSITIVO.University.Image = "@drawable/logo_up";
            POSITIVO.University.Restaurants = new ArrayList<>();

            // TODO: Create Restaurants.

            Universities.add(POSITIVO);
        }

        {
            UserUniversity TUIUTI = new UserUniversity();
            TUIUTI.University = new University();
            TUIUTI.University.Name = "Universidade Tuiuti do Paraná";
            TUIUTI.University.Description = "Endereço: Rua Sydnei Antonio Rangel Santos, 238 - Santo Inácio, Curitiba - PR, 82010-330";
            TUIUTI.University.Image = "@drawable/logo_utp";
            TUIUTI.University.Restaurants = new ArrayList<>();

            // TODO: Create Restaurants.

            Universities.add(TUIUTI);
        }

        CurrentUniversity = Universities.get(0);
    }
}
