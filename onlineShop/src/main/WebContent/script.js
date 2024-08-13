fetch('/api/products')
    .then(response => response.json())
    .then(products => {
        const productList = document.getElementById('product-list');
        products.forEach(product => {
            const li = document.createElement('li');
            li.innerHTML = `<a href="/product-details.html?id=${product.id}">${product.name}</a>`;
            productList.appendChild(li);
        });
    });