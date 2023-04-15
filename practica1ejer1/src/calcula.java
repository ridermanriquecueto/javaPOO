public class calcula {
    public int num1;
    public int num2;
    public String operacion;

    public calcula(int num1, int num2, String operacion) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    public int operar(){
        if(operacion=="suma"){
            return num1+num2;

        }
        else if(operacion=="resta"){
            return num1-num2;
        }
        else if (operacion=="multiplicacion"){
            return num1*num2;
        } else if (operacion=="division") {
            return num1/num2;

        }
        else
            return 0;
    }
}
