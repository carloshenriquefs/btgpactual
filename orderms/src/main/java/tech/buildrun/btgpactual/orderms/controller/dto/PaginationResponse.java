package tech.buildrun.btgpactual.orderms.controller.dto;

public record PaginationResponse(Integer page,
                                 Integer pageSize,
                                 Integer totalElements,
                                 Integer totalPages) {
}
