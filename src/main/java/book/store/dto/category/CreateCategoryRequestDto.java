package book.store.dto.category;

import book.store.annotation.StartsWithCapital;

public record CreateCategoryRequestDto(
        @StartsWithCapital
        String name,
        @StartsWithCapital
        String description
) {
}
