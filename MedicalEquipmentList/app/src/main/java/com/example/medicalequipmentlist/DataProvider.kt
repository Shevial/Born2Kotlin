package com.example.medicalequipmentlist


object DataProvider {
    val medicalEquipmentList = listOf(
        Equip(
            name = "Ultrasound machine",
            manufacturer = "Philips Healthcare",
            lastCalibration = 10,
            image = "https://www.dhmaterialmedico.com/material-medico/fotos/ecografo-mindray-dp-10-sin-sonda-1606898963.jpg"
        ),
        Equip(
            name = "Ventilator",
            manufacturer = "GE Healthcare",
            lastCalibration = 10,
            image = "https://adiemed.es/1225-large_default/respirador-ventilador-para-uci-t6-con-carro.jpg"
        ),
        Equip(
            name = "Monitor",
            manufacturer = "Mindray",
            lastCalibration = 10,
            image = "data:image/jpeg;base64,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"
        ),
        Equip(
            name = "Defibrillator",
            manufacturer = "Philips Healthcare",
            lastCalibration = 10,
            image = "https://www.somatechnology.com/app/uploads/sites/2/2016/07/Stryker-Physio-Control-Lifepak-15-Defibrillator.jpg"
        ),
        Equip(
            name = "Electrocardiograph (ECG)",
            manufacturer = "Schiller",
            lastCalibration = 10,
            image = "data:image/jpeg;base64,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"
        )

    )
}