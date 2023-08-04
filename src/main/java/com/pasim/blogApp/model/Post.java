package com.pasim.blogApp.model;


//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.* ;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(		
		name="posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}		
		)
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "title",nullable = false )
	private String title;
	
	@Column(name = "description",nullable = false )
	private String description;
	
	@Column(name = "content",nullable = false )
	private String content ;
	
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Comment> comments = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
	

}
