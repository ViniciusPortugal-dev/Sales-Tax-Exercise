import javax.persistence.*;

@Entity
@Table(name = "receipts")
public class ReceiptEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String output;

    public ReceiptEntity(String output) {
        this.output = output;
    }

    public ReceiptEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
