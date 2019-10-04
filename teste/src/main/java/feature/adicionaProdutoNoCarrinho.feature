#language: pt

Funcionalidade: Adicionar um produto no carrinho de compras
  Como usuário do sistema
  Eu quero escolher um produto
  Para que eu possa adicionar no carrinho de compras

  Cenário: Adicionar um produto no carrinho
    Dado que eu faco uma busca por um produto
    E abro seus detalhes
    Quando adiciono no carrinho de compras
    Então o produto aparece no carrinho
