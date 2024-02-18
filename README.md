# Microserviço responsável por salvar transações bancarias de clientes. 

Transações de movimentações de contas, saldos e logs.

Salva as transações no mongodb na nuvem (Data | Cloud MongoDB Cloud Atlas).

Endereço para acesso as filas: http://localhost:15672/#/queues

![image](https://github.com/guigomes91/bank-client-transaction/assets/44264050/af5726fc-bfc4-4dfa-997b-3267405ed49f)

Binding da fila para o listener:

![image](https://github.com/guigomes91/bank-client-transaction/assets/44264050/ce916608-6c1e-482e-bb9e-2a4fe6b758b4)

Coleções no mongodb após publicação pelo serviço bank-conta ao realizar uma movimentação bancaria:

![image](https://github.com/guigomes91/bank-client-transaction/assets/44264050/4b9dc427-7722-4c7e-9e37-513c38a41632)


