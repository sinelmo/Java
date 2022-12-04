import java.util.Arrays;

.
.
.

  int[] intarr = {};
  String[] strarr = Arrays.stream(intarr) // array를 stream으로
                      .mapToObj(String::valueOf) // IntStream 을 stream으로 변환, String.valueOf() (Null PointerException(NPE)을 발생시키지 않고 "null" 처리)를 사용
                        .toArray(String[]::new) // Stream을 Array로 변환
