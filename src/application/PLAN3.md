### Описание тестовых данных

1) логин и пароль:
   1) правильный логин, правильный пароль ```-> 0```
   2) правильный логин, правильный пароль, перепутанные местами ```-> 0```
   3) неправильный логин, правильный пароль ```-> 3```
   4) неверный формат логина, правильный пароль ```-> 2```
   5) правильный логин, неправильный пароль ```-> 4```
2) логин, пароль, роль, ресурс:
   1) корректная роль, корректный ресурс ```-> 0```
   2) корректная роль, корректный ресурс, перепутанные местами ```-> 0```
   3) неизвестная роль, корректный ресурс ```-> 5```
   4) некорректная роль, корректный ресурс ```-> 6```
   5) корректная роль, невалидный ресурс ```-> 6```
3) логин, пароль, роль, ресурс, дата начала, дата конца, объем:
   1) корректная дата начала, корректная дата конца, корректный объем ```-> 0```
   2) корректная дата начала, корректная дата конца, корректный объем, перепутанные местами ```-> 0```
   3) некорректный формат даты начала, корректная дата конца, корректный объем ```-> 7```
   4) корректная дата начала, некорректный формат даты конца, корректный объем ```-> 7```
   5) даты не соответствую условию: дата начала >= даты конца, корректный объем ```-> 7```
   6) корректная дата начала, корректная дата конца, неверный формат объема ```-> 7```
4) логин, пароль, роль, ресурс, дата начала, дата конца, объем, справка:
   1) логин, пароль, роль, ресурс, дата начала, дата конца, объем, справка ```-> 1```
   2) логин, пароль, роль, ресурс, дата начала, дата конца, объем, справка, перепутанные местами ```-> 1```
5) справка:
   1) справка ```-> 1```
   2) пустые аргументы ```-> 1```