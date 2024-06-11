package org.example.lesson_2

 fun main(){
    val sumOfEmployee = 50
    val salaryOfEmployee = 300_000
    val sumOfIntern = 30
    val salaryOfIntern = 200_000

    val payForEmployee = sumOfEmployee * salaryOfEmployee
    val payForIntern = sumOfIntern * salaryOfIntern
    val allPayments = payForIntern + payForEmployee
    val averageSalary = allPayments / (sumOfEmployee + sumOfIntern)

    println("Расходы на выплату зарплаты постоянных сотрудников = $payForEmployee")
    println("Общие расходы по ЗП после прихода стажеров = $allPayments")
    println("Среднюю ЗП одного сотрудника после устройства стажеров = $averageSalary")
}