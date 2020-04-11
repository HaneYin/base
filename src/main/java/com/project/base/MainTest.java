package com.project.base;

import com.project.base.util.SnowflakeIdWorker;

public class MainTest {

    private static final String PRIVATE_KEY = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAJDdXG7Xr5PpddRW/00mwAspNCSjLAZHtuu7gzXtAJayf9MFvu4RA2AKGBp83BY3PmdhXSJ6uDin0QDHpS8lgvC8/i1SD/tJM5YNtNaZ6vaGXoDOQMqJqpvEA6vs81zeUav9V3RD8WAnkWgm/KN1OB6Xh/Xlnrhz6XLhxef1S/aJAgMBAAECgYAV5zJTnA7zCUiEi4bcbnB4/4jfxUAhzvQMXnSvUZ9WKbUD/glpS288NSqBzsEkJsQrs1/2l6GFB3KlcIo8P6q1aU8zOfSsSFL4HYHx+U5P7aflx8+vYR7KeZDPT+j0js9a9kkA4bwguNdz1Fwmry6e8oD5Z9Lya+cboo5BQJ6nAQJBAPpDBfpu34MLCKRQqlsX9i/RzXqVDVY/qwaH1Uo1sxTYH4W+LzQTd126fHcZybGzm9BdgGqXmPk0LneHOTYuW+ECQQCUL66Vw+2UurdNzEAAtZGv6u+Ht2/8GbMQBQAH4N1ITTIa9Hae1ojWcUs658IXFhaaa+bMbNRUMzmtIoBgMy+pAkB8PjoBknm0fQ3VRZbNkp/OLcJtUQJGB2XI4DarmO1HM+SyaTDWEbP4/FQ+bLcNWbXJRCI0yP5Q+e73uFJW670BAkBYDVUyDK/5dlFBWyKUyU7+Nx2JiUhzhlnOJQp1o/oY4jXpqmVp0JSSx9Mp91hvG2Lm80K7KdepCJ82749UmlWxAkBH+Lthrl3m0wj+i3jKRooQaKr7JQXlSoysrC11WN5NhomSPuMvGVu2JsLPxGnTCpGh3k1JB4kgOZTj1H23Gjma";

    private static final String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCQ3Vxu16+T6XXUVv9NJsALKTQkoywGR7bru4M17QCWsn/TBb7uEQNgChgafNwWNz5nYV0ierg4p9EAx6UvJYLwvP4tUg/7STOWDbTWmer2hl6AzkDKiaqbxAOr7PNc3lGr/Vd0Q/FgJ5FoJvyjdTgel4f15Z64c+ly4cXn9Uv2iQIDAQAB";


    public static void main(String[] args) throws Exception {
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        for (int i = 0; i < 1000; i++) {
            long id = idWorker.nextId();
            System.out.println(id);
        }
    }

}
