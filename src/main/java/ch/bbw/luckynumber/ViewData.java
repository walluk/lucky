package ch.bbw.luckynumber;

/**
 * ViewData
 *    Daten für die Anzeige in der View.
 * @author Peter Rutschmann
 * @version 07.09.2021
 */
public class ViewData {
   private int primeNextTo;
   private int triangularNumberLimit;
   private String resultImageUrl;
   private String result;

   public ViewData() {
      this.primeNextTo = 0;
      this.triangularNumberLimit = 0;
      resultImageUrl = null;
      result = "";
   }

   public ViewData(int primeNextTo, int triangularNumberLimit, String resultImageUrl, String result) {
      this.primeNextTo = primeNextTo;
      this.triangularNumberLimit = triangularNumberLimit;
      this.resultImageUrl = resultImageUrl;
      this.result = result;
   }

   public int getPrimeNextTo() {
      return primeNextTo;
   }

   public void setPrimeNextTo(int primeNextTo) {
      this.primeNextTo = primeNextTo;
   }

   public int getTriangularNumberLimit() {
      return triangularNumberLimit;
   }

   public void setTriangularNumberLimit(int triangularNumberLimit) {
      this.triangularNumberLimit = triangularNumberLimit;
   }

   public String getResultImageUrl() {
      return resultImageUrl;
   }

   public void setResultImageUrl(String resultImageUrl) {
      this.resultImageUrl = resultImageUrl;
   }

   public String getResult() {
      return result;
   }

   public void setResult(String result) {
      this.result = result;
   }

   @Override
   public String toString() {
      return "ViewData{" +
            "primeNextTo=" + primeNextTo +
            ", triangularNumberLimit=" + triangularNumberLimit +
            ", resultImageUrl='" + resultImageUrl + '\'' +
            ", result='" + result + '\'' +
            '}';
   }
}
