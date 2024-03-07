# Digital Twins Tech
API do projeto Digital Twins Tech - Loja de celulares, tablets e notebooks

## Tarefas

- [ ] CRUD de Produtos
- [ ] CRUD de Usuário
- [ ] CRUD de Carrinho de compras
- Dashboard

## Documentação da API

### Endpoint

- [Listar Todos os Produtos]("#listar-todos-os-produtos")
- [Cadastrar Produto]("#cadastrar-produto")
- [Detalhes do Produto]("#detalhes-do-produto")
- [Apagar Produto]("#apagar-produto")
- [Atualizar Produto]("#atualizar-produto")

### Listar Todas as Categorias dos Produtos

`GET` /categoriaproduto

Retorna um array com todos os produtos cadastrados

#### Exemplo de Resposta

```js
[
    {
        "id": 1,
        "nome": "Celulares",
        "icone": "celular",
    }
]
```

#### Código de Status

|código|descrição|
|------|---------|
|200|Os dados das categorias foram retornados com sucesso
|401|Acesso negado. Você deve se autenticar


### Cadastrar Categorias dos Produtos

`POST` /categoriaproduto 

Cria um novo produto com os dados enviados no corpo da requisição

#### Corpo de Requisição

```js
{
    "nome": "Celulares",
    "icone": "celular",
}
```

|campo|tipo|obrigatório|descrição|
|-----|----|-----------|---------|
|nome|string|sim|Um nome curto para o produto|
|icone|string|não| O nome do ícone de acordo com a biblioteca Material Icons|

#### Corpo da resposta

```js
{
    "id": 1,
    "nome": "Celulares",
    "icone": "celular",
}
```

#### Código de Status

|código|descrição|
|------|---------|
|201|A requisição foi bem sucedida e um novo recurso foi criado como resultado
|400|Dados enviados são inválidos. Verifique o corpo da requisição
|401|Acesso negado. Você deve se autenticar


### Detalhes das Categorias dos Produtos

`GET` /categoriaproduto/`{id}`

Retorna os detalhes do produto pelo `id` informado como parâmetro de PATH

#### Exemplo de Resposta

// requisição para /produto/1
{
    "id": 1,
    "nome": "Celulares",
    "icone": "celular",
}

#### Código de Status

|código|descrição|
|------|---------|
|200|Os dados das categorias foram retornados com sucesso
|401|Acesso negado. Você deve se autenticar
|404|Não existe categoria com o `id` informado 


### Apagar Categorias dos Produtos

`DELETE` /categoriaproduto/`{id}`

Apaga o produto com o `id` especificado no parâmetro de PATH

#### Código de Status

|código|descrição|
|------|---------|
|204|Categoria foi apagada com sucesso
|401|Acesso negado. Você deve se autenticar
|404|Não existe categoria com o `id` informado


### Atualizar Categorias dos Produtos

`PUT` /categoriaproduto/`{id}`

Altera os dados do produto especificada no `id`, utilizando as informações enviadas no corpo da requisição

#### Corpo da Requisição

|campo|tipo|obrigatório|descrição|
|-----|----|-----------|---------|
|nome|string|sim|Um nome curto para o produto|
|icone|string|não| O nome do ícone de acordo com a biblioteca Material Icons|

#### Código de Status

|código|descrição|
|------|---------|
|204|Categoria foi apagada com sucesso
|400|Acesso negado. Você deve se autenticar
|404|Não existe categoria com o `id` informado