package oop;

public class Main {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Рябчиков Владислав Владимирович", "Директор", "manager01@gmail.com", 46753849, 60000, 34);
        empArray[1] = new Employee("Павлов Владимир Александрович", "Менеджер", "pavlov123@gmail.com", 232466565, 40000, 37);
        empArray[2] = new Employee("Полозков Эдуард Валентинович", "Электрик", "svar1994@gmail.com", 94897732, 35000, 24);
        empArray[3] = new Employee("Малышкова Анна Ярославовна", "Бухгалтер", "anna154@gmail.com", 5678888, 45000, 55);
        empArray[4] = new Employee("Добровольская Марина Дмитриевна", "Уборщица", "dobro1509@gmail.com", 94897732, 25000, 24);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                System.out.println(empArray[i]);
            }
        }
    }
}


