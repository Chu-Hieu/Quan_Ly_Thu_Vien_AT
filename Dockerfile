FROM tomcat:latest

COPY ./QuanLyThuVien.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
