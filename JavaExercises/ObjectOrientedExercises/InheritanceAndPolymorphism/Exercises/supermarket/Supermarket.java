package supermarket;

import java.util.Objects;

/**
 *
 * @author vimago
 */
public class Supermarket {

    private String name;
    private String nif;
    private Article[] articles;
    private int maxArticles;
    private int numArticles;

    public Supermarket(String name, String nif, int maxArticles) {
        this.name = name;
        this.nif = nif;
        this.maxArticles = maxArticles;
        this.articles = new Article[maxArticles];
        this.numArticles = 0;
    }

    public String getName() {
        return name;
    }

    public String getNif() {
        return nif;
    }

    public Article[] getArticles() {
        return articles;
    }

    public int getMaxArticles() {
        return maxArticles;
    }

    public int getNumArticles() {
        return numArticles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumArticles(int numArticles) {
        this.numArticles = numArticles;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Supermarket other = (Supermarket) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supermarket{");
        sb.append("name=").append(name);
        sb.append(", nif=").append(nif);
        sb.append(", articles=").append(articles);
        sb.append(", maxArticles=").append(maxArticles);
        sb.append(", numArticles=").append(numArticles);
        sb.append('}');
        return sb.toString();
    }



    public Article searchArticle(String EAN, Article[] articles) {
        Article articleFound = null;
        for (int i = 0; i < numArticles; i++) {
            if (articles[i].getEanCode().equals(EAN)) {
                articleFound = articles[i];
            }
        }
        return articleFound;
    }

    public void deleteArticle(String EAN, Article[] articles) {
        for (int i = 0; i < numArticles; i++) {
            if (articles[i].getEanCode().equals(EAN)) {
                articles[i] = null;
                numArticles--;
                System.out.println("Article successfully deleted.");
            } else {
                System.out.println("Article unsuccessfully deleted.");
            }
        }
    }
    
    /**
     * Adds an article to the array of articles
     * @param articleToAdd the article to add that the user fill
     * @param articles the array of articles that the supermarket has
     * @return true if the article has added, false if it didn't
     */
    boolean addArticle(Article articleToAdd, Article[] articles) {
        boolean success = false;
        if(numArticles < maxArticles) {
        articles[numArticles] = articleToAdd;
        numArticles++;
        success = true;
        }
        return success;
    }

}
