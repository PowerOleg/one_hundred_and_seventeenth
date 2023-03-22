### 117 Intro - введение в маппинг. пример написания простых кнопок в html. которые в template. Библиотека THYMELEAF

маппинг, чтобы сервер не ругался
@RequestMapping(value = "/user/{id:[\\d]+}/name/{name}", method = RequestMethod.GET)


@ResponseBody	 это значит чтобы метод искал не return ""members/members";"
который возвращает страничку template.,а возвращал текст прямо клиенту


для GET запроса  несколькими параметрами /bar?id=100&name=Kolya
@RequestMapping(value = "/bar", params = {"id", "name"}, method = RequestMethod.GET)
public String users(
@RequestParam("id") long number)...


обработка нескольких адресов
@RequestMapping(value = {"/user", "/bar"}, method = RequestMethod.GET)

