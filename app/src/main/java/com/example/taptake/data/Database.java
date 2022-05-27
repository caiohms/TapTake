package com.example.taptake.data;

import java.util.ArrayList;

public class Database {

    public static ArrayList<UserUniversity> Universities = new ArrayList<>();
    public static UserUniversity CurrentUniversity = null;
    public static Item CurrentItem = null;
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

            // TODO: Create Restaurants.

            {
                Restaurant Starbucks = new Restaurant();
                Starbucks.Name = "StarBucks";
                Starbucks.Logo = "@drawable/logorestaurant_starbucks";
                Starbucks.Banner = "@drawable/banner_starbucks";
                Starbucks.Items = new ArrayList<>();

                // TODO: Add Items.

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

                // TODO: Add Items.

                {
                    Item BarbecueBacon = new Item();
                    BarbecueBacon.Name = "Barbecue Bacon";
                    BarbecueBacon.Description = "Adicionamos no nosso WHOPPER® um delicioso molho barbecue e fatias super crocantes de bacon. Resultado: Perfeição! Imagem meramente ilustrativa.";
                    BarbecueBacon.Image = "@drawable/image_barbecue_bacon";
                    BarbecueBacon.Category = "Sanduiches";
                    BarbecueBacon.Price = 29;

                    BurgerKing.Items.add(BarbecueBacon);
                }
                {
                    Item PaletaSuina = new Item();
                    PaletaSuina.Name = "Paleta Suína";
                    PaletaSuina.Description = "O pão com gergelim do WHOPPER®, nossa maionese de fabricação própria, alface e tomate cortados na hora, aquela nossa cebola crocante como toda Onion Rings deve ser, junto do nosso delicioso molho Furioso e queijo.";
                    PaletaSuina.Image = "@drawable/image_barbecue_bacon";
                    PaletaSuina.Category = "Sanduiches";
                    PaletaSuina.Price = 30;

                    BurgerKing.Items.add(PaletaSuina);
                }
                {
                    Item MegaStacker4 = new Item();
                    MegaStacker4.Name = "Mega Stacker 4.0";
                    MegaStacker4.Description = "Muita carne, muito bacon e muito queijo. Para você se deliciar com seus ingredientes favoritos! Imagem meramente ilustrativa.";
                    MegaStacker4.Image = "@drawable/image_mega_stacker4";
                    MegaStacker4.Category = "Sanduiches";
                    MegaStacker4.Price = 40;

                    BurgerKing.Items.add(MegaStacker4);
                }
                {
                    Item RodeioDuplo = new Item();
                    RodeioDuplo.Name = "Rodeio Duplo";
                    RodeioDuplo.Description = "Dois deliciosos hambúrgueres grelhados no fogo como churrasco, queijo derretido, onion rings, molho barbecue e maionese BK®. Imagem meramente ilustrativa.";
                    RodeioDuplo.Image = "@drawable/image_rodeio_duplo";
                    RodeioDuplo.Category = "Sanduiches";
                    RodeioDuplo.Price = 25;

                    BurgerKing.Items.add(RodeioDuplo);
                }


                PUCPR.University.Restaurants.add(BurgerKing);
            }
            {
                Restaurant Habibs = new Restaurant();
                Habibs.Name = "Habib's";
                Habibs.Logo = "@drawable/logorestaurant_habibs";
                Habibs.Banner = "@drawable/banner_habibs";
                Habibs.Items = new ArrayList<>();

                // TODO: Add Items.

                {
                    Item EsfihaCalab = new Item();
                    EsfihaCalab.Name = "Esfiha de Calabresa";
                    EsfihaCalab.Description = "BIB'SFIHA DE CALABRESA";
                    EsfihaCalab.Image = "@drawable/image_calab";
                    EsfihaCalab.Category = "BIB'SFIHAS";
                    EsfihaCalab.Price = 2.88;

                    Habibs.Items.add(EsfihaCalab);
                }
                {
                    Item EsfihaFrango = new Item();
                    EsfihaFrango.Name = "Esfiha de Frango";
                    EsfihaFrango.Description = "BIB'SFIHA DE FRANGO";
                    EsfihaFrango.Image = "@drawable/image_esfiha_frango";
                    EsfihaFrango.Category = "BIB'SFIHAS";
                    EsfihaFrango.Price = 2.54;

                    Habibs.Items.add(EsfihaFrango);
                }
                {
                    Item EsfihaQueijo = new Item();
                    EsfihaQueijo.Name = "Esfiha de Queijo";
                    EsfihaQueijo.Description = "BIB'SFIHA DE QUEIJO";
                    EsfihaQueijo.Image = "@drawable/image_esfiha_queijo";
                    EsfihaQueijo.Category = "BIB'SFIHAS";
                    EsfihaQueijo.Price = 3.78;

                    Habibs.Items.add(EsfihaQueijo);
                }
                {
                    Item EsfihaDoceLeite = new Item();
                    EsfihaDoceLeite.Name = "Esfiha de Doce de Leite";
                    EsfihaDoceLeite.Description = "BIB'SFIHA FOLHADA DE DOCE DE LEITE";
                    EsfihaDoceLeite.Image = "@drawable/image_esfiha_doce_leite";
                    EsfihaDoceLeite.Category = "BIB'SFIHAS";
                    EsfihaDoceLeite.Price = 6.95;

                    Habibs.Items.add(EsfihaDoceLeite);
                }


                PUCPR.University.Restaurants.add(Habibs);
            }
            {
                Restaurant CacauShow = new Restaurant();
                CacauShow.Name = "Cacau Show";
                CacauShow.Logo = "@drawable/logorestaurant_cacaushow";
                CacauShow.Banner = "@drawable/banner_cacau";
                CacauShow.Items = new ArrayList<>();

                // TODO: Add Items.

                {
                    Item BenditoCacaoSlack = new Item();
                    BenditoCacaoSlack.Name = "Bendito Cacao Slack";
                    BenditoCacaoSlack.Description = "Para quem adora sentir o sabor do chocolate intenso, numa versão exclusiva para passar no pão, na torrada, no biscoito, ou dar aquela boa colherada mesmo.";
                    BenditoCacaoSlack.Image = "@drawable/image_bendito_cacao";
                    BenditoCacaoSlack.Category = "Doce";
                    BenditoCacaoSlack.Price = 32.90;

                    CacauShow.Items.add(BenditoCacaoSlack);
                }
                {
                    Item MomentoLacreme = new Item();
                    MomentoLacreme.Name = "Momento Lacreme";
                    MomentoLacreme.Description = "O Momento laCreme é composto por diversas meias trufas com 6,75g cada, de chocolate maciço.";
                    MomentoLacreme.Image = "@drawable/image_momento_lacreme";
                    MomentoLacreme.Category = "Doce";
                    MomentoLacreme.Price = 29.90;

                    CacauShow.Items.add(MomentoLacreme);
                }
                {
                    Item DrageadoLanutAvela = new Item();
                    DrageadoLanutAvela.Name = "Drageado Lanut Avelã";
                    DrageadoLanutAvela.Description = "Pedaços de avelã torrada, levemente crocante envolta no delicioso chocolate ao leite, coberta com chocolate em pó.";
                    DrageadoLanutAvela.Image = "@drawable/image_drageado_lanut";
                    DrageadoLanutAvela.Category = "Doce";
                    DrageadoLanutAvela.Price = 24.90;

                    CacauShow.Items.add(DrageadoLanutAvela);
                }
                {
                    Item TableteBenditoCacao85 = new Item();
                    TableteBenditoCacao85.Name = "Tablete Bendito 85% Cacau";
                    TableteBenditoCacao85.Description = "Para quem gosta dos sabores mais intensos, este tablete é o ideal. Chocolate com 85% de cacau, é a fome pelo novo, a paixão por conhecer mais. Experimente novas sensações!";
                    TableteBenditoCacao85.Image = "@drawable/image_tablete_bendito";
                    TableteBenditoCacao85.Category = "Doce";
                    TableteBenditoCacao85.Price = 17.90;

                    CacauShow.Items.add(TableteBenditoCacao85);
                }

                PUCPR.University.Restaurants.add(CacauShow);
            }
            {
                Restaurant Giraffas = new Restaurant();
                Giraffas.Name = "Giraffas";
                Giraffas.Logo = "@drawable/logorestaurantgiraffas";
                Giraffas.Banner = "@drawable/banner_giraffas";
                Giraffas.Items = new ArrayList<>();

                // TODO: Add Items.

                {
                    Item Bisteca = new Item();
                    Bisteca.Name = "Churrasquito de Bisteca";
                    Bisteca.Description = "Uma deliciosa pedida: 1 bisteca (aprox.. 120g) e 1 linguiça suína (aprox.. 60g). Sugestão: molho madeira.";
                    Bisteca.Image = "image_bisteca";
                    Bisteca.Category = "Churrasco";
                    Bisteca.Price = 54.99;

                    Giraffas.Items.add(Bisteca);
                }
                {
                    Item Coxxao = new Item();
                    Coxxao.Name = "Churrasco de Coxxão";
                    Coxxao.Description = "1 porção de coxa e sobrecoxa desossadas e temperadas (aprox. 195 g). Acompanha 2 linguiças suínas (aprox.60 g cada).";
                    Coxxao.Image = "image_coxxao";
                    Coxxao.Category = "Churrasco";
                    Coxxao.Price = 60.99;

                    Giraffas.Items.add(Coxxao);
                }
                {
                    Item BistecasSuinas = new Item();
                    BistecasSuinas.Name = "Bistecas Suínas";
                    BistecasSuinas.Description = "2 bistecas suínas temperadas no capricho (aprox. 120 g). Acompanha 1 linguiça suína (aprox. 60g).";
                    BistecasSuinas.Image = "image_bistecas_duinas";
                    BistecasSuinas.Category = "Churrasco";
                    BistecasSuinas.Price = 52.99;

                    Giraffas.Items.add(BistecasSuinas);
                }
                {
                    Item Picanha = new Item();
                    Picanha.Name = "Churrasco de Picanha";
                    Picanha.Description = "1 generoso bife da picanha maturada (aprox 100 g) com o ponto à sua escolha. Acompanha 2 linguiças suínas (aprox 60 g cada).";
                    Picanha.Image = "image_picanha";
                    Picanha.Category = "Churrasco";
                    Picanha.Price = 70.99;

                    Giraffas.Items.add(Picanha);
                }

                PUCPR.University.Restaurants.add(Giraffas);
            }
            {
                Restaurant KFC = new Restaurant();
                KFC.Name = "Kentucky Fried Chicken";
                KFC.Logo = "@drawable/logorestaurant_kfc";
                KFC.Banner = "@drawable/banner_kfc";
                KFC.Items = new ArrayList<>();

                // TODO: Add Items.

                {
                    Item BaldeFrango = new Item();
                    BaldeFrango.Name = "Pedaços de Frango";
                    BaldeFrango.Description = "Deliciosos pedaços de frango, empanados com a Receita Secreta, Receita Crocante ou meio a meio.";
                    BaldeFrango.Image = "@drawable/image_baldekfc";
                    BaldeFrango.Category = "Baldes";
                    BaldeFrango.Price = 35.99;

                    KFC.Items.add(BaldeFrango);
                }
                {
                    Item WowBoxDoubleCrunch = new Item();
                    WowBoxDoubleCrunch.Name = "Wow Box Double Crunch";
                    WowBoxDoubleCrunch.Description = "Aqui é você quem manda: o que vai querer no seu Wow Box além do Double Crunch? 1 pedaço ou 1 tirinha?";
                    WowBoxDoubleCrunch.Image = "@drawable/image_wow_box_double_crunch";
                    WowBoxDoubleCrunch.Category = "Box";
                    WowBoxDoubleCrunch.Price = 55.99;

                    KFC.Items.add(WowBoxDoubleCrunch);
                }
                {
                    Item BigBox = new Item();
                    BigBox.Name = "Big Box";
                    BigBox.Description = "Com o Big Box KFC, você escolhe seu sanduíche, 2 pedaços ou 2 tirinhas, com batata frita e refrigerante.";
                    BigBox.Image = "@drawable/image_bigbox";
                    BigBox.Category = "Box";
                    BigBox.Price = 82.99;

                    KFC.Items.add(BigBox);
                }
                {
                    Item WowBoxDoubleBBQ = new Item();
                    WowBoxDoubleBBQ.Name = "Wow Box Double BBQ";
                    WowBoxDoubleBBQ.Description = "Wow! Conseguimos deixar o Double Crunch BBQ ainda melhor. Foi só colocar o sanduíche dentro de um box cheio de batata frita e ainda acrescentar mais 1 pedaço ou 1 tirinha, você escolhe.";
                    WowBoxDoubleBBQ.Image = "@drawable/image_bbq";
                    WowBoxDoubleBBQ.Category = "Box";
                    WowBoxDoubleBBQ.Price = 75.99;

                    KFC.Items.add(WowBoxDoubleBBQ);
                }


                PUCPR.University.Restaurants.add(KFC);
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

            {
                Restaurant KFC = new Restaurant();
                KFC.Name = "Kentucky Fried Chicken";
                KFC.Logo = "@drawable/logorestaurant_kfc";
                KFC.Banner = "@drawable/banner_kfc";
                KFC.Items = new ArrayList<>();

                // TODO: Add Items.

                {
                    Item BaldeFrango = new Item();
                    BaldeFrango.Name = "Pedaços de Frango";
                    BaldeFrango.Description = "Deliciosos pedaços de frango, empanados com a Receita Secreta, Receita Crocante ou meio a meio.";
                    BaldeFrango.Image = "@drawable/image_baldekfc";
                    BaldeFrango.Category = "Baldes";
                    BaldeFrango.Price = 35.99;

                    KFC.Items.add(BaldeFrango);
                }
                {
                    Item WowBoxDoubleCrunch = new Item();
                    WowBoxDoubleCrunch.Name = "Wow Box Double Crunch";
                    WowBoxDoubleCrunch.Description = "Aqui é você quem manda: o que vai querer no seu Wow Box além do Double Crunch? 1 pedaço ou 1 tirinha?";
                    WowBoxDoubleCrunch.Image = "@drawable/image_wow_box_double_crunch";
                    WowBoxDoubleCrunch.Category = "Box";
                    WowBoxDoubleCrunch.Price = 55.99;

                    KFC.Items.add(WowBoxDoubleCrunch);
                }
                {
                    Item BigBox = new Item();
                    BigBox.Name = "Big Box";
                    BigBox.Description = "Com o Big Box KFC, você escolhe seu sanduíche, 2 pedaços ou 2 tirinhas, com batata frita e refrigerante.";
                    BigBox.Image = "@drawable/image_bigbox";
                    BigBox.Category = "Box";
                    BigBox.Price = 82.99;

                    KFC.Items.add(BigBox);
                }
                {
                    Item WowBoxDoubleBBQ = new Item();
                    WowBoxDoubleBBQ.Name = "Wow Box Double BBQ";
                    WowBoxDoubleBBQ.Description = "Wow! Conseguimos deixar o Double Crunch BBQ ainda melhor. Foi só colocar o sanduíche dentro de um box cheio de batata frita e ainda acrescentar mais 1 pedaço ou 1 tirinha, você escolhe.";
                    WowBoxDoubleBBQ.Image = "@drawable/image_bbq";
                    WowBoxDoubleBBQ.Category = "Box";
                    WowBoxDoubleBBQ.Price = 75.99;

                    KFC.Items.add(WowBoxDoubleBBQ);
                }


                UNICURITIBA.University.Restaurants.add(KFC);
            }
            {
                Restaurant PizzaHut = new Restaurant();
                PizzaHut.Name = "Pizza Hut";
                PizzaHut.Logo = "@drawable/logorestaurant_pizzahut";
                PizzaHut.Banner = "@drawable/banner_pizzahut";
                PizzaHut.Items = new ArrayList<>();

                // TODO: Add Items.

                {
                    Item PizzaCountry = new Item();
                    PizzaCountry.Name = "Pizza Country";
                    PizzaCountry.Description = "Queijo Hut, bacon, frango e cream cheese";
                    PizzaCountry.Image = "@drawable/image_pizza_country";
                    PizzaCountry.Category = "Pizza";
                    PizzaCountry.Price = 104.99;

                    PizzaHut.Items.add(PizzaCountry);
                }
                {
                    Item CornBacon = new Item();
                    CornBacon.Name = "Corn & Bacon";
                    CornBacon.Description = "Mais uma surpreendente receita Pizza Hut. Queijo Hut, fatias suculentas do melhor bacon e milho selecionado";
                    CornBacon.Image = "@drawable/image_corn_bacon";
                    CornBacon.Category = "Pizza";
                    CornBacon.Price = 100.99;

                    PizzaHut.Items.add(CornBacon);
                }
                {
                    Item Supreme = new Item();
                    Supreme.Name = "Supreme";
                    Supreme.Description = "Molho de tomate, pepperoni, cebola, pimentão, champignon, carnes bovina e suína e queijo Hut";
                    Supreme.Image = "@drawable/image_supreme";
                    Supreme.Category = "Pizza";
                    Supreme.Price = 95.99;

                    PizzaHut.Items.add(Supreme);
                }
                {
                    Item Pepperoni = new Item();
                    Pepperoni.Name = "Pepperoni";
                    Pepperoni.Description = "Fatias de pepperoni servidas sobre generosa camada de queijo hut e molho de tomate";
                    Pepperoni.Image = "@drawable/image_pepperoni";
                    Pepperoni.Category = "Pizza";
                    Pepperoni.Price = 89.99;

                    PizzaHut.Items.add(Pepperoni);
                }

                UNICURITIBA.University.Restaurants.add(PizzaHut);
            }
            {
                Restaurant Giraffas = new Restaurant();
                Giraffas.Name = "Giraffas";
                Giraffas.Logo = "@drawable/logorestaurantgiraffas";
                Giraffas.Banner = "@drawable/banner_giraffas";
                Giraffas.Items = new ArrayList<>();

                // TODO: Add Items.

                {
                    Item Bisteca = new Item();
                    Bisteca.Name = "Churrasquito de Bisteca";
                    Bisteca.Description = "Uma deliciosa pedida: 1 bisteca (aprox.. 120g) e 1 linguiça suína (aprox.. 60g). Sugestão: molho madeira.";
                    Bisteca.Image = "image_bisteca";
                    Bisteca.Category = "Churrasco";
                    Bisteca.Price = 54.99;

                    Giraffas.Items.add(Bisteca);
                }
                {
                    Item Coxxao = new Item();
                    Coxxao.Name = "Churrasco de Coxxão";
                    Coxxao.Description = "1 porção de coxa e sobrecoxa desossadas e temperadas (aprox. 195 g). Acompanha 2 linguiças suínas (aprox.60 g cada).";
                    Coxxao.Image = "image_coxxao";
                    Coxxao.Category = "Churrasco";
                    Coxxao.Price = 60.99;

                    Giraffas.Items.add(Coxxao);
                }
                {
                    Item BistecasSuinas = new Item();
                    BistecasSuinas.Name = "Bistecas Suínas";
                    BistecasSuinas.Description = "2 bistecas suínas temperadas no capricho (aprox. 120 g). Acompanha 1 linguiça suína (aprox. 60g).";
                    BistecasSuinas.Image = "image_bistecas_duinas";
                    BistecasSuinas.Category = "Churrasco";
                    BistecasSuinas.Price = 52.99;

                    Giraffas.Items.add(BistecasSuinas);
                }
                {
                    Item Picanha = new Item();
                    Picanha.Name = "Churrasco de Picanha";
                    Picanha.Description = "1 generoso bife da picanha maturada (aprox 100 g) com o ponto à sua escolha. Acompanha 2 linguiças suínas (aprox 60 g cada).";
                    Picanha.Image = "image_picanha";
                    Picanha.Category = "Churrasco";
                    Picanha.Price = 70.99;

                    Giraffas.Items.add(Picanha);
                }

                UNICURITIBA.University.Restaurants.add(Giraffas);
            }
            {
                Restaurant Starbucks = new Restaurant();
                Starbucks.Name = "StarBucks";
                Starbucks.Logo = "@drawable/logorestaurant_starbucks";
                Starbucks.Banner = "@drawable/banner_starbucks";
                Starbucks.Items = new ArrayList<>();

                // TODO: Add Items.

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

                UNICURITIBA.University.Restaurants.add(Starbucks);
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


                UNICURITIBA.University.Restaurants.add(McDonalds);
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

                UNICURITIBA.University.Restaurants.add(SubWay);
            }

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
