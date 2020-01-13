package com.example.insurancepremiumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.get
import androidx.core.view.isEmpty
//Author : Tsen Jing Sheng
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chkSmoke : CheckBox = findViewById(R.id.checkBoxSmoker)
        val radGroup : RadioGroup = findViewById(R.id.radioGroupGender)
        val radMale : RadioButton = findViewById(R.id.radioButtonMale)
        val radFemale : RadioButton = findViewById(R.id.radioButtonFemale)
        val txtPremium : TextView = findViewById(R.id.textViewPremium)
        val age : Spinner = findViewById(R.id.spinnerAge)
        val btnReset : Button = findViewById(R.id.buttonReset)
        btnReset.setOnClickListener{

            radGroup.clearCheck()
            chkSmoke.isChecked = false
            txtPremium.text = "Insurance Premium: "
        }
        val btnCalculate : Button = findViewById(R.id.buttonCalculate)
        btnCalculate.setOnClickListener{
            if(age.selectedItem.equals("Less than 17") ){
                if(radMale.isChecked){
                    if(chkSmoke.isChecked){
                        txtPremium.text = "Insurance Premium: RM60"
                    }
                    else{
                        txtPremium.text ="Insurance Premium: RM60"
                    }
                }
                else{
                    if(chkSmoke.isChecked){
                        txtPremium.text = "Insurance Premium: RM60"
                    }
                    else{
                        txtPremium.text="Insurance Premium: RM60"
                    }
                }

            }
            else if(age.selectedItem.equals("17 to 25")){
                if(radMale.isChecked){

                    if(chkSmoke.isChecked){
                        txtPremium.text = "Insurance Premium: RM220"
                    }
                    else{
                        txtPremium.text ="Insurance Premium: RM120"
                    }
                }
                else{
                    if(chkSmoke.isChecked){
                        txtPremium.text = "Insurance Premium: RM170"
                    }
                    else{
                        txtPremium.text="Insurance Premium: RM70"
                    }

                }
            }
            else if(age.selectedItem.equals("26 to 30")){
                if(radMale.isChecked){

                    if(chkSmoke.isChecked){
                        txtPremium.text = "Insurance Premium: RM340"
                    }
                    else{
                        txtPremium.text = "Insurance Premium: RM190"
                    }
                }
                else{
                    if(chkSmoke.isChecked){
                        txtPremium.text = "Insurance Premium: RM240"
                    }
                    else{
                        txtPremium.text = "Insurance Premium: RM90"
                    }

                }
            }
            else if(age.selectedItem.equals("31 to 40")){
                if(radMale.isChecked){

                    if(chkSmoke.isChecked){
                        txtPremium.text = "Insurance Premium: RM470"
                    }
                    else{
                        txtPremium.text ="Insurance Premium: RM270"
                    }
                }
                else{
                    if(chkSmoke.isChecked){
                        txtPremium.text = "Insurance Premium: RM320"
                    }
                    else{
                        txtPremium.text = "Insurance Premium: RM120"
                    }
                }
            }
            else if(age.selectedItem.equals("41 to 55")){
                if(radMale.isChecked){

                    if(chkSmoke.isChecked){
                        txtPremium.text = "Insurance Premium: RM600"
                    }
                    else{
                        txtPremium.text = "Insurance Premium: RM350"
                    }
                }
                else{
                    if(chkSmoke.isChecked){
                        txtPremium.text = "Insurance Premium: RM400"
                    }
                    else{
                        txtPremium.text = "Insurance Premium: RM150"
                    }

                }
            }
            else{
                if(radMale.isChecked){

                    if(chkSmoke.isChecked){
                        txtPremium.text = "Insurance Premium: RM650"
                    }
                    else{
                        txtPremium.text = "Insurance Premium: RM350"
                    }
                }
                else{
                    if(chkSmoke.isChecked){
                        txtPremium.text= "Insurance Premium: RM450"
                    }
                    else{
                        txtPremium.text = "Insurance Premium: RM150"
                    }

                }
            }
        }
    }
}
