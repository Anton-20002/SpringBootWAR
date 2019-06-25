package logic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class TomcatController {

  @GetMapping("/hello")
  public List<String> sayHello() {
    return IntStream.range(0, 10).mapToObj(p -> "Hello World: " + p).collect(Collectors.toList());
  }
}
