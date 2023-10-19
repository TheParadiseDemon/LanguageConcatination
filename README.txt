Код написан на языке Java в программе VS Code.

Класс Language 
Содержит поля для хранения двух языков, которые в дальнейшем будут конкатенироваться методами.

language1 - массив строк, язык, что будет первым операндом. Для задания первого языка
использовать метод SetLanguage1, который на вход принимает массив строк.

language1 - массив строк, язык, что будет вторым операндом. Для задания второго языка
использовать метод SetLanguage2, который на вход принимает массив строк.

Конкатенация будет произведена после вызова метода Concatination, не имеющего
параметров.

Для получения результата конкатенации нужно вызвать метод GetConcatinationResult,
который вернёт массив строк, являющимся результатом конкатенации.

Для тестирования достаточно менять входные параметры методов SetLanguage
в 38 и 39 строках

Тесты:
1) Вход:
"Java", "C++", "Python"
"JavaScript", "Pascal", "BrainFuck"
Выход:
JavaJavaScript
JavaPascal
JavaBrainFuck
C++JavaScript
C++Pascal
C++BrainFuck
PythonJavaScript
PythonPascal
PythonBrainFuck

2) Вход:
"11", "123", "1111111111111"
"30303030303030303", "3030303030303003", "303030303030303"
Выход:
1130303030303030303
113030303030303003
11303030303030303
12330303030303030303
1233030303030303003
123303030303030303
111111111111130303030303030303
11111111111113030303030303003
1111111111111303030303030303

