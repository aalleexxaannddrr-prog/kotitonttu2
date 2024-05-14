# Kotitonttu: серверная часть приложения для отопительных систем
<p align="center">
  <img src="./logo.png" alt="Логотип">
</p>
## Реализация JWT с Spring Boot 3 и Spring Security 6

Этот репозиторий демонстрирует проект, который демонстрирует реализацию 
JSON Web Tokens (JWT) с Spring Boot 3 и Spring Security 6. 
Проект включает в себя следующие функциональности:

- Регистрация пользователя и вход в систему с аутентификацией по JWT
- Токен обновления хранится в базе данных
- Авторизация на основе ролей с разрешениями
- Настроенная обработка отказа в доступе
- Интеграция документации OpenAPI (Swagger)

## Стек технологий

- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green) Spring Boot 3
- ![Spring Security](https://img.shields.io/badge/Spring%20Security-blue) Spring Security
- ![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-orange) Spring Data JPA
- ![Пользовательская валидация Spring Boot](https://img.shields.io/badge/Custom%20Validation-yellow) Пользовательская валидация Spring Boot
- ![JWT](https://img.shields.io/badge/JWT-red) JSON Web Tokens (JWT)
- ![BCrypt](https://img.shields.io/badge/BCrypt-purple) BCrypt
- ![Maven](https://img.shields.io/badge/Maven-blueviolet) Maven
- ![OpenAPI](https://img.shields.io/badge/OpenAPI-lightgrey) OpenAPI (SpringDoc Impl)
- ![Lombok](https://img.shields.io/badge/Lombok-darkblue) Lombok

## Начало работы
Чтобы начать работу с этим проектом, вам нужно будет установить следующее на своем локальном компьютере:
- JDK 17+
- Maven 3+
## Перезапуск удаленного сервера
1. Открыть окошко с командой одновременно нажмите клавишу Windows и кнопку R
2. Наберите в строке cmd, а затем зажмите комбинацию Ctrl+Shift+Enter
3. Входим на сервер через команду:
```bash
ssh root@31.129.102.70
```
4. Потом попросит пароль, вводим:
```bash
Qq13037613!
```
6. Перезапускаем сервер:
```bash
cd kotitonttu
sh shutdown.sh
tail -f log.txt
ctrl + c
cd ~
rm -r kotitonttu
git clone https://github.com/Kichmarevitmo/kotitonttu.git
cd kotitonttu
mvn wrapper:wrapper
./mvnw spring-boot:run
ctrl + c
sh startup.sh
tail -f log.txt
ctrl + c
exit
```
# Build and run the Project
- Build the project: `mvn clean install`
- Run the project: `mvn spring-boot:run`

The application will be available at http://localhost:8086.

# Тестирование посредством Postman 
## User registration endpoint

`POST http://localhost:8086/api/v1/auth/register`

![register](register.PNG)

For detailed documentation and testing of the APIs, access the Swagger UI by visiting:
```
http://localhost:8086/swagger-ui.html
```
