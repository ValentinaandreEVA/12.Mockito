import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class filmManagerTest {
    @Test
    public void testFindAll() {
        filmsManager manager = new filmsManager();
        String films1 = "Гарри Поттер и Филосовский камень(2001)";
        String films2 = "Гарри Поттер и Тайная комната.(2002)";
        String films3 = "Гарри Поттер и узник Азкабана(2004)";
        String films4 = "Гарри Поттер и кубок Огня(2005)";
        String films5 = "Гарри Поттер и орден Феникса(2007)";
        String films6 = "Гарри Поттер и Принц-полукровка(2009)";


        manager.add(films1);
        manager.add(films2);
        manager.add(films3);
        String[] actual = manager.findAll();
        String[] expected = {films1, films2, films3};


        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindLastWhenLimitEqualsSize() {
        filmsManager manager = new filmsManager();
        String films1 = "Гарри Поттер и Филосовский камень(2001)";
        String films2 = "Гарри Поттер и Тайная комната.(2002)";
        String films3 = "Гарри Поттер и узник Азкабана(2004)";
        String films4 = "Гарри Поттер и кубок Огня(2005)";
        String films5 = "Гарри Поттер и орден Феникса(2007)";
        String films6 = "Гарри Поттер и Принц-полукровка(2009)";


        manager.add(films1);
        manager.add(films2);
        manager.add(films3);
        manager.add(films4);
        manager.add(films5);
        String[] actual = manager.findLast();
        String[] expected = {films5, films4, films3, films2, films1};


        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindLastWhenLimitMoreSize() {
        filmsManager manager = new filmsManager();
        String films1 = "Гарри Поттер и Филосовский камень(2001)";
        String films2 = "Гарри Поттер и Тайная комната.(2002)";
        String films3 = "Гарри Поттер и узник Азкабана(2004)";
        String films4 = "Гарри Поттер и кубок Огня(2005)";
        String films5 = "Гарри Поттер и орден Феникса(2007)";
        String films6 = "Гарри Поттер и Принц-полукровка(2009)";


        manager.add(films1);
        manager.add(films2);
        manager.add(films3);


        String[] actual = manager.findLast();
        String[] expected = {films3, films2, films1};


        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindLastWhenLimitLessSize() {
        filmsManager manager = new filmsManager();
        String films1 = "Гарри Поттер и Филосовский камень(2001)";
        String films2 = "Гарри Поттер и Тайная комната.(2002)";
        String films3 = "Гарри Поттер и узник Азкабана(2004)";
        String films4 = "Гарри Поттер и кубок Огня(2005)";
        String films5 = "Гарри Поттер и орден Феникса(2007)";
        String films6 = "Гарри Поттер и Принц-полукровка(2009)";


        manager.add(films1);
        manager.add(films2);
        manager.add(films3);
        manager.add(films4);
        manager.add(films5);
        manager.add(films6);


        String[] actual = manager.findLast();
        String[] expected = {films6, films5, films4, films3, films2};


        Assertions.assertArrayEquals(expected, actual);


    }


    @Test
    public void testFindLastWhenLimitEqualsLessSizeWithCustomLimit() {
        filmsManager manager = new filmsManager(3);
        String films1 = "Гарри Поттер и Филосовский камень(2001)";
        String films2 = "Гарри Поттер и Тайная комната.(2002)";
        String films3 = "Гарри Поттер и узник Азкабана(2004)";
        String films4 = "Гарри Поттер и кубок Огня(2005)";
        String films5 = "Гарри Поттер и орден Феникса(2007)";
        String films6 = "Гарри Поттер и Принц-полукровка(2009)";


        manager.add(films1);
        manager.add(films2);
        manager.add(films3);


        String[] actual = manager.findLast();
        String[] expected = {films3, films2, films1};


        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindLastWhenLimitLessSizeMoreWithCustomLimit() {
        filmsManager manager = new filmsManager(7);
        String films1 = "Гарри Поттер и Филосовский камень(2001)";
        String films2 = "Гарри Поттер и Тайная комната.(2002)";
        String films3 = "Гарри Поттер и узник Азкабана(2004)";
        String films4 = "Гарри Поттер и кубок Огня(2005)";
        String films5 = "Гарри Поттер и орден Феникса(2007)";
        String films6 = "Гарри Поттер и Принц-полукровка(2009)";


        manager.add(films1);
        manager.add(films2);
        manager.add(films3);
        manager.add(films4);
        manager.add(films5);


        String[] actual = manager.findLast();
        String[] expected = {films5, films4, films3, films2, films1};


        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindLastWhenLimitMoreSizeWithCustomLimit() {
        filmsManager manager = new filmsManager(3);
        String films1 = "Гарри Поттер и Филосовский камень(2001)";
        String films2 = "Гарри Поттер и Тайная комната.(2002)";
        String films3 = "Гарри Поттер и узник Азкабана(2004)";
        String films4 = "Гарри Поттер и кубок Огня(2005)";
        String films5 = "Гарри Поттер и орден Феникса(2007)";
        String films6 = "Гарри Поттер и Принц-полукровка(2009)";


        manager.add(films1);
        manager.add(films2);
        manager.add(films3);
        manager.add(films4);
        manager.add(films5);
        manager.add(films6);


        String[] actual = manager.findLast();
        String[] expected = {films6, films5, films4};


        Assertions.assertArrayEquals(expected, actual);
    }
}