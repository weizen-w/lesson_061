import java.util.Objects;

public class Student {

  String name;
  int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  @Override
  public String toString() {
    return name + " (score: " + score + ")";
  }

  @Override // если переопределяем compareTo, то надо переопределить equals
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Student other)) {
      return false;
    }
    return score == other.score && name.equals(other.name);
  }

  @Override // если переопределяем equals, то надо переопределить hashCode
  public int hashCode() {
    return Objects.hash(name, score);
  }
}
