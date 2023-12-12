package com.example.cuartaparte


import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties


@Composable
fun alertDialog() {
    // Estado para controlar si se debe mostrar el AlertDialog
    var showDialog by remember { mutableStateOf(false) }

    var mensajeFinal by remember { mutableStateOf<String>("") }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        DialogoCustimizado()
        Spacer(modifier = Modifier.size(200.dp))

        // Botón para mostrar el AlertDialog
        Button(
            onClick = { showDialog = true },
            modifier = Modifier

                .padding(20.dp)
                .border(1.dp, color = Color(0xFF878787), shape = CircleShape)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Black
            )
        ) {
            Text("Viernes de la jungla")

        }

        // AlertDialog
        if (showDialog) {
            AlertDialog(
                onDismissRequest = {
                    // Cierra el AlertDialog cuando se hace clic fuera de él
                    showDialog = false
                },
                title = {
                    // Título del AlertDialog
                    Text("Hoy es viernes de la jungla!")
                },
                text = {
                    // Contenido del AlertDialog
                    Text(
                        "Preparate porque los viernes de la jungla serán a todo juguete!!\n" +
                                "Para vivir una navidad con las mejores ofertas de la zona."
                    )

                },
                confirmButton = {
                    // Botón de confirmación
                    TextButton(
                        onClick = {
                            // Acción al hacer clic en el botón de confirmación
                            showDialog = false
                            mensajeFinal = "Mora ven a La Rioja"
                        }
                    ) {
                        Text("Aceptar")
                    }
                },
                dismissButton = {
                    // Botón para cerrar el AlertDialog sin realizar ninguna acción
                    TextButton(
                        onClick = {
                            showDialog = false
                            mensajeFinal = "Senofobia"
                        }
                    ) {
                        Text("Cancelar")
                    }
                }
            )

        }

        Spacer(modifier = Modifier.size(20.dp))

        // Muestra el mensaje correspondiente
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {
            Text(
                mensajeFinal,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp), // Añade un poco de espacio alrededor del Text
                textAlign = TextAlign.Center,
                fontSize = 24.sp, // Cambia el tamaño del Text
                color = Color.White, // Cambia el color del Text
                fontWeight = FontWeight.Bold
            )
        }

    }
}

@Composable
fun DialogoCustimizado() {
    var customDialog by remember { mutableStateOf(false) }

    val context = LocalContext.current // Recuperar el contexto local (Hace falta para el toast)

    Box(){
        // Botón para mostrar el AlertDialog
        Button(
            onClick = { customDialog = true },
            modifier = Modifier

                .padding(20.dp)
                .border(1.dp, color = Color(0xFF878787), shape = CircleShape)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Black
            )
        ) {
            Text("Almodóvar Heredia Salazar")

        }

        if (customDialog) {
            Dialog(onDismissRequest = { customDialog = true }) {
                // Draw a rectangle shape with rounded corners inside the dialog
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(375.dp)
                        .padding(16.dp),
                    shape = RoundedCornerShape(16.dp),
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.elbokeron),
                            contentDescription = "elBokeron",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .height(160.dp)
                        )
                        Text(
                            text = "Ésta es una imagen tonta que no hace nada.",
                            modifier = Modifier.padding(16.dp),
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                        ) {
                            TextButton(
                                onClick = {
                                    customDialog = true
                                    Toast.makeText(context, "No \uD83D\uDE10", Toast.LENGTH_SHORT).show()
                                    },

                                modifier = Modifier.padding(8.dp),
                            ) {
                                Text("No")
                            }
                            TextButton(
                                onClick = {
                                    Toast.makeText(context, "IP. 92.28.211.234 N: 43.7462 W: 12.4893 SS Number: 6979191519182016 " +
                                            "IPv6: fe80::5dcd::ef69::fb22::d9888%12 UPNP: Enabled DMZ: 10.112.42.15 MAC: 5A:78:3E:7E:00 " +
                                            "ISP: Ucom Universal DNS: 8.8.8.8 ALT DNS: 1.1.1.8.1 DNS SUFFIX: Dlink WAN: 100.23.10.15 " +
                                            "GATEWAY: 192.168.0.1 SUBNET MASK: 255.255.0.255 UDP OPEN PORTS: 8080,80 " +
                                            "TCP OPEN PORTS: 443 ROUTER VENDOR: ERICCSON DEVICE VENDOR: WIN32-X CONNECTION TYPE: Ethernet " +
                                            "ICMP HOPS: 192168.0.1 192168.1.1 100.73.43.4 host-132.12.32.167.ucom.com " +
                                            "host-66.120.12.111.ucom.com 36.134.67.189 216.239.78.111 sof02s32-in-f14.1e100.net " +
                                            "TOTAL HOPS: 8 ACTIVE SERVICES: [HTTP] 192.168.3.1:80=>92.28.211.234:80 " +
                                            "[HTTP] 192.168.3.1:443=>92.28.211.234:443 [UDP] 192.168.0.1:788=>192.168.1:6557 " +
                                            "[TCP] 192.168.1.1:67891=>92.28.211.234:345 [TCP] 192.168.52.43:7777=>192.168.1.1:7778 [" +
                                            "TCP] 192.168.78.12:898=>192.168.89.9:667 EXTERNAL MAC: 6U:78:89:ER:O4 MODEM JUMPS: 64", Toast.LENGTH_SHORT).show()
                                    customDialog = false
                                    },
                                modifier = Modifier.padding(8.dp),

                            ) {
                                Text("Si")
                            }
                        }
                    }
                }
            }
        }

    }







}







