package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("hitler")) {
            return "Adolf Hitler (20 April 1889 – 30 April 1945) was " +
                    "a German politician and leader of the Nazi Party (Nationalsozialistische Deutsche Arbeiterpartei; " +
                    "NSDAP). He rose to power as the chancellor of Germany in 1933, and as Führer in 1934. During his" +
                    " dictatorship from 1933 to 1945, he initiated World War II in Europe by invading Poland on " +
                    "1 September 1939";
        }
        return "";
    }

}