3) Вход:
"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38"
"a", "b", "c", "d", "e", "f", "g", "e", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
Выход:
1a 1b 1c 1d 1e 1f 1g 1e 1h 1i 1j 1k 1l 1m 1n 1o 1p 1q 1r 1s 1t 1u 1v 1w 1x 1y 1z 2a 2b 2c 2d 2e 2f 2g 2e 2h 2i 2j 2k 2l 2m 2n 2o 2p 2q 2r 2s 2t 2u 2v 2w 2x 2y 2z 3a 3b 3c 3d 3e 3f 3g 3e 
3h 3i 3j 3k 3l 3m 3n 3o 3p 3q 3r 3s 3t 3u 3v 3w 3x 3y 3z 4a 4b 4c 4d 4e 4f 4g 4e 4h 4i 4j 4k 4l 4m 4n 4o 4p 4q 4r 4s 4t 4u 4v 4w 4x 4y 4z 5a 5b 5c 5d 5e 5f 5g 5e 5h 5i 5j 5k 5l 5m 5n 5o 
5p 5q 5r 5s 5t 5u 5v 5w 5x 5y 5z 6a 6b 6c 6d 6e 6f 6g 6e 6h 6i 6j 6k 6l 6m 6n 6o 6p 6q 6r 6s 6t 6u 6v 6w 6x 6y 6z 7a 7b 7c 7d 7e 7f 7g 7e 7h 7i 7j 7k 7l 7m 7n 7o 7p 7q 7r 7s 7t 7u 7v 7w 
7x 7y 7z 8a 8b 8c 8d 8e 8f 8g 8e 8h 8i 8j 8k 8l 8m 8n 8o 8p 8q 8r 8s 8t 8u 8v 8w 8x 8y 8z 9a 9b 9c 9d 9e 9f 9g 9e 9h 9i 9j 9k 9l 9m 9n 9o 9p 9q 9r 9s 9t 9u 9v 9w 9x 9y 9z 10a 10b 10c 10d 
10e 10f 10g 10e 10h 10i 10j 10k 10l 10m 10n 10o 10p 10q 10r 10s 10t 10u 10v 10w 10x 10y 10z 11a 11b 11c 11d 11e 11f 11g 11e 11h 11i 11j 11k 11l 11m 11n 11o 11p 11q 11r 11s 11t 11u 11v 11w 
11x 11y 11z 12a 12b 12c 12d 12e 12f 12g 12e 12h 12i 12j 12k 12l 12m 12n 12o 12p 12q 12r 12s 12t 12u 12v 12w 12x 12y 12z 13a 13b 13c 13d 13e 13f 13g 13e 13h 13i 13j 13k 13l 13m 13n 13o 13p 
13q 13r 13s 13t 13u 13v 13w 13x 13y 13z 14a 14b 14c 14d 14e 14f 14g 14e 14h 14i 14j 14k 14l 14m 14n 14o 14p 14q 14r 14s 14t 14u 14v 14w 14x 14y 14z 15a 15b 15c 15d 15e 15f 15g 15e 15h 15i 
15j 15k 15l 15m 15n 15o 15p 15q 15r 15s 15t 15u 15v 15w 15x 15y 15z 16a 16b 16c 16d 16e 16f 16g 16e 16h 16i 16j 16k 16l 16m 16n 16o 16p 16q 16r 16s 16t 16u 16v 16w 16x 16y 16z 17a 17b 17c 
17d 17e 17f 17g 17e 17h 17i 17j 17k 17l 17m 17n 17o 17p 17q 17r 17s 17t 17u 17v 17w 17x 17y 17z 18a 18b 18c 18d 18e 18f 18g 18e 18h 18i 18j 18k 18l 18m 18n 18o 18p 18q 18r 18s 18t 18u 18v 
18w 18x 18y 18z 19a 19b 19c 19d 19e 19f 19g 19e 19h 19i 19j 19k 19l 19m 19n 19o 19p 19q 19r 19s 19t 19u 19v 19w 19x 19y 19z 20a 20b 20c 20d 20e 20f 20g 20e 20h 20i 20j 20k 20l 20m 20n 20o 
20p 20q 20r 20s 20t 20u 20v 20w 20x 20y 20z 21a 21b 21c 21d 21e 21f 21g 21e 21h 21i 21j 21k 21l 21m 21n 21o 21p 21q 21r 21s 21t 21u 21v 21w 21x 21y 21z 22a 22b 22c 22d 22e 22f 22g 22e 22h 
22i 22j 22k 22l 22m 22n 22o 22p 22q 22r 22s 22t 22u 22v 22w 22x 22y 22z 23a 23b 23c 23d 23e 23f 23g 23e 23h 23i 23j 23k 23l 23m 23n 23o 23p 23q 23r 23s 23t 23u 23v 23w 23x 23y 23z 24a 24b 
24c 24d 24e 24f 24g 24e 24h 24i 24j 24k 24l 24m 24n 24o 24p 24q 24r 24s 24t 24u 24v 24w 24x 24y 24z 25a 25b 25c 25d 25e 25f 25g 25e 25h 25i 25j 25k 25l 25m 25n 25o 25p 25q 25r 25s 25t 25u 
25v 25w 25x 25y 25z 26a 26b 26c 26d 26e 26f 26g 26e 26h 26i 26j 26k 26l 26m 26n 26o 26p 26q 26r 26s 26t 26u 26v 26w 26x 26y 26z 27a 27b 27c 27d 27e 27f 27g 27e 27h 27i 27j 27k 27l 27m 27n 
27o 27p 27q 27r 27s 27t 27u 27v 27w 27x 27y 27z 28a 28b 28c 28d 28e 28f 28g 28e 28h 28i 28j 28k 28l 28m 28n 28o 28p 28q 28r 28s 28t 28u 28v 28w 28x 28y 28z 29a 29b 29c 29d 29e 29f 29g 29e 
29h 29i 29j 29k 29l 29m 29n 29o 29p 29q 29r 29s 29t 29u 29v 29w 29x 29y 29z 30a 30b 30c 30d 30e 30f 30g 30e 30h 30i 30j 30k 30l 30m 30n 30o 30p 30q 30r 30s 30t 30u 30v 30w 30x 30y 30z 31a 
31b 31c 31d 31e 31f 31g 31e 31h 31i 31j 31k 31l 31m 31n 31o 31p 31q 31r 31s 31t 31u 31v 31w 31x 31y 31z 32a 32b 32c 32d 32e 32f 32g 32e 32h 32i 32j 32k 32l 32m 32n 32o 32p 32q 32r 32s 32t 
32u 32v 32w 32x 32y 32z 33a 33b 33c 33d 33e 33f 33g 33e 33h 33i 33j 33k 33l 33m 33n 33o 33p 33q 33r 33s 33t 33u 33v 33w 33x 33y 33z 34a 34b 34c 34d 34e 34f 34g 34e 34h 34i 34j 34k 34l 34m 
34n 34o 34p 34q 34r 34s 34t 34u 34v 34w 34x 34y 34z 35a 35b 35c 35d 35e 35f 35g 35e 35h 35i 35j 35k 35l 35m 35n 35o 35p 35q 35r 35s 35t 35u 35v 35w 35x 35y 35z 36a 36b 36c 36d 36e 36f 36g 
36e 36h 36i 36j 36k 36l 36m 36n 36o 36p 36q 36r 36s 36t 36u 36v 36w 36x 36y 36z 37a 37b 37c 37d 37e 37f 37g 37e 37h 37i 37j 37k 37l 37m 37n 37o 37p 37q 37r 37s 37t 37u 37v 37w 37x 37y 37z 
38a 38b 38c 38d 38e 38f 38g 38e 38h 38i 38j 38k 38l 38m 38n 38o 38p 38q 38r 38s 38t 38u 38v 38w 38x 38y 38z


