# spring-boot-graphql
Repository for spring boot &amp; graphql demo application

## Select
query{
  getProducts{
    id
    name
    category
  }
}

## Select by id
query{
  getProduct(id: 3){
    id
    name
    category
  }
}


## Create
mutation{
  createProduct(name: "Marvel", category: "Movie") {
    id
  }
}

## Delete
mutation{
	deleteProduct(id: 2)
}
