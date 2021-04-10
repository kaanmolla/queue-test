package com.kaan.queuetest.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Data
public class Content {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String documentId;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User owner;

  @Override
  public String toString() {
    return "Content{" +
        "id=" + id +
        ", documentId='" + documentId + '\'' +
        ", owner=" + owner +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Content content = (Content) o;
    return id.equals(content.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

}
