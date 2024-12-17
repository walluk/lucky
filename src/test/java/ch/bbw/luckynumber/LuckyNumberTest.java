package ch.bbw.luckynumber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LuckyNumberTest {

   @Test
   void singleDice() {
      LuckyNumber generator = new LuckyNumber();
      int value = generator.singleDice();
      System.out.println("LuckyNumberTest.singleDice " + value);

      assertTrue(value >= 1);
      assertTrue(value <= 6);
   }

   @Test
   void doubleDice() {
      LuckyNumber generator = new LuckyNumber();
      List<Integer> list = generator.doubleDice();
      System.out.println("LuckyNumberTest.doubleDice " + list);

      assertTrue(list.size() == 2);
      assertTrue(list.get(0) >= 1);
      assertTrue(list.get(0) <= 6);
      assertTrue(list.get(1) >= 1);
      assertTrue(list.get(1) <= 6);
   }

   @Test
   void trueOrFalse() {
      LuckyNumber generator = new LuckyNumber();
      Boolean value = generator.trueOrFalse();
      System.out.println("LuckyNumberTest.trueOrFalse " + value);

      assertTrue((value == true) || (value == false));
      //Hmm dieser Test mach irgendwie wenig Sinn, ausser wenn ich prüfen will, ob die Methode durchläuft.
   }

   @Test
   void sixLottoNumbers() {
      LuckyNumber generator = new LuckyNumber();
      Set<Integer> set = generator.sixLottoNumbers();
      System.out.println("LuckyNumberTest.sixLottoNumbers " + set);

      assertTrue(set.size() == 6);
      for (Integer value: set){
         System.out.println("LuckyNumberTest.sixLottoNumbers: value: " + value);
         assertTrue(value >= 1);
         assertTrue(value <= 42);
      }
   }

   @Test
   void playingCard() {
      LuckyNumber generator = new LuckyNumber();
      String card = generator.playingCard();
      System.out.println("LuckyNumberTest.playingCard " + card);
      String[] values = card.split(", ");

      assertTrue(values[0].contains("Rot") || values[0].contains("Schwarz"));

      assertTrue(values[1].equals("Herz") || values[1].equals("Karo")
            || values[1].equals("Pik") || values[1].equals("Kreuz"));

      int number = Integer.parseInt(values[2]);
      assertTrue(number >=2);
      assertTrue(number <=10);
   }

   @Test
   void primeUpTo100() {
      LuckyNumber generator = new LuckyNumber();
      List<Integer> list = generator.primeUpTo100();
      System.out.println("LuckyNumberTest.primeUpTo100 " + list);
      List<Integer> expected = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
      assertTrue(list.equals(expected));
   }

   @Test
   void primeNextTo10() {
      LuckyNumber generator = new LuckyNumber();
      Integer value = generator.primeNextTo(10);
      System.out.println("LuckyNumberTest.primeNextT10o " + value);
      assertTrue(value == 7);
   }

   void primeNextTo20() {
      LuckyNumber generator = new LuckyNumber();
      Integer value = generator.primeNextTo(20);
      System.out.println("LuckyNumberTest.primeNextTo20 " + value);
      assertTrue(value == 19);
   }

   @Test
   void triangleNumbersUpTo() {
      LuckyNumber generator = new LuckyNumber();
      List<Integer> list = generator.triangleNumbersUpTo(10);
      System.out.println("LuckyNumberTest.triangleNumbersUpTo " + list);
      List<Integer> expected = List.of(1, 3, 6, 10, 15, 21, 28, 36, 45, 55);
      assertTrue(list.equals(expected));
   }
}