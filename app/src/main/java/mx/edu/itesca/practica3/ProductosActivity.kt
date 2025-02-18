package mx.edu.itesca.practica3

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductosActivity : AppCompatActivity() {
    var menu: ArrayList<Product> = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productos)

        var imageView : ImageView = findViewById(R.id.imageView)
        var menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(imageView, menuOption)


        var listView: ListView = findViewById(R.id.listView) as ListView

        var adaptador : AdaptadorProductos = AdaptadorProductos(this, menu)
        listView.adapter = adaptador

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }




    }
    fun agregarProductos(imageView: ImageView, menuOption: String?){
        when(menuOption){
            "Tacos"-> {
                menu.add(Product("Taco Tradicional", R.drawable.taco, "Traditional Taco (1)", 2.79))

            }
            "Antojitos"-> {
                imageView.setImageResource(R.drawable.antojitos)
                menu.add(
                    Product(
                        "Quesadillas",
                        R.drawable.quesadillas,
                        "Rellenas con su carne favorita, servidas con ensalada. Filled with your choise of meat, served with salad.",
                        5.99
                    )
                )
                menu.add(
                    Product(
                        "Huaraches",
                        R.drawable.huaraches,
                        "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema - Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream.",
                        10.99
                    )
                )
                menu.add(
                    Product(
                        "Gringas",
                        R.drawable.gringas,
                        "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema - Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream.",
                        7.99
                    )
                )
                menu.add(
                    Product(
                        "Sincronizadas",
                        R.drawable.sincronizadas,
                        "Tortilla de harina rellena con queso y jamón. Acompañada de lechuga, crema y guacamole - Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.",
                        7.99
                    )
                )
                menu.add(
                    Product(
                        "Sopes",
                        R.drawable.sopes,
                        "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema - Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, and sour cream.",
                        3.79
                    )
                )
                menu.add(
                    Product(
                        "Tostadas",
                        R.drawable.tostadas,
                        "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate - Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes.",
                        4.59
                    )
                )
                menu.add(Product("Coctel de Camaron", R.drawable.coctel, "Shrimp cocktail", 16.49))
            }
            "Combinaciones"->{
                imageView.setImageResource(R.drawable.combinations)
                menu.add(Product("Mojarra",R.drawable.mojarra, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.", 17.99))
                menu.add(Product("Ceviche",R.drawable.ceviche, "Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips", 6.99))
                menu.add(Product("Botana de camarones al mojo de ajo",R.drawable.botanacamarones,"",19.99))
                menu.add(Product("Botana de camarones al mojo de ajo",R.drawable.botanacamarones,"",19.99))

            }
            "Especialidades"->{
                imageView.setImageResource(R.drawable.especialidades)
                menu.add(Product("Burrito Pepe",R.drawable.burritopepe, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.", 17.99))
                menu.add(Product("Burritos portales",R.drawable.burritosportales, "Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips", 6.99))
                menu.add(Product("Combinacion taco",R.drawable.combinationtaco,"",19.99))
                menu.add(Product("Combinacion burros",R.drawable.cominationburros,"",19.99))

            }

            "Tortas"->{
                imageView.setImageResource(R.drawable.tortas)
                menu.add(Product("Torta",R.drawable.torta, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.", 17.99))
                menu.add(Product("Torta mixta",R.drawable.tortamixta, "Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips", 6.99))
                menu.add(Product("Torta milanesa",R.drawable.tortamilanesa,"",19.99))
                menu.add(Product("Torta cubana",R.drawable.tortacubana,"",19.99))

            }

            "Sopas"->{
                imageView.setImageResource(R.drawable.sopas)
                menu.add(Product("Sopa mariscos",R.drawable.sopamariscos, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.", 17.99))
                menu.add(Product("Pozole",R.drawable.pozole, "Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips", 6.99))
                menu.add(Product("Menudo",R.drawable.menudo,"",19.99))
                menu.add(Product("Caldo res",R.drawable.caldores,"",19.99))

            }
            "Drinks"->{
                imageView.setImageResource(R.drawable.drinks)
                menu.add(Product("Jarritos",R.drawable.jarritos, "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.", 17.99))
                menu.add(Product("Caguama",R.drawable.caguama, "Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips", 6.99))
                menu.add(Product("Cubetazo",R.drawable.cubetazo,"",19.99))
                menu.add(Product("Cubetas six",R.drawable.cubetasix,"",19.99))

            }
        }

    }

    private class AdaptadorProductos: BaseAdapter{
        var productos=ArrayList<Product>()
        var contexto: Context?=null

        constructor(contexto: Context, producto: ArrayList<Product>){
            this.productos=producto
            this.contexto=contexto
        }

        override fun getCount(): Int {
            return productos.size
        }

        override fun getItem(p0: Int): Any {
            return productos[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var prod=productos[p0]
            var inflador=LayoutInflater.from(contexto)
            var vista=inflador.inflate(R.layout.producto_view, null)

            var imagen=vista.findViewById<ImageView>(R.id.producto_img)
            var nombre=vista.findViewById<TextView>(R.id.producto_nombre)
            var desc=vista.findViewById<TextView>(R.id.producto_desc)
            var precio=vista.findViewById<TextView>(R.id.producto_precio)

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText(prod.description)
            precio.setText("${prod.price}")
            return vista

        }
    }
}