package Lesson5;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.dto.ProductDto;
import retrofit2.Response;

import java.util.List;

import static org.utils.RetrofitUtils.getProductService;

public class GetProductListTest {
    @SneakyThrows
    @Test
    void getProducts() {
        Response<List<ProductDto>> response = getProductService()
                .getProducts()
                .execute();
        Assertions.assertTrue(response.isSuccessful());
        Assertions.assertTrue(response.body().size() > 0);
    }
}

