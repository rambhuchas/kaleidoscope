package org.springframework.samples.petclinic.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class ValueAddedProduct implements Serializable {
	
}

/*@Entity
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String genre;
    private int age;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "author_book",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private Set<Book> books = new HashSet<>();

    public void addBook(Book book) {
        this.books.add(book);
        book.getAuthors().add(this);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
        book.getAuthors().remove(this);
    }

    public void removeBooks() {
        Iterator<Book> iterator = this.books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();

            book.getAuthors().remove(this);
            iterator.remove();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        return id != null && id.equals(((Author) obj).id);
    }

    @Override
    public int hashCode() {
        return 2021;
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", name=" + name
                + ", genre=" + genre + ", age=" + age + '}';
    }
}*/

/*@Entity  

https://howtoprogramwithjava.com/hibernate-group-by-using-criteria-query/

Let’s assume that we are taking care of Transactions at a Bank. The actual Transactions class could look like this:

import java.util.Date;  

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.Temporal;  
import javax.persistence.TemporalType;  
import javax.persistence.Version;  
  
import org.springframework.format.annotation.DateTimeFormat;  
  
public class Transactions  
{  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;  
  
    private Double amount;  
  
    @Column(name = "transaction_type")  
    private String transactionType;  
  
    @Column(name = "transaction_date")  
    @Temporal(TemporalType.TIMESTAMP)  
    @DateTimeFormat(style = "M-")  
    private Date transactionDate;  
  
    @Column(name = "account_id")  
    private Integer accountId;  
  
    public Integer getAccountId()  
    {  
        return accountId;  
    }  
  
    public void setAccountId(Integer accountId)  
    {  
        this.accountId = accountId;  
    }  
  
    public Long getId()  
    {  
        return this.id;  
    }  
  
    public void setId(Long id)  
    {  
        this.id = id;  
    }  
  
    public Double getAmount()  
    {  
        return this.amount;  
    }  
  
    public void setAmount(Double amount)  
    {  
        this.amount = amount;  
    }  
  
    public String getTransactionType()  
    {  
        return this.transactionType;  
    }  
  
    public void setTransactionType(String transactionType)  
    {  
        this.transactionType = transactionType;  
    }  
  
    public Date getTransactionDate()  
    {  
        return this.transactionDate;  
    }  
  
    public void setTransactionDate(Date transactionDate)  
    {  
        this.transactionDate = transactionDate;  
    }  
  
}  

It would be useful to know, for example, how many transactions are associated with each account. So let’s group together the information with the hopes of counting the number of transactions per account.


public List<GroupedTransactionsDTO> getTransactionsByAccount ()  
{  
    Session session = (Session) entityManager.getDelegate();  
    @SuppressWarnings("unchecked")  
List<GroupedTransactionsDTO> results = session.createCriteria(Transactions.class).setProjection(Projections.projectionList().add(Projections.groupProperty("accountId"), "accountId").add(Projections.rowCount(), "count"))  
            .setResultTransformer(Transformers.aliasToBean(GroupedTransactionsDTO.class))  
            .list();  
      
    return results;  
}  


public class GroupedTransactionsDTO  
{  
    private Integer accountId;  
  private Long count;  
    
    public Long getCount()  
    {  
        return count;  
    }  
  
    public void setCount(Long count)  
    {  
        this.count = count;  
    }  
  
    public Integer getAccountId()  
    {  
        return accountId;  
    }  
  
    public void setAccountId(Integer accountId)  
    {  
        this.accountId = accountId;  
    }  
    
} 
*/