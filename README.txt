docker run -e DB_URL="jdbc:mysql://10.10.75.75/kuber" -e DB_USER="root" -e DB_PASSWORD="passwd00"  duzaporozhets/web-app:1.0
docker run -e MARIADB_ROOT_PASSWORD="passwd00" -p 3306:3306 -d duzaporozhets/db-app:1.0
