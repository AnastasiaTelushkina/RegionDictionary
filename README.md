# RegionDictionary
Тестовое справочник регионов 

Создать приложение используя Spring Boot реализующее справочник регионов (свойства: идентификатор, наименование, сокращённое наименование), предоставляющее REST-API на чтение и изменение справочника, справочник должен храниться в БД в качестве ORM необходимо использовать Spring Data. Использовать встроенные БД и сервер приложений.

API:
  - GET /region - показать весь справочник
  - GET /region/id - найти регион в справочнике по id 
  - DELETE /region/id - удалить регион в справочнике по id 
  - PUT /region/id - обновить регион в справочнике по id, если id не найден добавить новый регион. 
  - POST /region - добавить в справочник
