package phonescreen.frenchcard;

import java.util.*;

public class Dealer {

    final Random rand = new Random();

    //Should be injected to help testing
    final ShuffleHelper shuffleHelper = new ShuffleHelper();

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        dealer.divide(13);
        dealer.divide(4);
        dealer.divide(1);
        dealer.divide(3);
    }

    public List<Person> divide(int numberOfPeople){
        validateInput(numberOfPeople, FrenchCard.MAX_VALUE);

        List<Person> personList = new ArrayList<>(numberOfPeople);

        //subList capability is used hence the concrete implementation
        ArrayList<FrenchCard> deck = createDeck();
        shuffleHelper.shuffle(deck);

        int step = FrenchCard.MAX_VALUE / numberOfPeople;

        for(int i = 0; i < deck.size(); i+=step){
            Person currentPerson = new Person();
            currentPerson.getCards().addAll(deck.subList(i, i+step));
            personList.add(currentPerson);
        }

        personList.stream().forEach( p -> System.out.println(p));
        generateSumReport(personList).entrySet().stream().forEach(entry ->
                System.out.println("Number of cards: " + entry.getKey().getCards().size()
                        + "/ Sum:" + entry.getValue()));

        return  personList;
    }

    /**
     * For now the number of cards has to be divisible by the number of people in the game
     * @param numberOfPeople
     * @param numberOfCards
     */
    private void validateInput(int numberOfPeople, int numberOfCards) {
        if(numberOfCards % numberOfPeople != 0){
            throw new IllegalArgumentException("For now the number of cards has " +
                    "to be divisible by the number of people in the game");
        }
    }

    public ArrayList<FrenchCard> createDeck(){
        ArrayList<FrenchCard> deck = new ArrayList<>(FrenchCard.MAX_VALUE);
        for(int i = 1; i <= FrenchCard.MAX_VALUE; i++){
            deck.add(new FrenchCard(i));
        }
        return deck;
    }

    public Map<Person, Integer> generateSumReport(List<Person> personCards){
        Map<Person, Integer> report = new HashMap<>();
        for(Person person: personCards){
            report.put(person,person.getCards().stream().mapToInt(card -> card.getValue()).sum());
        }

        return report;
    }
}
