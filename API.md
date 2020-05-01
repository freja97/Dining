# API
### Get the list of products
> GET \
> /sellweb/buyer/product/list
```
{
    "code": 0,
    "msg": "success",
    "data": [
        {
            "name": "noodles",
            "type": 1,
            "foods": [
                {
                    "id": "123",
                    "name": "tomato pasta",
                    "price": 10.99,
                    "description": "delicious pasta",
                    "icon": "http://xxx.com",
                }
            ]
        },
        {
            "name": "pizza",
            "type": 5,
            "foods": [
                {
                    "id": "124",
                    "name": "tomato pizza",
                    "price": 12.99,
                    "description": "smell so good",
                    "icon": "http://xxx.com",
                }
            ]
        }
    ]
}
```