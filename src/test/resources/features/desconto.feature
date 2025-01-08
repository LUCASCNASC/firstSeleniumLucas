# language: pt

@desconto
Funcionalidade: Receber o cupom da qazando
    Eu como usuário da qazando
    quero receber um cupom de desconto
    para comprar um curso com valor reduzido

    @gerar-cupom
    Cenário: Visualizar código de desconto
        Dado que estou no site da qazando
        Quando eu preencho meu e-mail
        E clico em ganhar cupom
        Então eu vejo o código de desconto

    @gerar-falha
    Cenário: Teste com falha
        Dado que eu tenho um cupom gerado
        Quando eu falho