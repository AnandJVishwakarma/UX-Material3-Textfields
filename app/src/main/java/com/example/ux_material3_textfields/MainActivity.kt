package com.example.ux_material3_textfields

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Label
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ux_material3_textfields.ui.theme.UXMaterial3TextfieldsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UXMaterial3TextfieldsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        var filledText by remember {
                            mutableStateOf("")
                        }
                        TextField(
                            value = filledText,
                            onValueChange = { filledText = it },
                            textStyle = TextStyle(
                                textAlign = TextAlign.Right
                            ),
//                            label = { Text(text = "Enter Name: ")},
                            placeholder = { Text(text = "Enter Name")},
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.Person,
                                    contentDescription = "Name"
                                )
                            },
//                            trailingIcon = {
//                                Icon(
//                                    imageVector = Icons.Outlined.Search,
//                                    contentDescription = "Name"
//                                )
//                            },
                            prefix = {
                                Text(text = "Mr./Mrs.")
                            },
                            suffix = {
                                Text(text = "Vishwakarma")
                            },
                            supportingText = {
                                Text(text = "*reqiured")
                            },
                            isError = true,
                            visualTransformation = PasswordVisualTransformation(),
                            keyboardOptions = KeyboardOptions(
                                autoCorrect = true,
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next,
                            ),
                            keyboardActions = KeyboardActions(
                                onNext = {
                                    println("Hello world")
                                }
                            )
                        )
                        Spacer(modifier = Modifier.height(20.dp))

                        var outlinedText by remember {
                            mutableStateOf("")
                        }
                        OutlinedTextField(
                            value = outlinedText,
                            onValueChange = { outlinedText = it },
                            textStyle = TextStyle(
                                textAlign = TextAlign.Right
                            ),
//                            label = { Text(text = "Enter Name: ")},
                            placeholder = { Text(text = "Enter Name")},
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.Person,
                                    contentDescription = "Name"
                                )
                            },
//                            trailingIcon = {
//                                Icon(
//                                    imageVector = Icons.Outlined.Search,
//                                    contentDescription = "Name"
//                                )
//                            },
                            prefix = {
                                Text(text = "Mr./Mrs.")
                            },
                            suffix = {
                                Text(text = "Vishwakarma")
                            },
                            supportingText = {
                                Text(text = "*reqiured")
                            },
                            isError = true,
                            visualTransformation = PasswordVisualTransformation(),
                            keyboardOptions = KeyboardOptions(
                                autoCorrect = true,
                                keyboardType = KeyboardType.Number,
                                imeAction = ImeAction.Next,
                            ),
                            keyboardActions = KeyboardActions(
                                onNext = {
                                    println("Hello world")
                                }
                            )
                        )
                    }

                }

            }
        }
    }
}
