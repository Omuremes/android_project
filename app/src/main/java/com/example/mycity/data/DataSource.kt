package com.example.mycity.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import com.example.mycity.R

object DataSource {
    val categories = listOf(
        Category(1, "Restaurants", Icons.Filled.Home),
        Category(2, "Parks", Icons.Filled.Place),
        Category(3, "Museums", Icons.Filled.Info)
    )

    val places = listOf(
        Place(
            id = 1, categoryId = 1, name = "Navat", description = "Традиционная кыргызская кухня в стильном интерьере. Идеально для семейного ужина.", 
            address = "Улица Курманжан Датка, 242", phone = "+996 551-6... Показать телефоны", website = "navat.kg", schedule = "Ежедневно с 10:00 до 24:00",
            latitude = 42.8756, longitude = 74.6295,
            ratingAvg = 4.7, ratingCount = 1738,
            imagesRes = listOf(R.drawable.navat_1, R.drawable.navat_2, R.drawable.navat_3),
            reviews = listOf(Review("Айдар", "Очень вкусно! Бешбармак великолепен.", 5), Review("Елена", "Отличный сервис, но вечером много людей.", 4))
        ),
        Place(
            id = 2, categoryId = 1, name = "Faiza", description = "Легендарный фаст-фуд Бишкека. Быстро, сытно и по-домашнему вкусно.", 
            address = "Жибек Жолу, 555", phone = "+996 312 34 56 78", website = "faiza.kg", schedule = "Ежедневно с 09:00 до 22:00",
            latitude = 42.8839, longitude = 74.5888,
            ratingAvg = 4.8, ratingCount = 3450,
            imagesRes = listOf(R.drawable.faiza_1, R.drawable.faiza_2, R.drawable.faiza_3),
            reviews = listOf(Review("Максат", "Лучшие лагман и манты в городе!", 5), Review("Нурлан", "Очереди часто большие, но оно того стоит.", 4))
        ),
        Place(
            id = 3, categoryId = 1, name = "Arzu", description = "Уютный ресторан с аутентичной восточной и европейской кухней.", 
            address = "Тоголок Молдо, 13", phone = "+996 555 12 34 56", website = "arzu.kg", schedule = "Ежедневно с 11:00 до 23:00",
            latitude = 42.8797, longitude = 74.5954,
            ratingAvg = 4.6, ratingCount = 890,
            imagesRes = listOf(R.drawable.arzu_1, R.drawable.arzu_2, R.drawable.arzu_3),
            reviews = listOf(Review("Динара", "Шикарная атмосфера, вежливые официанты.", 5))
        ),
        Place(
            id = 4, categoryId = 2, name = "Бульвар Эркиндик", description = "Излюбленное место отдыха горожан. Широкие аллеи, вековые дубы и атмосфера спокойствия в центре Бишкека.", 
            address = "Бульвар Эркиндик", phone = "", website = "", schedule = "Круглосуточно",
            latitude = 42.8753, longitude = 74.6063,
            ratingAvg = 4.9, ratingCount = 2105,
            imagesRes = listOf(R.drawable.bulvar_erkidic_1, R.drawable.bulvar_erkidic_2, R.drawable.bulvar_erkidic_3),
            reviews = listOf(Review("Карина", "Самое любимое место для прогулок весной и осенью.", 5), Review("Айнура", "Очень атмосферно, много художников и отличные кофейни рядом.", 5))
        ),
        Place(
            id = 5, categoryId = 2, name = "Парк им. И.В. Панфилова", description = "Главный парк аттракционов города Бишкек. Колесо обозрения, множество детских площадок.", 
            address = "Улица Фрунзе, 370", phone = "+996 509-000-000", website = "Instagram", schedule = "Сегодня с 10:00 до 23:00",
            latitude = 42.8799, longitude = 74.6001,
            ratingAvg = 4.7, ratingCount = 1738,
            imagesRes = listOf(R.drawable.panfilova_1, R.drawable.panfilova_2, R.drawable.panfilova_3),
            reviews = listOf(Review("Таалай", "Дети обожают этот парк! Но в выходные очень шумно.", 4), Review("Салтанат", "Отличное колесо обозрения, красивый вид на город.", 5))
        ),
        Place(
            id = 6, categoryId = 3, name = "Национальный исторический музей КР", description = "Один из крупнейших музеев в Центральной Азии. Богатая коллекция экспонатов, рассказывающая об истории и культуре кыргызского народа с древнейших времен до наших дней.", 
            address = "Площадь Ала-Тоо, Чуй 114", phone = "+996 312 62-60-90", website = "Instagram: @history_museum_kg", schedule = "Вт-Вс с 10:00 до 18:00, Пн - выходной",
            latitude = 42.8770, longitude = 74.6038,
            ratingAvg = 4.8, ratingCount = 845,
            imagesRes = listOf(R.drawable.museums_1, R.drawable.museums_2, R.drawable.museums_3),
            reviews = listOf(Review("Урмат", "Очень современный и интересный музей после реконструкции.", 5), Review("Мария", "Много ценных артефактов, обязательно стоит посетить туристам.", 5))
        ),
        Place(
            id = 7, categoryId = 3, name = "Кыргызский национальный музей изобразительных искусств им. Г. Айтиева", description = "Главная художественная сокровищница Кыргызстана. Здесь собраны лучшие произведения живописи, скульптуры и декоративно-прикладного искусства кыргызских мастеров.", 
            address = "Юсупа Абдрахманова, 196", phone = "+996 312 66-16-23", website = "Instagram: @knmii_gapar_aitiev", schedule = "Вт-Вс с 10:00 до 18:00, Пн - выходной",
            latitude = 42.8789, longitude = 74.6146,
            ratingAvg = 4.6, ratingCount = 512,
            imagesRes = listOf(R.drawable.museumsv2_1, R.drawable.museumsv2_2, R.drawable.museumsv2_3),
            reviews = listOf(Review("Камила", "Отличные временные выставки и богатая постоянная экспозиция.", 5), Review("Азат", "Тихое и спокойное место в центре города.", 4))
        )
    )
}
