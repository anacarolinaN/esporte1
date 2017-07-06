public static void main(String[] args) {
        int a = 0, b, c, x = 0, y = 1, z, w = 0, soma=0, i = 0, g = 0, base, n;

        while (a < 4) {

            System.out.print("Apresentar os números da série Fibonacci=====1\n");
            System.out.print("Apresentar números primos====2\n");
            System.out.print("Apresentar números perfeitos====3\n");
            System.out.print("Sair do Programa====4\n");
            String teclado;
            teclado = JOptionPane.showInputDialog("Confirme a sua opção");
            a= Integer.parseInt(teclado);

    if (a == 1) {
                System.out.print("Fala ae o Intervalo, de 0 a algum número:\n");
                teclado = JOptionPane.showInputDialog("Confirme a sua opção");
                c= Integer.parseInt(teclado);

                while (soma <= c) {

                    soma = x + y;
                    x = y;
                    y = soma;
                    System.out.println(soma);
                    soma++;
                    if (soma >= c) {
                        return ;
                    }
                }
            }

            if (a == 2) {
                i = 3;
                System.out.print("Digite o número:");
                teclado = JOptionPane.showInputDialog("Confirme a sua opção");
                b= Integer.parseInt(teclado);
                for (soma = 2; soma <= b;) {
                    for (x = 2; x <= i - 1; x++) {
                        if (i % x == 0) {
                            break;
                        }
                        if (x == i) {
                            System.out.println(soma);
                            soma++;
                        }
                        i++;
                    }
                }
            }

            if (a == 3) {
                System.out.print("digite:");
                teclado = JOptionPane.showInputDialog("Confirme a sua opção");
                n= Integer.parseInt(teclado);

  
                for (i = 1; i <= n; i++) {
                    soma = 0;
                    for (x = 1; x < i; x++) {
                        if (i % x == 0) {
                            soma += x;
                        }
                    }

                    if (soma == i) {
                        {
                            System.out.println(i);
                        }
                    }
                }
            }
        }
        return;
    }
   
}
